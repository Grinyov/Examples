package inheritance;

/**
 * Created by Grinyov Vitaliy on 20.07.15.
 */
public class Point2Dv2 extends Point1Dv2 {

    private int y;
    public Point2Dv2(int x, int y) {
        super(x);
        this.y = y;
    }
    @Override
    public double length() {
        return Math.hypot(super.length(), y);
/* просто length() нельзя, т.к. метод будет вызывать сам себя, что
приведет к бесконечной рекурсии и ошибке во время выполнения */
    }
    @Override
    public String toString() {
        return super.toString() + " y=" + y;
    }
}
