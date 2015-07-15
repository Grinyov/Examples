package oop;

/**
 * Created by Grinyov Vitaliy on 15.07.15.
 */
public abstract class AbstractCardAction {
    private Long account;
    public AbstractCardAction () { }
    /* тело абстрактного метода отсутствует */
    public abstract void doPayment(double amountPayment);
    public void setAccount(Long account) {
        this.account = account;
    }
}