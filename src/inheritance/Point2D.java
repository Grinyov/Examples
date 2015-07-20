package inheritance;

/**
 * Created by Grinyov Vitaliy on 20.07.15.
 */

public class Point2D extends Point1D {
    private int y;
    public Point2D(int x, int y) {
        super(x);
        this.y = y;
    }
}
