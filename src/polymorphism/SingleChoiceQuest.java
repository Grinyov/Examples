package polymorphism;

/**
 * Created by green on 21.07.2015.
 */
public class SingleChoiceQuest extends AbstractQuest{
    // ����, ������������ � ������
    @Override
    public boolean check(Answer ans) {
        System.out.println("Single choice quest");
// �������� ������������ ������ true ��� false
        return true; // stub
    }
}
