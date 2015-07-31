package collection;

import java.util.ArrayList;

/**
 * Created by green on 31.07.2015.
 */
public class Order3 extends ArrayList<Item>{
    private int orderId;
    // private float amount; // по прежнему не нужен, т.к. сумму можно вычислить
    public Order3(ArrayList<Item> c) {
        super(c);
    }
    public Order3(int orderId, ArrayList<? extends Item> c) {
        super(c);
        this.orderId = orderId;
    }
    public int getOrderId() {
        return orderId;
    }
    public void setOrderId (int orderId) {
        this. orderId = orderId;
    }
}
