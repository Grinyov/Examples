package oop;

/**
 * Created by Grinyov Vitaliy on 17.07.15.
 *
 * пример параметризованного класса
 *
 */
public class Message <T> {
    private T value;
    public Message() {
    }
    public Message (T value) {
        this.value = value;
    }
    public T getValue() {
        return value;
    }
    public void setValue(T value) {
        this.value = value;
    }
    public String toString() {
        if (value == null) {
            return null;
        }
        return value.getClass().getName() + " :" + value;
    }
}
