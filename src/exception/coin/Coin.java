package exception.coin;

/**
 * Created by green on 31.07.2015.
 *
 * метод, вызывающий исключение, созданное программистом
 */
public class Coin {
    private double diameter;
    private double weight;
    public double getDiameter() {
        return diameter;
    }
    public void setDiameter(double value) throws CoinLogicException {
        if(value <= 0) {
            throw new CoinLogicException("diameter is incorrect");
        }
        diameter = value;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double value) {
        weight = value;
    }
}
