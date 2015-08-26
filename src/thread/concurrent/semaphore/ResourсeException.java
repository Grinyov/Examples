package thread.concurrent.semaphore;

/**
 * Created by green on 25.08.2015.
 */
public class ResourсeException extends Exception {
    public ResourсeException() {
        super();
    }

    public ResourсeException(String message, Throwable cause) {
        super(message, cause);
    }

    public ResourсeException(String message) {
        super(message);
    }

    public ResourсeException(Throwable cause) {
        super(cause);
    }
}
