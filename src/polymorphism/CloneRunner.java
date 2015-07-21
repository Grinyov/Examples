package polymorphism;

/**
 * Created by Grinyov Vitaliy on 21.07.15.
 *
 * безопасная передача по ссылке
 *
 *
 */
public class CloneRunner {
    private static void mutation(StudentClon p) {
        try {
            p = (StudentClon)p.clone(); // клонирование
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        p.setId(1000);
        System.out.println("->id = " + p.getId());
    }
    public static void main(String[] args) {
        StudentClon ob = new StudentClon();
        System.out.println("id = " + ob.getId());
        mutation(ob);
        System.out.println("id = " + ob.getId());
    }
}
