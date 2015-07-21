package polymorphism;

/**
 * Created by Grinyov Vitaliy on 21.07.15.
 *
 * класс, поддерживающий клонирование
 *
 */
public class StudentClon implements Cloneable{
    private int id = 71;
    private String name;
    private int age;
    /* конструкторы, методы */
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    @Override
    public Object clone() throws CloneNotSupportedException { // переопределение
        return super.clone(); // вызов базового метода
    }
}
