package thread;

/**
 * Created by Grinyov Vitaliy on 25.08.15.
 *
 * реализация интерфейса Runnable
 *
 * Интерфейс Runnable не имеет метода start(), а только единственный метод
 run(). Поэтому для запуска такого потока, как WalkRunnable следует создать
 экземпляр класса Thread с передачей экземпляра WalkRunnable его конструк-
 тору. Однако при прямом вызове метода run() поток не запустится, выполнится
 только тело самого метода.
 */
public class WalkRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Walking");
            try {
                Thread.sleep(7);
            } catch (InterruptedException e) {
                System.err.println(e);
            }
        }
    }
}
