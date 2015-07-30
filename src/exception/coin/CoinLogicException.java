package exception.coin;

/**
 * Created by green on 31.07.2015.
 */
public class CoinLogicException extends Exception {
    public CoinLogicException() {
    }
    public CoinLogicException(String message, Throwable exception) {
        super(message, exception);
    }
    public CoinLogicException(String message) {
        super(message);
    }
    public CoinLogicException (Throwable exception) {
        super(exception);
    }
}
