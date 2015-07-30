package exception.coin;

/**
 * Created by green on 31.07.2015.
 *
 * генерация и обработка собственных исключений
 *
 * Разработчики программного обеспечения стремятся к высокому уровню
 повторного использования кода, поэтому они постарались предусмотреть
 и закодировать все возможные исключительные ситуации. При реальном
 программировании создание собственных классов исключений позволяет
 разработчику выделить важные аспекты приложения и обратить внимание
 на детали разработки
 */
public class Runner {
    public void doAction(String value) throws CoinTechnicalException {
        Coin ob = new Coin();
        try {
            double d = Double.parseDouble(value);
            ob.setDiameter(d);
        } catch (NumberFormatException e) {
            throw new CoinTechnicalException("incorrect symbol in string", e);
        } catch (CoinLogicException e) {
            System.err.println(e.getCause());
        }
    }
    public void doAction2(String value) throws CoinLogicException {
        Coin ob = new Coin();
        try {
            double d = Double.parseDouble(value);
            ob.setDiameter(d);
        } catch (CoinLogicException e) {
            throw e;
        }
    }

}
