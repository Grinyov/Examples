package string;

/**
 * Created by Grinyov Vitaliy on 31.07.15.
 */
public class EqualStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("I like Java.");//1
        StringBuilder sb2 = new StringBuilder(sb1);//2
        if (sb1.equals(sb2)){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
