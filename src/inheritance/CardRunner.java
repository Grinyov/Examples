package inheritance;

/**
 * Created by green on 20.07.2015.
 *
 * При объявлении совпадающих по сигнатуре (имя, тип, область видимости)
 полей в суперклассе и подклассах их значения не переопределяются и никак
 не пересекаются, т. е. существуют в одном объекте независимо друг от друга.
 Такое решение является плохим примером кода, который не используется
 в практическом программировании. Не следует использовать вызов полиморф-
 ных методов в конструкторе. Эти действия могут привести к использованию
 и получению недостоверной информации при работе метода. Для доступа
 к полям текущего объекта можно использовать указатель this, для доступа
 к полям суперкласса — указатель super.

 */
public class CardRunner {

    public static void main(String[ ] args) {
        CardAction dc1 = new CardAction();
        CardAction dc2 = new CreditCardAction();
        CreditCardAction cc = new CreditCardAction();
// CreditCardAction cca = new CardAction(); // ошибка компиляции
        dc1.doPayment(15.5); // метод класса CardAction
        dc2.doPayment(21.2); // полиморфный метод класса CreditCardAction
        cc.doPayment(7.0); // полиморфный метод класса CreditCardAction
        cc.checkCreditLimit(); // неполиморфный метод класса CreditCardAction
// dc2.checkCreditLimit(); // ошибка компиляции – неполиморфный метод
        ((CreditCardAction)dc1).checkCreditLimit(); // ошибка времени выполнения
        ((CreditCardAction)dc2).checkCreditLimit(); // ок
    }

}
