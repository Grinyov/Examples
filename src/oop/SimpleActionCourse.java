package oop;

/**
 * Created by green on 18.07.2015.
 *
 * Демонстрирует параметризованные конструкторы и методы
 */
public class SimpleActionCourse {

    public <T1 extends Course> SimpleActionCourse(T1 course) { // конструктор
// реализация
    }
    public <T2> SimpleActionCourse() { // конструктор
// реализация
    }
    public <T3 extends Course> void calculateMark(T3 course) {
// реализация
    }
    public <T4> void printReport(T4 course) {
// реализация
    }
    public <T5> void check() {
// реализация
    }

    public static void main(String[] args) {

        SimpleActionCourse sap = new SimpleActionCourse(new Course());
        sap.printReport(new Course(7112));
    }
}
