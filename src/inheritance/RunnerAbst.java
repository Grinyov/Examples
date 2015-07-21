package inheritance;

/**
 * Created by green on 21.07.2015.
 */
public class RunnerAbst {
    public static void main(String[ ] args) {
        AbstractCardAction action; // можно объявить ссылку
// action = new AbstractCardAction(); нельзя создать объект!
        action = new CreditCardActionAbst();
        action.doPayment (100);
    }
}
