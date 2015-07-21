package nested;

/**
 * Created by green on 22.07.2015.
 *
 * вложенный класс
 *
 * Если не существует жесткой необходимости в связи объекта внутреннего клас-
 са с объектом внешнего класса, то есть смысл сделать такой класс статическим.
 Вложенный класс логически связан с классом-владельцем, но может быть
 использован независимо от него.
 При объявлении такого внутреннего класса присутствует служебное слово
 static, и такой класс называется вложенным (nested).

 */
public class Ship {

    private int id;
    // abstract, final, private, protected - допустимы
    public static class LifeBoat {
        private int boatId;
        public static void down() {
            System.out.println("шлюпки на воду!");
        }
        public void swim() {
            System.out.println("отплытие шлюпки");
        }
    }
}
