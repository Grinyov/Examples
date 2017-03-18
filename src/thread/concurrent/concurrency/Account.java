package thread.concurrent.concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by vgrinyov.
 */
public class Account {
    private int balance;
    private Lock lock = new ReentrantLock();

    public Lock getLock() {
        return lock;
    }

    public Account(int balance) {
        this.balance = balance;
    }

    public void withdraw(int amount){
        balance -= amount;
    }

    public void deposit(int amount){
        balance -= amount;
    }

    public int getBalance() {
        return balance;
    }
}
