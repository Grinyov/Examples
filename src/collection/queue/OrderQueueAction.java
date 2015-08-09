package collection.queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by green on 09.08.2015.
 *
 * При всей схожести списков ArrayList и LinkedList существуют серьезные
 отличия, которые необходимо учитывать при использовании коллекций в кон-
 кретных задачах. Если необходимо осуществлять быструю навигацию по спи-
 ску, то следует применять ArrayList, так как перебор элементов в LinkedList
 осуществляется на порядок медленнее. С другой стороны, если требуется ча-
 сто добавлять и удалять элементы из списка, то уже класс LinkedList обеспе-
 чивает значительно более высокую скорость переиндексации. То есть если кол-
 лекция формируется в начале процесса и в дальнейшем используется только
 для доступа к информации, то применяется ArrayList, если же коллекция под-
 вергается изменениям на всем протяжении функционирования приложения,
 то выгоднее LinkedList.

 */
public class OrderQueueAction {
    public static void main(String[ ] args) {
        LinkedList<Order> orders = new LinkedList<Order>() {
            {
                add(new Order(231, 12.f));
                add(new Order(389, 2.9f));
                add(new Order(217, 1.7f));
            }
        };
        Queue<Order> queueA = orders; // создание очереди
        queueA.offer(new Order(222, 9.7f)); // элемент не добавится
        orderProcessing(queueA); // обработка очереди
        if (queueA.isEmpty()) {
            System.out.println("Queue of Orders is empty");
        }
    }
    public static void orderProcessing(Queue<Order> queue) { // заменить void -> boolean
        Order ob = null;
// заменить while -> do{} while
        while ((ob = queue.poll()) != null) { // извлечение с удалением
            System.out.println("Order #" + ob.getOrderId() + " is processing");
// verifying and processing
        }
    }
}
