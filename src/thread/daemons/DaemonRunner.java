package thread.daemons;

/**
 * Created by Grinyov Vitaliy on 25.08.15.
 */
public class DaemonRunner {
    public static void main(String[] args) {
        SimpleThread usual = new SimpleThread();
        SimpleThread daemon = new SimpleThread();
        daemon.setDaemon(true);
        daemon.start();
        usual.start();
        System.out.println("последний оператор main");
    }
}