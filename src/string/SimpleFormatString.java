package string;

import java.util.Formatter;

/**
 * Created by Grinyov Vitaliy on 31.07.15.
 *
 * форматирование строки при помощи метода format()
 */
public class SimpleFormatString {
    public static void main(String[ ] args){
        Formatter f = new Formatter(); // объявление объекта
// форматирование текста по формату %S, %c
        f.format("This %s is about %n%S %c", "book", "java", '8');
        System.out.print(f);
    }
}
