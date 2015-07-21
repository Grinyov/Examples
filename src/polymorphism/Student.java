package polymorphism;

/**
 * Created by Grinyov Vitaliy on 21.07.15.
 *
 * переопределение методов equals(), hashCode(), toString()
 *
 * Выражение 31 * id + age гарантирует различные результаты вычислений
 при перемене местами значений полей, а именно: если id=1 и age=2, то в ре-
 зультате будет получено 33, если значения поменять местами, то 63. Такой
 подход применяется при наличии у классов полей базовых типов.
 Метод equals() переопределяется для класса Student таким образом, чтобы
 убедиться в том, что полученный объект является объектом типа Student,
 а также сравнить содержимое полей id, name и age соответственно у вызыва-
 ющего метод объекта и объекта, передаваемого в качестве параметра. Для под-
 класса всегда придется создавать собственную реализацию метода.
 */
public class Student {

    private int id;
    private String name;
    private int age;
    public Student(int id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Student other = (Student) obj;
        if (age != other.age)
            return false;
        if (id != other.id)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }
    public int hashCode() {
        return (int)(31 * id + age + ((name == null) ? 0 : name.hashCode()));
    }
    public String toString() {
        return getClass().getName() + "@name" + name + " id:" + id + " age:" + age;
    }

}
