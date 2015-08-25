package thread.exception;

/**
 * Created by Grinyov Vitaliy on 25.08.15.
 */

    public class ExceptionMainDemo {
        public static void main(String[ ] args) {
            new SimpleThread().start();
            System.out.println("end of main with exception");
            throw new RuntimeException();
        }
}
