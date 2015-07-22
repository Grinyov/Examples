package interfaces;

/**
 * Created by Grinyov Vitaliy on 22.07.15.
 *
 * общее управление банковским счетом
 *
 */
public interface AccountBaseAction {

    boolean openAccount();
    boolean closeAccount();
    void blocking();
    void unBlocking();
}
