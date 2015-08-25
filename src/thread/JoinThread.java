package thread;

/**
 * Created by Grinyov Vitaliy on 25.08.15.
 *
 * задержка потока
 *
 * Приостановить (задержать) выполнение потока можно с помощью метода
 sleep(int millis) класса Thread. Менее надежный альтернативный способ состо-
 ит в вызове метода yield(), который может сделать некоторую паузу и позволя-
 ет другим потокам начать выполнение своей задачи. Метод join() блокирует
 работу потока, в котором он вызван, до тех пор, пока не будет закончено выпол-
 нение вызывающего метод потока или не истечет время ожидания при обраще-
 нии к методу join(long timeout).
 */
class JoinThread extends Thread {
    public JoinThread (String name) {
        super(name);
    }
    public void run() {
        String nameT = getName();
        long timeout = 0;
        System.out.println("Старт потока " + nameT);
        try {
            switch (nameT) {
                case "First":
                    timeout = 5_000;
                    break;
                case "Second":
                    timeout = 1_000;
            }
            Thread.sleep(timeout);
            System.out.println("завершение потока " + nameT);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
