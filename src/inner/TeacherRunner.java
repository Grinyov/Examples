package inner;

/**
 * Created by green on 22.07.2015.
 */
public class TeacherRunner {

    public static void main(String[ ] args) {
        TeacherLogic tl = new TeacherLogic();
        tl.excludeProcess(777, "Олейников");
        tl.excludeProcess(6, "Олейников");
    }
}
