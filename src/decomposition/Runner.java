package decomposition;

/**
 * Created by green on 18.07.2015.
 *
 * Здесь был приведен пример простейшей декомпозиции. При разработке при-
 ложений любой сложности всегда следует производить анализ предметной обла-
 сти, определять абстракции и разделять задачу на логические взаимодействую-
 щие части. Тем не менее границы, отделяющие хороший дизайн приложения
 от посредственного, достаточно размыты и зависят от общего уровня компе-
 тентности команды разработчиков и правил, принятых в проекте.

 */
public class Runner {

    public static void main(String[ ] args) {
        try {
            Matrix p = new Matrix(2, 3);
            MatrixCreator.fillRandomized(p, 2, 8);
            System.out.println("Matrix first is: " + p);
            Matrix q = new Matrix(3, 4);
            MatrixCreator.fillRandomized(q, 2, 7);
            System.out.println("Matrix second is: " + q);
            Multiplicator mult = new Multiplicator();
            System.out.println("Matrices product is " + mult.multiply(p, q));
        } catch (MatrixException ex) {
            System.err.println("Error of creating matrix " + ex);
        }
    }
}
