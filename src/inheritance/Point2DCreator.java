package inheritance;

/**
 * Created by green on 21.07.2015.
 */
public class Point2DCreator extends Point1DCreator {
    @Override
    public Point2Dv2 createPoint() { // метод - подставка
        System.out.println("Point2D");
        return new Point2Dv2(2, 5);
    }
}
