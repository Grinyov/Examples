package interfaces.action;

/**
 * Created by Grinyov Vitaliy on 22.07.15.
 *
 * абстрактная фигура
 *
 */
public abstract class AbstractShape {

    private double a;
    public AbstractShape(double a) {
        this.a = a;
    }
    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }
}
