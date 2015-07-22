package interfaces;

/**
 * Created by Grinyov Vitaliy on 22.07.15.
 *
 * объявление интерфейса управления банковским счетом
 *
 */
public interface AccountAction {

    // по умолчанию все методы public abstract
    boolean openAccount(); // объявление сигнатуры метода
    boolean closeAccount();
    void blocking();
    void unBlocking();
    double depositInCash(int accountNumber, int amount);
    boolean withdraw(int accountNumber, int amount);
    boolean convert(double amount);
    boolean transfer(double amount);
}
