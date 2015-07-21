package nested;

/**
 * Created by green on 22.07.2015.
 */
public class ShipRunner {

    public static void main(String[ ] args) {
// вызов статического метода
        Ship.LifeBoat.down();
// создание объекта статического класса
        Ship.LifeBoat lifeBoat = new Ship.LifeBoat();
// вызов обычного метода
        lifeBoat.swim();
    }
}
