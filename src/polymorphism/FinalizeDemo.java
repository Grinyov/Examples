package polymorphism;

/**
 * Created by green on 21.07.2015.
 */
public class FinalizeDemo {

    public static void main(String[] args) {
        ManagerFinalize d1 = new ManagerFinalize(1);
        d1 = null;
        ManagerFinalize d2 = new ManagerFinalize(2);
     //   Object d3 = d2; // 1
 Object d3 = new ManagerFinalize (3); // 2
        d2 = d1;
// просьба выполнить "сборку мусора"
        System.gc();
    }
}
