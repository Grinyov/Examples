package thread.atomic;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by Grinyov Vitaliy on 25.08.15.
 *
 * запуск потоков изменения атомарного поля и его отслеживания несколькими
 потоками
 *
 * Количество экземпляров класса Broker может быть любым, и они постоян-
 но с заданным интервалом запрашивают текущее значение index
 */
public class AtomicDemo {
    private static final int NUMBER_BROKERS = 30;
    public static void main(String[ ] args) {
        Market market = new Market(new AtomicLong(100));
        market.start();
        for (int i = 0; i < NUMBER_BROKERS; i++) {
            new Broker(market).start();
        }
    }
}
