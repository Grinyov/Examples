package inheritance;

/**
 * Created by green on 20.07.2015.
 *
 * ѕри объ€влении совпадающих по сигнатуре (им€, тип, область видимости)
 полей в суперклассе и подклассах их значени€ не переопредел€ютс€ и никак
 не пересекаютс€, т. е. существуют в одном объекте независимо друг от друга.
 “акое решение €вл€етс€ плохим примером кода, который не используетс€
 в практическом программировании. Ќе следует использовать вызов полиморф-
 ных методов в конструкторе. Ёти действи€ могут привести к использованию
 и получению недостоверной информации при работе метода. ƒл€ доступа
 к пол€м текущего объекта можно использовать указатель this, дл€ доступа
 к пол€м суперкласса Ч указатель super.

 */
public class CardRunner {

    public static void main(String[ ] args) {
        CardAction dc1 = new CardAction();
        CardAction dc2 = new CreditCardAction();
        CreditCardAction cc = new CreditCardAction();
// CreditCardAction cca = new CardAction(); // ошибка компил€ции
        dc1.doPayment(15.5); // метод класса CardAction
        dc2.doPayment(21.2); // полиморфный метод класса CreditCardAction
        cc.doPayment(7.0); // полиморфный метод класса CreditCardAction
        cc.checkCreditLimit(); // неполиморфный метод класса CreditCardAction
// dc2.checkCreditLimit(); // ошибка компил€ции Ц неполиморфный метод
        ((CreditCardAction)dc1).checkCreditLimit(); // ошибка времени выполнени€
        ((CreditCardAction)dc2).checkCreditLimit(); // ок
    }

}
