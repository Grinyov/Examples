package locale;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;

/**
 * Created by Grinyov Vitaliy on 31.07.15.
 *
 * региональные представления дат
 *
 * Класс DateFormat содержит большое количество методов, позволяющих
 выполнять разнообразные манипуляции с датой и временем.
 В качестве примера рассмотрено преобразование заданной даты в различ-
 ные региональные форматы.
 *
 */
public class DateFormatDemo {
    public static void main(String[] args) {
        DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.US);
        Date d = null;
        String str = "April 9, 2012";
        try {
            d = df.parse(str);
            System.out.println(d);
        } catch (ParseException e) {
            System.err.print("Error position: " + e.getErrorOffset());
        }
        df = DateFormat.getDateInstance(DateFormat.LONG, new Locale("ru", "RU"));
        System.out.println(df.format(d));
        df = DateFormat.getDateInstance(DateFormat.FULL, Locale.GERMAN);
        System.out.println(df.format(d));
    }
}
