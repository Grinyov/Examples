package collection;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * Created by green on 31.07.2015.
 *
 * класс, агрегирующий список, с реализацией интерфейса Iterable
 *
 *
 * При создании класса, содержащего коллекцию элементов, возможны два
 способа: агрегация коллекции в качестве поля класса или отношение HAS-A
 и наследование от класса, представляющего коллекцию или отношение IS-A.
 Последнее встречается значительно реже.
 */
public class Order2 implements Iterable<Item> {
    private int orderId;
    private List<Item> listItems;
    // private float amount; // не нужен, т.к. сумму можно вычислить
    public Order2(int orderId, List<Item> listItems) {
        this.orderId = orderId;
        this.listItems = listItems;
    }
    public int getOrderId () {
        return orderId;
    }
    public List<Item> getListItems() {
        return Collections.unmodifiableList(listItems);
    }
    // некоторые делегированные методы интерфейсов List и Collection
    public boolean add(Item e) {
        return listItems.add(e);
    }
    public Item get(int index) {
        return listItems.get(index);
    }
    public Item remove(int index) {
        return listItems.remove(index);
    }
    // создание итератора
    @Override
    public Iterator<Item> iterator() {
        return listItems.iterator();
    }
}
