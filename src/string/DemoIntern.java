package string;

/**
 * Created by Grinyov Vitaliy on 29.07.15.
 *
 * В данной ситуации ссылка s1 инициализируется литералом, обладающим
 всеми свойствами объекта вплоть до вызова методов. Вызов метода intern()
 организует поиск в «пуле литералов» соответствующего значению объекта s2
 литерала и при положительном результате возвращает ссылку на найденный
 литерал, а при отрицательном — заносит значение в пул и возвращает ссылку
 на него.
 */
public class DemoIntern {
    public static void main(String[ ] args) {
        String s1 = "Java"; // литерал и ссылка на него
        String s2 = new String("Java");
        System.out.println(s1 == s2); // false
        s2 = s2.intern();
        System.out.println(s1 == s2); // true
    }
}
