/**
 * Created by Grinyov Vitaliy on 15.07.15.
 */
public class TransferAction {
    private double transactionAmount;
    public TransferAction(double amount) { // конструктор по умолчанию не предоставляется
        if (amount > 0) {
            this.transactionAmount = amount;
        } else {
            throw new IllegalArgumentException(); // или собственное исключение
        }
    }
    public boolean transferIntoAccount(Account from, Account to) {
// определение остатка
        double demand = from.getAmount() - transactionAmount;
// проверка остатка и перевод суммы
        if (demand >= 0) {
            from.setAmount(demand);
            to.addAmount(transactionAmount);
            return true;
        } else {
            return false;
        }
    }
    public double getTransactionAmount () {
        return transactionAmount;
    }
// вставить метод удержания процента при переводе
}
