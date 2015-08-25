package thread.monitor;

import java.util.Scanner;

/**
 * Created by Grinyov Vitaliy on 25.08.15.
 *
 *
 * взаимодействие wait() и notify()
 *
 * Контроль за доступом к объекту-ресурсу обеспечивает понятие монитора.
 Монитор экземпляра может иметь только одного владельца. При попытке кон-
 курирующего доступа к объекту, чей монитор имеет владельца, желающий за-
 блокировать объект-ресурс поток должен подождать освобождения монитора
 этого объекта и только после этого завладеть им и начать использование объек-
 та-ресурса. Каждый экземпляр любого класса имеет монитор. Методы wait(),
 wait(long inmillis), notify(), notifyAll() корректно срабатывают только на эк-
 земплярах, чей монитор уже кем-то захвачен. Статический метод захватывает
 монитор экземпляра класса Class, того класса, на котором он вызван. Существует
 в единственном экземпляре. Нестатический метод захватывает монитор экзем-
 пляра класса, на котором он вызван.
 */
public class Payment {
    private int amount;
    private boolean close;
    public int getAmount() {
        return amount;
    }
    public boolean isClose() {
        return close;
    }
    public synchronized void doPayment() {
        try {
            System.out.println("Start payment:");
            while (amount <= 0) {
                this.wait(); // остановка потока и освобождение блокировки
// после возврата блокировки выполнение будет продолжено
            }
// код выполнения платежа
            close = true;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Payment is closed : " + close);
    }
    public void initAmount() {
        Scanner scan = new Scanner(System.in);
        amount = scan.nextInt();
    }
}
