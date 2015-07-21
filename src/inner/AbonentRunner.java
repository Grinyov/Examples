package inner;

/**
 * Created by green on 22.07.2015.
 */
public class AbonentRunner {

    public static void main(String[] args) {
        Abonent abonent = new Abonent(819002, "Timofey Balashov");
        abonent.setTariffPlan("free");
        abonent.obtainPhoneNumber(375, 25);
        System.out.println(abonent);
    }
}
