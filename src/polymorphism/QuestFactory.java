package polymorphism;

/**
 * Created by green on 21.07.2015.
 */
public class QuestFactory {
    // ������ Factory Method (����������)
    public static AbstractQuest getQuestFromFactory(int mode) {
        switch (mode) {
            case 0:
                return new DragnDropQuest();
            case 1:
                return new SingleChoiceQuest();
            default :
                throw new IllegalArgumentException("illegal mode");
// assert false; // �����
// return null; // ��� ����
        }
    }
}
