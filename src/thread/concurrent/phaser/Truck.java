package thread.concurrent.phaser;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.Phaser;
/**
 * Created by green on 30.08.2015.
 *
 * Поток
 *
 * Более сложное поведение этого синхронизатора Phaser напоминает поведе-
 ние CyclicBarrier, однако число участников синхронизации может меняться.
 Участвующие стороны сначала должны зарегистрироваться phaser-объектом. Регистрация
 осуществляется с помощью методов register(), bulkRegister(int parties)
 или подходящего конструктора. Выход из синхронизации phaser-объектом про-
 изводит метод arriveAndDeregister(), причем выход из числа синхронизируе-
 мых сторон может быть и в случае, когда поток завершил выполнение, и в слу-
 чае, когда поток все еще выполняется. Основным назначением класса Phaser
 является синхронизация потоков, выполнение которых требуется разбить на от-
 дельные этапы (фазы), а эти фазы, в свою очередь, необходимо синхронизо-
 вать. Phaser может как задержать поток, пока другие потоки не достигнут конца
 текущей фазы методом arriveAndAwaitAdvance(), так и пропустить поток, от-
 метив лишь окончание какой-либо фазы методом arrive().
 */
public class Truck implements Runnable {
    private Phaser phaser;
    private String number;
    private int capacity;
    private Storage storafeFrom;
    private Storage storageTo;
    private Queue<Item> bodyStorage;
    public Truck(Phaser phaser, String name, int capacity, Storage stFrom,
                 Storage stTo) {
        this.phaser = phaser;
        this.number = name;
        this.capacity = capacity;
        this.bodyStorage = new ArrayDeque<Item>(capacity);
        this.storafeFrom = stFrom;
        this.storageTo = stTo;
        this.phaser.register();
    }
    public void run() {
        loadTruck();
        phaser.arriveAndAwaitAdvance();
        goTruck();
        phaser.arriveAndAwaitAdvance();
        unloadTruck();
        phaser.arriveAndDeregister();
    }
    private void loadTruck() {
        for (int i = 0; i < capacity; i++) {
            Item g = storafeFrom.getGood();
            if (g == null) { // если в хранилище больше нет товара,
// загрузка грузовика прерывается
                return;
            }
            bodyStorage.add(g);
            System.out.println("Грузовик " + number + " загрузил товар №"
                    + g.getRegistrationNumber());
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    private void unloadTruck() {
        int size = bodyStorage.size();
        for (int i = 0; i < size; i++) {
            Item g = bodyStorage.poll();
            storageTo.setGood(g);
            System.out.println("Грузовик " + number + " разгрузил товар №"
                    + g.getRegistrationNumber());
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    private void goTruck() {
        try {
            Thread.sleep(new Random(100).nextInt(500));
            System.out.println("Грузовик " + number + " начал поездку.");
            Thread.sleep(new Random(100).nextInt(1000));
            System.out.println("Грузовик " + number + " завершил поездку.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
