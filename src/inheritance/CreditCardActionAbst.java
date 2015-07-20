package inheritance;

/**
 * Created by green on 21.07.2015.
 */
public class CreditCardActionAbst extends AbstractCardAction {
    // поля, конструкторы, методы
    @Override // аннотация указывает на полиморфную природу метода
// метод должен быть реализован в подклассе
    public void doPayment(double amountPayment) { // переопределенный метод
// реализация
        System.out.println("complete from credit card!");
    }
}
