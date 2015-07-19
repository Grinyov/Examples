package inheritance;

/**
 * Created by green on 20.07.2015.
 *
 * ����� �������������� final-������ �� ������������
 */
public class Coin {
    private double diameter;
    // ����
    public Coin(double diameter) {
        super();
        initDiameter(diameter); // ��������� � final-������
    }
    public final void initDiameter(double value) { // ����� public final �������� �� private
        if (value > 0) {
            diameter = value;
        } else {
            System.out.println("O������������ �������!");
        }
    }
// ������
}
