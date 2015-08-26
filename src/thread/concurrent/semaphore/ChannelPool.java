package thread.concurrent.semaphore;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/**
 * Created by green on 25.08.2015.
 *
 * пул ресурсов
 *
 * Для демонстрации работы семафора предлагается задача о пуле ресурсов
 с ограниченным числом, в данном случае аудиоканалов, и значительно бо́льшим
 числом клиентов, желающих воспользоваться одним из каналов. Каждый кли-
 ент получает доступ к каналу, причем пользоваться можно только одним кана-
 лом. Если все каналы заняты, то клиент ждет в течение заданного интервала
 времени. Если лимит ожидания превышен, генерируется исключение и клиент
 уходит, так и не воспользовавшись услугами пула.
 Класс ChannelPool объявляет семафор и очередь из каналов. В методе
 getResource() производится запрос к семафору, и в случае успешного его про-
 хождения метод извлекает из очереди канал и выдает его в качестве возвраща-
 емого значения метода. Метод returnResource() добавляет экземпляр-канал
 к очереди на выдачу и освобождает семафор.
 Реализация принципов пула предоставляет возможность повторного ис-
 пользования объектов в ситуациях, когда создание нового объекта — дорого-
 стоящая процедура с точки зрения задействованных для этого ресурсов вирту-
 альной машины. Поэтому при возможности следует объект после использования
 не уничтожать, а возвратить его в так называемый «пул объектов» для повтор-
 ного использования. Данная стратегия широко используется при организации
 пула соединений с базой данных. Реализаций организации пулов существует
 */
public class ChannelPool <T> {
    private final static int POOL_SIZE = 5; // размер пула
    private final Semaphore semaphore = new Semaphore(POOL_SIZE, true);
    private final Queue<T> resources = new LinkedList<T>();
    public ChannelPool(Queue<T> source) {
        resources.addAll(source);
    }
    public T getResource(long maxWaitMillis) throws ResourсeException {
        try {
            if (semaphore.tryAcquire(maxWaitMillis, TimeUnit.MILLISECONDS)) {
                T res = resources.poll();
                return res;
            }
        } catch (InterruptedException e) {
            throw new ResourсeException(e);
        }
        throw new ResourсeException(":превышено время ожидания");
    }
    public void returnResource(T res) {
        resources.add(res); // возвращение экземпляра в пул
        semaphore.release();
    }
}
