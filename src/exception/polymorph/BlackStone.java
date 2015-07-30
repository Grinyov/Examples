package exception.polymorph;

/**
 * Created by green on 31.07.2015.
 */
public class BlackStone extends Stone { // новый класс
    @Override
    public void build(String data) throws Exception { // ошибка компиляции
        System.out.println("черный каменный шар");
/* реализация*/
    }
}
