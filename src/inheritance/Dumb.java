package inheritance;

/**
 * Created by green on 20.07.2015.
 */
public class Dumb {

    { this.id = 6; }
    int id;
    Dumb() {
        System.out.println("����������� ������ Dumb ");
// ����� ������������ ������������ ������ - �����
        id = this.getId();
        System.out.println(" id=" + id);
    }
    int getId() { // 1
        System.out.println("getId() ������ Dumb ");
        return id;
    }
}
