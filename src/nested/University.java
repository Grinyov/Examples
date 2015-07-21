package nested;

/**
 * Created by green on 22.07.2015.
 *
 * класс, вложенный в интерфейс
 *
 *  ласс, вложенный в интерфейс, по умолчанию статический. Ќа него не на-
 кладываетс€ никаких особых ограничений, и он может содержать пол€ и мето-
 ды как статические, так и нестатические.

 */
public interface University {
    int NUMBER_FACULTY = 20;
    void create();
    class LearningDepartment { // static по умолчанию
        public int idChief;
        public static void assignPlan(int idFaculty) {
// реализаци€
        }
        public void acceptProgram() {
// реализаци€
        }
    }
}
