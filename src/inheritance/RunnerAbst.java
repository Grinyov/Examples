package inheritance;

/**
 * Created by green on 21.07.2015.
 */
public class RunnerAbst {
    public static void main(String[ ] args) {
        AbstractCardAction action; // ����� �������� ������
// action = new AbstractCardAction(); ������ ������� ������!
        action = new CreditCardActionAbst();
        action.doPayment (100);
    }
}
