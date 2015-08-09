package collection;

import java.util.Collections;
import java.util.HashSet;

/**
 * Created by green on 09.08.2015.
 *
 * С применением предыдущих версий языка было разработано множество
 коллекций, в которых никаких проверок нет, следовательно, при их использо-
 вании нельзя гарантировать, что в коллекцию не будет помещен «посторон-
 ний» объект. Для этого в класс Collections был добавлен новый метод:
 static <E> Collection <E> checkedCollection(Collection<E> c, Class<E> type)
 Этот метод создает коллекцию, проверяемую на этапе выполнения,
 т. е. в случае добавления «постороннего» объекта генерируется исключение
 ClassCastException:
 */
public class SafeSetRun {
    public static void main(String args[ ]) {
        HashSet orders;
        int orderId = 0;
        float amount = 0;
     /*
// orders = new HashSet(); // заменяемый код на jdk1.4 и ниже
        orders = Collections.checkedSet(orders<Order>(), Order.class);
        orders.add(new Order(orderId, amount));
// some code here
        orders.add(new Item(orderId, amount, "")); // runtime error
     */
    }

}
