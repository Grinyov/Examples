package inheritance;

/**
 * Created by green on 21.07.2015.
 */
public class CreditCardActionAbst extends AbstractCardAction {
    // ����, ������������, ������
    @Override // ��������� ��������� �� ����������� ������� ������
// ����� ������ ���� ���������� � ���������
    public void doPayment(double amountPayment) { // ���������������� �����
// ����������
        System.out.println("complete from credit card!");
    }
}
