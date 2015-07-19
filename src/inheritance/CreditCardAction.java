package inheritance;

/**
 * Created by green on 20.07.2015.
 */
public class CreditCardAction extends CardAction {

    // поля, конструкторы, методы
    public boolean checkCreditLimit() { // собственный метод
        return true; // stub
    }
    @Override // аннотация указывает на полиморфную природу метода
    public void doPayment(double amountPayment) { // переопределенный метод
// реализация
        System.out.println("complete from credit card");
    }
}
