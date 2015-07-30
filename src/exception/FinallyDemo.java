package exception;

/**
 * Created by green on 31.07.2015.
 */
public class FinallyDemo {
    public void doAction() {
        SameResource sr = null;
        try {
// ���������� � ������ ��������
            sr = new SameResource(); // �������� ��������� ����������
// ���������� � ������������� ��������
            sr.execute(); // �������� ��������� ����������
// sr.close(); // ������������ �������� (�����������)
        } finally {
// ������������ �������� (���������)
            if (sr != null) {
                sr.close();
            }
        }
        System.out.print("after finally");
    }
}
