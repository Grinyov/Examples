package exception;

/**
 * Created by green on 31.07.2015.
 */
public class FinallyDemo {
    public void doAction() {
        SameResource sr = null;
        try {
// реализация — захват ресурсов
            sr = new SameResource(); // возможна генерация исключения
// реализация — использование ресурсов
            sr.execute(); // возможна генерация исключения
// sr.close(); // освобождение ресурсов (некорректно)
        } finally {
// освобождение ресурсов (корректно)
            if (sr != null) {
                sr.close();
            }
        }
        System.out.print("after finally");
    }
}
