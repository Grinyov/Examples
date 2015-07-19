package inheritance;

/**
 * Created by green on 20.07.2015.
 *
 * вызов нестатического final-метода из конструктора
 */
public class Coin {
    private double diameter;
    // поля
    public Coin(double diameter) {
        super();
        initDiameter(diameter); // обращение к final-методу
    }
    public final void initDiameter(double value) { // можно public final заменить на private
        if (value > 0) {
            diameter = value;
        } else {
            System.out.println("Oтрицательный диаметр!");
        }
    }
// методы
}
