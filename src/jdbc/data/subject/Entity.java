
package jdbc.data.subject;

import java.io.Serializable;

/**
 * Created by green on 26.09.2015.
 *
 * абстрактный класс имплементирующий интерфейсы для поддержки клонирования и сериализации
 */
public abstract class Entity implements Serializable, Cloneable {

    protected int id;
    public Entity() {
    }
    public Entity(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
}
