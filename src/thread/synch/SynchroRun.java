package thread.synch;

import java.io.IOException;

/**
 * Created by Grinyov Vitaliy on 25.08.15.
 *
 *
 * Код построен таким образом, что при отключении синхронизации метода
 writing() в случае его вызова одним потоком другой поток может вклиниться
 и произвести запись своей информации, несмотря на то, что метод не завершил
 запись, инициированную первым потоком.
 */
public class SynchroRun {
    public static void main(String[ ] args) {
        Resource s = null;
        try {
            s = new Resource ("data\\result.txt");
            SyncThread t1 = new SyncThread("First", s);
            SyncThread t2 = new SyncThread("Second", s);
            t1.start();
            t2.start();
            t1.join();
            t2.join();
        } catch (IOException e) {
            System.err.print("ошибка файла: " + e);
        } catch (InterruptedException e) {
            System.err.print("ошибка потока: " + e);
        } finally {
            s.close();
        }
    }
}
