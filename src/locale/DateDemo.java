package locale;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by Grinyov Vitaliy on 31.07.15.
 */
public class DateDemo {
    public static void main(String[] args) {
        Date d = new Date();
        Locale[ ] locales = DateFormat.getAvailableLocales();
        for (Locale loc : locales) {
            DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, loc);
            System.out.println(loc.toString() + "---> " + df.format(d));
        }
    }
}
