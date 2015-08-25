package thread.atomic;

/**
 * Created by Grinyov Vitaliy on 25.08.15.
 *
 * получатель значения атомарного поля
 *
 * Имеется класс Broker, запрашивающий значение поля index с некоторым
 интервалом в миллисекундах.
 */
public class Broker extends Thread {
    private Market market;
    private static final int PAUSE = 500; // in millis
    public Broker(Market market) {
        this.market = market;
    }
    @Override
    public void run() {
        try {
            while (true) {
                System.out.println("Current index: " + market.getIndex());
                Thread.sleep(PAUSE);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
