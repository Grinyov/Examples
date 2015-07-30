package string;

/**
 * Created by Grinyov Vitaliy on 29.07.15.
 *
 * Демонстрирует класс StringBuffer
 *
 * Основным отличием StringBuilder от StringBuffer является потокобезопас-
 ность последнего. Более высокая скорость обработки есть следствие отсутст-
 вия потокобезопасности класса StringBuilder. Его следует применять, если не
 существует вероятности использования объекта в конкурирующих потоках.
 */
public class DemoStringBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        System.out.println("длина —> " + sb.length());
        System.out.println("размер —>" + sb.capacity());
// sb = "Java"; // ошибка, только для класса String
        sb.append("Java");
        System.out.println("строка —> " + sb);
        System.out.println("длина —> " + sb.length());
        System.out.println("размер —> " + sb.capacity());
        sb.append("Internationalization");
        System.out.println("строка —> " + sb);
        System.out.println("длина —> " + sb.length());
        System.out.println("размер —> " + sb.capacity());
        System.out.println("реверс —> " + sb.reverse());
    }
}
