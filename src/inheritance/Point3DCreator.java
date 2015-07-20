package inheritance;

/**
 * Created by green on 21.07.2015.
 */
public class Point3DCreator extends Point2DCreator{

    @Override
    public Point3Dv2 createPoint() { // метод - подставка
        System.out.println("Point3D");
        return new Point3Dv2(3, 7, 8);
    }
}
