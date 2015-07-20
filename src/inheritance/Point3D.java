package inheritance;

/**
 * Created by Grinyov Vitaliy on 20.07.15.
 *
 * super и this в конструкторе
 */
public class Point3D extends Point2D {
    private int z;
    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }
    public Point3D() {
        this(-1, -1, -1); // вызов конструктора Point3D с параметрами
    }
}