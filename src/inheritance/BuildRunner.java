package inheritance;

/**
 * Created by green on 21.07.2015.
 *
 * � ������ �������� ��� ���������� � ��������� Point3DCreator �������-
 �� ��� ������ createPoint(). ���� ����� ������������ �������� Point3D,
 ������ (���� ���������) � Point1D � Point2D. ��� ��������� � ������ createPoint()
 ������ ������ ������������ ������� ����������� ��� ��������-
 ����� ������������, �� ��� ���������� ����������� ����������� � ����-
 ������ ����� � ������������ ��������� Point3D. ��������� � ���� �����
 ������������ �� ���� �������, ������������� ������� createPoint(), �. �. � ����
 ������ Point3D. ��� ����������� ��������� � ����� ������� � ������� Point1D
 � ��� ����������� ������ ������������ private.
 �� �������� ������ ��������� ����� �������������� ��� ���������� ���-
 ��������� ������ �� ������� ���������� (��� ��������������) �������� ���-
 �������, ������������������ � ������ �� ����������.
 */
public class BuildRunner {

    public static void main(String[ ] args) {
        Point2DCreator br = new Point3DCreator();
// Point3D p = br.createPoint(); // ������ ����������
        Point2Dv2 p = br.createPoint(); // "������ ����������"
        System.out.println(br.createPoint().x);
        System.out.println(br.createPoint().y);
// System.out.println(br.createPoint().z);
    }
}
