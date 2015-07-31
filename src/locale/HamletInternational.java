package locale;

import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by Grinyov Vitaliy on 29.07.15.
 */
public class HamletInternational {
    public static void main(String[ ] args) {
        for (int i = 0; i < 3; i++) {
            System.out.println("1 — английский \n 2 — украинский \n любой — русский ");
            char c = 0;
            try {
                c = (char) System.in.read();
            } catch (IOException e) {
                e.printStackTrace();
            }
            String country = "";
            String language = "";
            switch (c) {
                case '1':
                    country = "US";
                    language = "EN";
                    break;
                case '2':
                    country = "UA";
                    language = "UA";
                    break;
            }
            Locale current = new Locale(language, country);
            ResourceBundle rb = ResourceBundle.getBundle("property.text", current);
            String s1 = rb.getString("str1");
            System.out.println(s1);
            String s2 = rb.getString("str2");
            System.out.println(s2);
        }
    }
}
