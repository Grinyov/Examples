package inheritance;

/**
 * Created by green on 20.07.2015.
 */
public class CreditCardAction extends CardAction {

    // ����, ������������, ������
    public boolean checkCreditLimit() { // ����������� �����
        return true; // stub
    }
    @Override // ��������� ��������� �� ����������� ������� ������
    public void doPayment(double amountPayment) { // ���������������� �����
// ����������
        System.out.println("complete from credit card");
    }
}
