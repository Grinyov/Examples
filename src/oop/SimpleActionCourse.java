package oop;

/**
 * Created by green on 18.07.2015.
 *
 * ������������� ����������������� ������������ � ������
 */
public class SimpleActionCourse {

    public <T1 extends Course> SimpleActionCourse(T1 course) { // �����������
// ����������
    }
    public <T2> SimpleActionCourse() { // �����������
// ����������
    }
    public <T3 extends Course> void calculateMark(T3 course) {
// ����������
    }
    public <T4> void printReport(T4 course) {
// ����������
    }
    public <T5> void check() {
// ����������
    }

    public static void main(String[] args) {

        SimpleActionCourse sap = new SimpleActionCourse(new Course());
        sap.printReport(new Course(7112));
    }
}
