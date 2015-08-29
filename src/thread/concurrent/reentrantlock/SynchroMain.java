package thread.concurrent.reentrantlock;

import java.util.concurrent.TimeUnit;

/**
 * Created by green on 30.08.2015.
 *
 * запуск процессов доступа к ресурсу
 *
 * результат с пустыми скобками свидетельствует, что попыток изъятия пар было
 больше, чем попыток добавления. Нерезультативные попытки не фиксировались.
 *
 */
public class SynchroMain {
    public static void main(String[ ] args) throws InterruptedException {
        for (int i = 0; i < 5; i++) {
            DoubleResource resource = new DoubleResource();
            new ResThread("a", resource).start();
            new ResThread("Z", resource).start();
            new ResThread("#", resource).start();
            TimeUnit.MILLISECONDS.sleep(1_000);
            System.out.println(resource);
        }
    }
}
