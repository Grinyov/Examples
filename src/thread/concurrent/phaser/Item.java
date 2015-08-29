package thread.concurrent.phaser;

/**
 * Created by green on 30.08.2015.
 *
 * перевозимый товар
 *
 */
public class Item {
    private int registrationNumber;
    public Item(int number) {
        this.registrationNumber = number;
    }
    public int getRegistrationNumber() {
        return registrationNumber;
    }
}
