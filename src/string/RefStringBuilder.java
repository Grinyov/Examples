package string;

/**
 * Created by Grinyov Vitaliy on 29.07.15.
 *
 * Если метод, вызываемый объектом StringBuilder, производит изменения
 в его содержимом, то это не приводит к созданию нового объекта, как в случае
 объекта String, а изменяет текущий объект StringBuilder
 */
public class RefStringBuilder {
    public static void changeStr(StringBuilder s) {
        s.append(" Certified");
    }
    public static void main(String[ ] args) {
        StringBuilder str = new StringBuilder("Oracle");
        changeStr(str);
        System.out.println(str);
    }
}
