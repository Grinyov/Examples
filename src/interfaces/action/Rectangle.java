package interfaces.action;

/**
 * Created by Grinyov Vitaliy on 22.07.15.
 */
public class Rectangle extends AbstractShape {
    private double b;
    public Rectangle(double a, double b) {
        super(a);
        this.b = b;
    }
    public double getB() {
        return b;
    }
}
