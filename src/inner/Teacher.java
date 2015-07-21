package inner;

import polymorphism.AbstractQuest;

/**
 * Created by green on 22.07.2015.
 */
public class Teacher extends AbstractTeacher {

    public Teacher(int id) {
        super(id);
    }
    /* методы */
    @Override
    public boolean excludeStudent(String name) {
        return false;
    }
}
