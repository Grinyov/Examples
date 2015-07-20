package inheritance;

/**
 * Created by green on 21.07.2015.
 */
public class RunnerAbst {
    public static void main(String[ ] args) {
        AbstractCardAction action; // можно объ€вить ссылку
// action = new AbstractCardAction(); нельз€ создать объект!
        action = new CreditCardActionAbst();
        action.doPayment (100);
    }
}
