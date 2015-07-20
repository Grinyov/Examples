package inheritance;

/**
 * Created by Grinyov Vitaliy on 20.07.15.
 */
public class Point1Dv2 {
    private int x;
    public Point1Dv2(int x) {
        this.x = x;
    }
    public double length() {
        return Math.abs(x);
    }
    @Override
    public String toString() {
        return " x=" + x;
    }
}
