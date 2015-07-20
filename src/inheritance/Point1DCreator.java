package inheritance;

/**
 * Created by green on 21.07.2015.
 */
public class Point1DCreator {
    public Point1Dv2 createPoint() {
        System.out.println("Point1D");
        return new Point1Dv2(1);
    }
}
