package inheritance;

/**
 * Created by green on 21.07.2015.
 */
public abstract class AbstractCardAction {
    private int id;
    public AbstractCardAction() { // �����������
    }
    // more methods
    public boolean checkLimit() { // ����������� �����
        return true; // stub
    }
    public abstract void doPayment(double amountPayment);
}

