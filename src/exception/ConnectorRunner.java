package exception;

/**
 * Created by green on 31.07.2015.
 *
 * ���������� ����� loadResource() ����� (��� ���������� ���������� �������
 ��� ��� ��������� null) ������������ ����������, ��������������� ������������.
 � ���������� ��������� �������������� ���������� IllegalArgumentException ���
 ��������� ������ RuntimeException ���������� ����������� ����������
 � ������ main().
 */
public class ConnectorRunner {
    public static void main(String[] args) {
        SameResource f = new SameResource(); // SameResource f = null;
        try {// ������������ ������ ��� ��������������� ������������ �������� ���������
            Connector.loadResource(f);
        } catch (IllegalArgumentException e) {
            System.err.print("��������� unchecked-���������� ��� ������: " + e);
        }
    }
}
