package exception;

/**
 * Created by green on 31.07.2015.
 *
 * ��������� ����� try-catch
 */
public class NestedTryCatchRunner {

    public void doAction() {
        try { // ������� ����
            int a = (int) (Math.random() * 2) - 1;
            System.out.println("a = " + a);
            try { // ���������� ����
                int b = 1/a;
                StringBuilder sb = new StringBuilder(a);
            } catch (NegativeArraySizeException e) {
                System.err.println("������������ ������ ������: " + e);
            }
        } catch (ArithmeticException e) {
            System.err.println("������� �� 0: " + e);
        }
    }
}
