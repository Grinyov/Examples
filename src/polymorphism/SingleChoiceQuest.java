package polymorphism;

/**
 * Created by green on 21.07.2015.
 */
public class SingleChoiceQuest extends AbstractQuest{
    // поля, конструкторы и методы
    @Override
    public boolean check(Answer ans) {
        System.out.println("Single choice quest");
// проверка корректности ответа true или false
        return true; // stub
    }
}
