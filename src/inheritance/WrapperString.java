package inheritance;

/**
 * Created by green on 20.07.2015.
 *
 * Рекомендуется при разработке классов из конструкторов вызывать методы,
 на которые не распространяются принципы полиморфизма. Метод может быть
 еще объявлен как private с таким же результатом.
 Нельзя создать порожденный класс для класса, объявленного со специфика-
 тором final:
 // класс String не может быть суперклассом
 public final class String
// следующий класс невозможен
class MegaString extends String // ошибка компиляции
Если необходимо создать собственную реализацию final-класса, то создает-
        ся класс-оболочка, где в качестве поля представлен final-класс. В свою очередь
        необходимые имена методов делегируются из final-класса, но им придается
        необходимая разработчику функциональность.
        Такой подход гарантирует невозможность прямого использования класса-
        оболочки вместо оборачиваемого класса и наоборот.

 */
public class WrapperString {

    private String str;
    public WrapperString() {
        str = new String();
    }
    public WrapperString(String s) {
        str = new String(s);
    }
    public int indexOf(int arg) { // делегированный метод
// новая функциональность
        return arg;
    }
// другие делегированные методы
}
