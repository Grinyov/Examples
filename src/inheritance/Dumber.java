package inheritance;

/**
 * Created by green on 20.07.2015.
 */
public class Dumber extends Dumb {
    int id = 9; // получится два поля с одинаковыми именами
    Dumber() {
        System.out.println("конструктор класса Dumber ");
        id = this.getId();
        System.out.println(" id=" + id);
    }
    @Override
    int getId() { // 2
        System.out.println("getId() класса Dumber ");
        return id;
    }
}
