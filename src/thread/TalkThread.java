package thread;

/**
 * Created by Grinyov Vitaliy on 25.08.15.
 *
 * расширение класса Thread
 *
 * Существует два способа создания и запуска потока:
 на основе расширения класса Thread или реализации интерфейса Runnable.
 */
public class TalkThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Talking");
            try {
                Thread.sleep(7); // остановка на 7 миллисекунд
            } catch (InterruptedException e) {
                System.err.print(e);
            }
        }
    }
}
