package nested;

/**
 * Created by green on 22.07.2015.
 *
 * �����, ��������� � ���������
 *
 * �����, ��������� � ���������, �� ��������� �����������. �� ���� �� ��-
 ����������� ������� ������ �����������, � �� ����� ��������� ���� � ����-
 �� ��� �����������, ��� � �������������.

 */
public interface University {
    int NUMBER_FACULTY = 20;
    void create();
    class LearningDepartment { // static �� ���������
        public int idChief;
        public static void assignPlan(int idFaculty) {
// ����������
        }
        public void acceptProgram() {
// ����������
        }
    }
}
