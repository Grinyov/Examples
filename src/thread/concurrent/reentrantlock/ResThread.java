package thread.concurrent.reentrantlock;

import java.util.Random;

/**
 * Created by green on 30.08.2015.
 *
 * поток доступа к ресурсу
 *
 */
public class ResThread extends Thread {
    private DoubleResource resource;
    public ResThread(String name, DoubleResource rs) {
        super(name);
        resource = rs;
    }
    public void run() {
        for (int i = 1; i < 4; i++) {
            if (new Random().nextInt(2) > 0) {
                resource.adding(getName(), i);
            } else {
                resource.deleting();
            }
        }
    }

}
