package inheritance;

/**
 * Created by green on 21.07.2015.
 *
 * ������������� ��������� @Override ��������� �������� � ���� ��������-
 �������� ����� � ����������� ������ ���������� � ������, ���� �������-
 ���� �������� �������������� ������ (��������) � �������� ��������� ��-
 ���������� ������.
 ������� �������, ��� ��� ������ toString() ��������� super ������ �����-
 ����� � ���������� �����������. �������������� �����, ����� ����������,
 ����������! ���������� ��� ������ super() � ������������ ��������� ���-
 ������� � ���������������� ������������ ����������������� �����������.
 �������� �����: ����� ������ ����������������� ������ ����������-
 �� �� ����� ���������� ����.
 ��� ������ Java �������� ������������ (�������� ����� virtual, ��� � C++,
 �� ������������).
 ����������� ������ ����� ����������� � ���������������� � ����������,
 �� �� ����������� ������ ������� �� ���� ������ � �������� �������, � �����-
 �� � �� ���� ������ �������
 */
public class Runner {
    public static void main(String[] args) {
        PointReport d = new PointReport();
        Point1Dv2 p1 = new Point1Dv2(-7);
        d.printReport(p1);
        Point2Dv2 p2 = new Point2Dv2(3, 4);
        d.printReport(p2);
        Point3Dv2 p3 = new Point3Dv2(3, 4, 5);
        d.printReport(p3);
    }
}