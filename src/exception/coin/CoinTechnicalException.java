package exception.coin;

/**
 * Created by green on 31.07.2015.
 */
public class CoinTechnicalException extends Exception {
    public CoinTechnicalException() {
    }
    public CoinTechnicalException(String message, Throwable cause) {
        super(message, cause);
    }
    public CoinTechnicalException(String message) {
        super(message);
    }
    public CoinTechnicalException(Throwable cause) {
        super(cause);
    }
}
