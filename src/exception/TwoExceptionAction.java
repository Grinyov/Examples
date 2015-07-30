package exception;

/**
 * Created by green on 31.07.2015.
 *
 * ���� � ����� try ����� ���� ������������� � ������ �������� ���� �������-
 �� ����� ����������, �� ���������� ������� ���������� ������ catch, ����
 ������ ���� catch �� ������������ ��� ���� ����������.
 */
public class TwoExceptionAction {
    public void doAction() {
        try {
            int a = (int)(Math.random() * 2);
            System.out.println("a = " + a);
            int c[] = { 1/a }; // ������� ����� #1
            c[a] = 71; // ������� ����� #2
        } catch(ArithmeticException e) {
            System.err.println("������� �� 0" + e);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.err.println("out of bound: " + e);
        } // ��������� try-catch �����
        System.out.println("after try-catch");
    }
}
