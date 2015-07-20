package polymorphism;

/**
 * Created by green on 21.07.2015.
 */
public class DragnDropQuest extends AbstractQuest {
    // поля, конструкторы и методы
    @Override
    public boolean check(Answer ans) {
        System.out.println("Drag'n'Drop quest");
// проверка корректности ответа (true или false)
        return true; // stub
    }
}

