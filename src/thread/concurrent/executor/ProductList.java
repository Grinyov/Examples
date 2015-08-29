package thread.concurrent.executor;

import java.util.ArrayDeque;

/**
 * Created by green on 30.08.2015.
 *
 * список обрабатываемых объектов
 *
 */
public class ProductList {

    private static ArrayDeque<String> arr = new ArrayDeque<String>() {
        {
            this.add("Product 1");
            this.add("Product 2");
            this.add("Product 3");
            this.add("Product 4");
            this.add("Product 5");
        }
    };
    public static String getProduct() {
        return arr.poll();
    }
}
