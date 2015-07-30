package exception;

/**
 * Created by green on 31.07.2015.
 */
public class FinallyDemo {
    public void doAction() {
        SameResource sr = null;
        try {
// реализаци€ Ч захват ресурсов
            sr = new SameResource(); // возможна генераци€ исключени€
// реализаци€ Ч использование ресурсов
            sr.execute(); // возможна генераци€ исключени€
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
