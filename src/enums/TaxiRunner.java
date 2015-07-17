package enums;

/**
 * Created by green on 18.07.2015.
 */
public class TaxiRunner {
    public static void main(String[ ] args) {
        TaxiStation ts = TaxiStation.valueOf(TaxiStation.class,"Volvo".toUpperCase());
        System.out.println(ts + " : ordinal -> " + ts.ordinal());
        ts.setFreeCabs(3);
        TaxiStation[ ] station = TaxiStation.values();
        for (TaxiStation element : station) {
            System.out.println(element);
        }
    }
}
