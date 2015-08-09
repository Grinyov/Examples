package collection.queue;

/**
 * Created by green on 09.08.2015.
 * Предлагаемое решение универсально для любых пользовательских типов.
 Предложенное решение применимо для создания упорядоченных множеств
 вида TreeSet, которые используют компаратор для сортировки при добавлении
 экземпляра в множество.
 */
public class Order implements Comparable<Order> {
    private int orderId;
    private float amount;
    // поля и методы описания подробностей заказа
    public Order(int orderId, float amount) {
        super();
        this.orderId = orderId;
        this.amount = amount;
    }
    public int getOrderId() {
        return orderId;
    }
    public float getAmount() {
        return amount;
    }
    // реализация метода интерфейса Comparable
    @Override
    public int compareTo(Order ob) {
        return this.orderId - ob.orderId;
    }
    @Override
    public String toString() {
        return "Order [orderId =" + orderId + ", amount=" + amount + "]";
    }
}
