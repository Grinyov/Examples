package thread.exception;

/**
 * Created by Grinyov Vitaliy on 25.08.15.
 *
 * генерация исключения в потоке main
 *
 *
 * если основной поток прекратит свое
 выполнение из-за необработанного исключения, то это не скажется на работо-
 способности порожденного им потока.
 */
public class SimpleThread extends Thread {
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.err.print(e);
        }
        System.out.println("end of SimpleThread");
    }
}