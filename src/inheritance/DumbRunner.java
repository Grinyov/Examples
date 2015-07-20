package inheritance;

/**
 * Created by green on 20.07.2015.
 *
 * ����� getId() ���������� ��� � ������ Dumb, ��� � � ������ Dumber � ��-
 ������ ����������������. ����� ������� ������������ Dumber() ����������
 ����������� ������ Dumb. �� ��� ��� � ����� ������� ��������� ������ ������
 Dumber, �� ���������� ����� getId(), ����������� � ������ Dumber, �������
 � ���� ������� ��������� ����� id, ��� �� ��������������������� ��� ����-
 �� Dumber. � ���������� id ������� �������� �� ���������, �. �. ����.
 ���������������� ��������������� ����� ���� ((Dumber) objA).id, �����
 ����� �������� ������ � ���� id �� ���������.

 */
public class DumbRunner {
    public static void main(String[] args) {

        Dumb objA = new Dumber();
    }
}