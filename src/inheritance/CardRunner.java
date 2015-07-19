package inheritance;

/**
 * Created by green on 20.07.2015.
 *
 * ��� ���������� ����������� �� ��������� (���, ���, ������� ���������)
 ����� � ����������� � ���������� �� �������� �� ���������������� � �����
 �� ������������, �. �. ���������� � ����� ������� ���������� ���� �� �����.
 ����� ������� �������� ������ �������� ����, ������� �� ������������
 � ������������ ����������������. �� ������� ������������ ����� ��������-
 ��� ������� � ������������. ��� �������� ����� �������� � �������������
 � ��������� ������������� ���������� ��� ������ ������. ��� �������
 � ����� �������� ������� ����� ������������ ��������� this, ��� �������
 � ����� ����������� � ��������� super.

 */
public class CardRunner {

    public static void main(String[ ] args) {
        CardAction dc1 = new CardAction();
        CardAction dc2 = new CreditCardAction();
        CreditCardAction cc = new CreditCardAction();
// CreditCardAction cca = new CardAction(); // ������ ����������
        dc1.doPayment(15.5); // ����� ������ CardAction
        dc2.doPayment(21.2); // ����������� ����� ������ CreditCardAction
        cc.doPayment(7.0); // ����������� ����� ������ CreditCardAction
        cc.checkCreditLimit(); // ������������� ����� ������ CreditCardAction
// dc2.checkCreditLimit(); // ������ ���������� � ������������� �����
        ((CreditCardAction)dc1).checkCreditLimit(); // ������ ������� ����������
        ((CreditCardAction)dc2).checkCreditLimit(); // ��
    }

}
