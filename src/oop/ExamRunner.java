package oop;

/**
 * Created by green on 17.07.2015.
 */
public class ExamRunner {
    public static void main(String[ ] args) {
        Exam<Double> md1 = new Exam<Double>(71.41D,"Progr");// 71.5d
        Exam<Double> md2 = new Exam<Double>(71.45D, "Progr");// 71.5d
        System.out.println(md1.equalsToMark(md2));
        Exam<Integer> mi = new Exam<Integer>(71,"Progr");
// md1.equalsToMark(mi); // ошибка компиляции: несовместимые типы
    }
}
