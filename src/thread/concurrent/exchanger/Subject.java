package thread.concurrent.exchanger;

import java.util.concurrent.Exchanger;
/**
 * Created by green on 30.08.2015.
 *
 * содержит Exchanger и представляет основу для производителя и потребителя
 *
 * Существует возможность безопасного обмена объектами, в том числе и син-
 хронизированными. Функционал обмена представляет класс Exchanger с его
 единственным методом T exchange(T ob). Возвращаемый параметр метода —
 объект, который будет принят из другого потока, передаваемый параметр ob
 метода — собственный объект потока, который будет отдан другому потоку.
 Поток Producer представляет информацию о количестве произведенного то-
 вара, поток Consumer — о количестве проданного. В результате обмена произ-
 водитель снизит план производства, если количество проданного товара меньше
 произведенного. Потребитель, к тому же, снижает цену на товар, так как посту-
 пления товара больше, чем продано за время, предшествующее обмену.
 */
public class Subject {
    protected static Exchanger<Item> exchanger = new Exchanger<>();
    private String name;
    protected Item item;
    public Subject(String name, Item item) {
        this.name = name;
        this.item = item;
    }
    public String getName() {
        return name;
    }
    public Item getItem() {
        return item;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setItem(Item item) {
        this.item = item;
    }
}
