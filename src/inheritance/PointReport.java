package inheritance;

/**
 * Created by green on 21.07.2015.
 */
public class PointReport {

        public void printReport(Point1Dv2 p) {
        System.out.printf("length=%.2f %s%n", p.length(), p);
// вызовы out.print(p.toString()) и out.print(p) для объекта идентичны !
    }
}
