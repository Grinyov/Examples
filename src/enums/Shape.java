package enums;

/**
 * Created by green on 18.07.2015.
 *
 * объявление перечисления с методом
 */
public enum Shape {
    RECTANGLE, TRIANGLE, CIRCLE;
    // метод класса перечисления
    public double defineSquare(double ... x) {
// проверка параметров
        switch (this) {
            case RECTANGLE:
                return x[0] * x[1];
            case TRIANGLE:
                return x[0] * x[1] / 2;
            case CIRCLE:
                return Math.pow(x[0], 2) * Math.PI;
            default:
                throw new EnumConstantNotPresentException(this.getDeclaringClass(),this.name());
        }
    }
}