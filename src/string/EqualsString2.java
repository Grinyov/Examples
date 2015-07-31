package string;

/**
 * Created by Grinyov Vitaliy on 31.07.15.
 */
public class EqualsString2 {
    public static void main(String[] args) {
        String s1 = "Kharkov";
        String s2 = new String("Kharkov");
        if (s1.equals(s2.intern())) {
            System.out.print("true");
        } else {
            System.out.print("false");
        }

        if (s1 == s2) {
            System.out.print("true");
        } else {
            System.out.print("false");
        }
    }
}
