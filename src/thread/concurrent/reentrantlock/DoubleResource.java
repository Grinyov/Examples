package thread.concurrent.reentrantlock;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
/**
 * Created by green on 30.08.2015.
 *
 * ресурсы добавляются и удаляются только парами
 *
 *
 * Синхронизация ресурса ключевым словом synchronized накладывает до-
 статочно жесткие правила на освобождение этого ресурса. Интерфейс Lock
 представляет собой некоторое обобщение синхронизации. Появляется возмож-
 ность провести опрос о блокировании, установить время ожидания блокиров-
 ки и условия ее прерывания. Интерфейс также оптимизирует работу JVM
 с процессами конкурирования за освобождаемые ресурсы.
 Шаблонное применение этих методов после объявления экземпляра locking
 класса ReentrantLock:
 locking.lock();
 try {
 // some code here
 } finally {
 locking.unlock();
 }
 Данная конструкция копирует функциональность блока synchronized.



 Пусть необходим нереляционный способ сохранения информации в коллек-
 ции, когда неделимым квантом информации считается пара или более следую-
 щих друг за другом элементов. То есть добавление и удаление элементов может
 осуществляться только парами и другой поток не может добавить/удалить свои
 элементы, пока заблокировавший коллекцию поток полностью не выполнит
 свои действия.

 */
public class DoubleResource {
    private Deque<String> list = new LinkedList<String>();
    private Lock lock = new ReentrantLock();
    private Condition isFree = lock.newCondition();
    public void adding(String str, int i) {
        try {
            lock.lock();
            list.add(i + "<" + str);
            TimeUnit.MILLISECONDS.sleep(new Random().nextInt(50));
            list.add(str + ">" + i);
            isFree.signal();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
    public String deleting() {
        lock.lock();
        String s = list.poll();
        s += list.poll();
        isFree.signal();
        lock.unlock();
        return s;
    }
    public String toString() {
        return list.toString();
    }
}
