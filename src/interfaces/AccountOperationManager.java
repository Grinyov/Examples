package interfaces;

/**
 * Created by Grinyov Vitaliy on 22.07.15.
 *
 * операционное управление банковским счетом
 *
 */
public interface AccountOperationManager {

    double depositInCash(int accountNumber, int amount);
    boolean withdraw(int accountNumber, int amount);
    boolean convert(double amount);
    boolean transfer(int accountNumber, double amount);
}
