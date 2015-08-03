package io.serializable;

import java.io.Serializable;

/**
 * Created by Grinyov Vitaliy on 31.07.15.
 *
 * сериализуемый класс
 *
 * Спецификаторы transient и static означают, что поля, помеченные ими, не могут
 быть предметом сериализации, но существует различие в десериализации. Так, поле
 со спецификатором transient после десериализации получает значение по умолча-
 нию, соответствующее его типу (объектный тип всегда инициализируется по умол-
 чанию значением null), а поле со спецификатором static получает значение по умол-
 чанию в случае отсутствия в области видимости объектов своего типа, а при их
 наличии получает значение, которое определено для существующего объекта
 */
public class Student implements Serializable {
    protected static String faculty;
    private String name;
    private int id;
    private transient String password;
    private static final long serialVersionUID = 1L;
    /* смысл поля serialVersionUID для класса будет объяснен ниже */
    public Student(String nameOfFaculty, String name, int id, String password) {
        faculty = nameOfFaculty;
        this.name = name;
        this.id = id;
        this.password = password;
    }
    public String toString() {
        return "\nfaculty " + faculty + "\nname " + name + "\nID " + id + "\npassword " + password;
    }
}

