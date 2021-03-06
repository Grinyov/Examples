package oop;

/**
 * Created by green on 18.07.2015.
 *
 * В следующем примере приведены три перегруженных метода и несколько ва-
 риантов их вызова. Отличительной чертой является возможность метода с аргу-
 ментом Object… args принимать не только объекты, но и массивы:
 */
public class DemoOverload {

    public static void printArgCount(Object... args) { // 1
        System.out.println("Object args: " + args.length);
    }
    public static void printArgCount(Integer[ ]...args){ // 2
        System.out.println("Integer[ ] args: " + args.length);
    }
    public static void printArgCount(int... args) { // 3
        System.out.print("int args: " + args.length);
    }
    public static void main(String[ ] args) {
        Integer[] i = { 1, 2, 3, 4, 5 };
        printArgCount(7, "No", true, null);
        printArgCount(i, i, i);
        printArgCount(i, 4, 71);
        printArgCount(i); // будет вызван метод 1
        //printArgCount(5, 7);
// printArgCount(); // неопределенность при перегрузке!
    }

}
