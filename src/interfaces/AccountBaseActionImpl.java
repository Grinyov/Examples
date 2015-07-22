package interfaces;

/**
 * Created by Grinyov Vitaliy on 22.07.15.
 *
 *
 * реализация общего управления банковским счетом
 *
 *
 * Если по каким-либо причинам метод для данного класса не имеет реализа-
 ции или его реализация нежелательна, рекомендуется генерация исключения
 в теле метода, а именно:
 public boolean blocking() {
 throw new UnsupportedOperationException(); // лучше собственное исключение
 }
 Менее хорошим примером будет реализация в виде:
 public boolean blocking() {
 return false;
 }
 */
public class AccountBaseActionImpl implements AccountBaseAction {

    public boolean openAccount() {
// more code
        throw new UnsupportedOperationException();
    }
    public boolean closeAccount() {
// more code
        throw new UnsupportedOperationException();
    }
    public void blocking() {
// more code
        throw new UnsupportedOperationException();
    }
    public void unBlocking() {
// more code
        throw new UnsupportedOperationException();
    }
}
