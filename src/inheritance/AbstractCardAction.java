package inheritance;

/**
 * Created by green on 21.07.2015.
 */
public abstract class AbstractCardAction {
    private int id;
    public AbstractCardAction() { // конструктор
    }
    // more methods
    public boolean checkLimit() { // собственный метод
        return true; // stub
    }
    public abstract void doPayment(double amountPayment);
}

