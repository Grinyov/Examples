package thread.monitor;

/**
 * Created by Grinyov Vitaliy on 25.08.15.
 *
 * В результате компиляции и запуска при вводе корректного значения для
 инициализации поля amount будет запущен процесс проведения платежа.
 Задержки потоков методом sleep() используются для точной демонстрации
 последовательности действий, выполняемых потоками. Если же в коде приложе-
 ния убрать все блоки синхронизации, а также вызовы методов wait() и notify(),
 то результатом вычислений, скорее всего, будет ноль, так как вычисление будет
 произведено до инициализации полей объекта.
 */
public class PaymentRunner {
    public static void main(String[] args) throws InterruptedException {
        final Payment payment = new Payment();
        new Thread() {
            public void run() {
                payment.doPayment(); // вызов synchronized метода
            }
        }.start();
        Thread.sleep(200);
        synchronized (payment) { // 1-ый блок
            System.out.println("Init amount:");
            payment.initAmount();
            payment.notify(); // уведомление о возврате блокировки
        }
        synchronized (payment) { // 2-ой блок
            payment.wait(1_000);
            System.out.println("ok");
        }
    }
}
