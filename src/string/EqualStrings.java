package string;

/**
 * Created by Grinyov Vitaliy on 29.07.15.
 *
 * При создании экземпляра класса String путем присваивания его ссылки
 на литерал, последний помещается в так называемый «пул литералов». Если
 в дальнейшем будет создана еще одна ссылка на литерал, эквивалентный ранее
 объявленному, то будет произведена попытка добавления его в «пул литера-
 лов». Так как идентичный литерал там уже существует, то дубликат не может
 быть размещен, и вторая ссылка будет на существующий литерал. Аналогично
 в случае, если литерал является вычисляемым. То есть компилятор восприни-
 мает литералы "Java" и "J" + "ava" как эквивалентные.

 */
public class EqualStrings {
    public static void main(String[ ] args) {
        String s1 = "Java";
        String s2 = "Java";
        String s3 = new String("Java");
        String s4 = new String(s1);
        System.out.println(s1 + "==" + s2 + " : " + (s1 == s2)); // true
        System.out.println(s3 + "==" + s4 + " : " + (s3 == s4)); // false
        System.out.println(s1 + "==" + s3 + " : " + (s1 == s3)); // false
        System.out.println(s1 + " equals " + s2 + " : " + s1.equals(s2)); // true
        System.out.println(s1 + " equals " + s3 + " : " + s1.equals(s3)); // true
    }
}
