package exception;

/**
 * Created by green on 31.07.2015.
 *
 * вложенные блоки try-catch
 */
public class NestedTryCatchRunner {

    public void doAction() {
        try { // внешний блок
            int a = (int) (Math.random() * 2) - 1;
            System.out.println("a = " + a);
            try { // внутренний блок
                int b = 1/a;
                StringBuilder sb = new StringBuilder(a);
            } catch (NegativeArraySizeException e) {
                System.err.println("недопустимый размер буфера: " + e);
            }
        } catch (ArithmeticException e) {
            System.err.println("деление на 0: " + e);
        }
    }
}
