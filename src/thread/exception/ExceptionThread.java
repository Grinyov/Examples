package thread.exception;

/**
 * Created by Grinyov Vitaliy on 25.08.15.
 *
 * генерация исключения в созданном потоке
 *
 * В процессе функционирования потоки являются в общем случае независи-
 мыми друг от друга. Прямым следствием такой независимости будет коррект-
 ное продолжение работы потока main после аварийной остановки запущенно-
 го из него потока после генерации исключения.
 */
public class ExceptionThread extends Thread {
    public void run() {
        boolean flag = true;
        if (flag) {
            throw new RuntimeException();
        }
        System.out.println("end of ExceptThread");
    }
}
