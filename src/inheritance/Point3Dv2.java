package inheritance;

/**
 * Created by Grinyov Vitaliy on 20.07.15.
 */
public class Point3Dv2 extends Point1Dv2 {

    private int z;
    public Point3Dv2(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }
    public Point3Dv2() {
        this(-1, -1, -1); // вызов конструктора Point3D с параметрами
    }
    @Override
    public double length() {
        return Math.hypot(super.length(), z);
    }
    @Override
    public String toString() {
        return super.toString() + " z=" + z;
    }
}



