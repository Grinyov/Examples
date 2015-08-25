package thread.priority;

/**
 * Created by Grinyov Vitaliy on 25.08.15.
 *
 * демонстрация приоритетов
 *
 * Потоку можно назначить приоритет от 1 (константа MIN_PRIORITY)
 до 10 (MAX_PRIORITY) с помощью метода setPriority(int prior). Получить
 значение приоритета потока можно с помощью метода getPriority().
 */
public class PriorThread extends Thread {
    public PriorThread(String name) {
        super(name);
    }
    public void run() {
        for (int i = 0; i < 71; i++) {
            System.out.println(getName() + " " + i);
            try {
                Thread.sleep(1); // попробовать sleep(0),sleep(10)
            } catch (InterruptedException e) {
                System.err.print(e);
            }
        }
    }
}