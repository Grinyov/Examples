package thread.concurrent.semaphore;
import java.util.LinkedList;
/**
 * Created by green on 26.08.2015.
 *
 * запуск и использование пула
 *
 * Класс Runner демонстрирует работу пула ресурсов аудиоканалов. При за-
 полнении очереди каналов в данном решении необходимо следить, чтобы число
 каналов, передаваемых списком в конструктор класса ChannelPool, совпадало
 со значением константы POOL_SIZE этого же класса. Константа используется
 для инициализации семафора и при большем или меньшем размерах передаваемого
 списка возникают коллизии, которые, можно спровоцировать
 и разобраться в причинах и следствиях.
 */
public class Runner {
    public static void main(String[] args) {
        LinkedList<AudioChannel> list = new LinkedList<AudioChannel>() {
            {
                this.add(new AudioChannel(771));
                this.add(new AudioChannel(883));
                this.add(new AudioChannel(550));
                this.add(new AudioChannel(337));
                this.add(new AudioChannel(442));
            }
        };
        ChannelPool<AudioChannel> pool = new ChannelPool<>(list);
        for (int i = 0; i < 20; i++) {
            new Client(pool).start();
        }
    }
}
