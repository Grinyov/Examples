package thread.atomic;

import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by Grinyov Vitaliy on 25.08.15.
 *
 * класс с атомарным полем
 *
 *
 * Пусть имеется некоторая торговая площадка, представленная классом
 Market, работающая в непрерывном режиме и информирующая о разнона-
 правленных изменениях биржевого индекса (поле index типа AtomicLong)
 дважды за один цикл с интервалом до 500 миллисекунд. Изменения поля index
 фиксируются методом addAndGet(long delta) атомарного добавления пере-
 данного значения к текущему.
 */
public class Market extends Thread {
    private AtomicLong index;
    public Market(AtomicLong index) {
        this.index = index;
    }
    public AtomicLong getIndex() {
        return index;
    }
    @Override
    public void run() {
        Random random = new Random();
        try {
            while (true) {
                index.addAndGet(random.nextInt(10));
                Thread.sleep(random.nextInt(500));
                index.addAndGet(-1 * random.nextInt(10));
                Thread.sleep(random.nextInt(500));
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
