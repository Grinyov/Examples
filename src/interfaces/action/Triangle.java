package interfaces.action;

/**
 * Created by Grinyov Vitaliy on 22.07.15.
 */
public class Triangle extends AbstractShape {

    private double b;
    private double angle; // угол между сторонами в радианах
    public Triangle(double a, double b, double angle) {
        super(a);
        this.b = b;
        this.angle = angle;
    }
    public double getAngle() {
        return angle;
    }
    public double getB() {
        return b;
    }
    public double getC() {
        double c = // stub : вычисление по теореме косинусов
        return c;
    }
}
