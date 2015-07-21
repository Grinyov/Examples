package polymorphism;

import java.util.Vector;

/**
 * Created by green on 21.07.2015.
 *
 * глубокое клонирование
 *
 * Если же поле клонируемого типа является изме-
 няемым объектным типом, то для корректного клонирования требуется другой
 подход. Причина заключается в том, что при создании копии поля оригинал
 и копия представляют собой ссылку на один и тот же объект.
 В этой ситуации следует также клонировать и объект поля класса, если он
 сам поддерживает клонирование
 */
public class StudentDeepClon implements Cloneable{

    private int id = 7;
    private String name;
    private int age;
    private Vector<Byte> v = new Vector<Byte>(); // список оценок – изменяемое поле
    /* конструкторы, методы */
    public StudentDeepClon clone() { // метод-подставка
        StudentDeepClon copy = null;
        try {
            copy = (StudentDeepClon)super.clone();
            copy.v = (Vector<Byte>)v.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace(); //не реализован интерфейс Cloneable !
        }
        return copy;
    }
}
