package polymorphism;

/**
 * Created by green on 21.07.2015.
 */
public abstract class AbstractQuest {
    private long id;
    private String questContent;
    // ������������ � ������
    public abstract boolean check(Answer ans);
}
