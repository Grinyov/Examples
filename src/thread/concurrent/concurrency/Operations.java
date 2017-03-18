package thread.concurrent.concurrency;

import java.util.concurrent.TimeUnit;

/**
 * Created by vgrinyov.
 */
public class Operations {
    private static final int WAIT_SEC = 10;
    public static void main(String[] args) {
        final Account account1 = new Account(1000);
        final Account account2 = new Account(3000);

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    transfer(account1, account2, 500);
                } catch (InsufficientFundsException e) {
                    e.printStackTrace();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        try {
            transfer(account2, account1, 300);
        } catch (InsufficientFundsException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    static void transfer(
            Account acc1, Account acc2, int amount) throws InsufficientFundsException, InterruptedException {
        if (acc1.getBalance() < amount)
            throw new InsufficientFundsException();
        if (acc1.getLock().tryLock(WAIT_SEC, TimeUnit.SECONDS)){
            try {
                if (acc2.getLock().tryLock(WAIT_SEC, TimeUnit.SECONDS)){
                    try {
                        acc1.withdraw(amount);
                        acc2.deposit(amount);

                    } finally {
                        System.out.println("transfer successful");
                    }
                }
            } finally {
                acc1.getLock().unlock();
            }
        } else {
            System.out.println("Error waiting accounts, please try later");
        }

    }

}
