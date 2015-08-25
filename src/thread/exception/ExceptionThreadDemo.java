package thread.exception;

/**
 * Created by Grinyov Vitaliy on 25.08.15.
 *
 * Основной поток избавлен от необходимости обрабатывать исключения
 в порожденных потоках.
 В данной ситуации верно и обратное: если основной поток прекратит свое
 выполнение из-за необработанного исключения, то это не скажется на работо-
 способности порожденного им потока.

 */
public class ExceptionThreadDemo {
    public static void main(String[ ] args) throws InterruptedException {
        new ExceptionThread().start();
        Thread.sleep(1000);
        System.out.println("end of main");
    }
}
