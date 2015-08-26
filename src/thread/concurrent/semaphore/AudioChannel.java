package thread.concurrent.semaphore;

/**
 * Created by green on 25.08.2015.
 *
 * канал — ресурс: обычный класс с некоторой информацией
 *
 */
public class AudioChannel {
        private int сhannellId;
        public AudioChannel(int id) {
            super();
            this.сhannellId = id;
        }
        public int getСhannellId() {
            return сhannellId;
        }
    public void setСhannellId(int id) {
        this.сhannellId = id;
    }
    public void using() {
        try {
// использование канала
            Thread.sleep(new java.util.Random().nextInt(500));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
