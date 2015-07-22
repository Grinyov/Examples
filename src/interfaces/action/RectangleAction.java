package interfaces.action;

/**
 * Created by Grinyov Vitaliy on 22.07.15.
 *
 * реализация интерфейса
 *
 */
public class RectangleAction implements IShapeAction {

    @Override // реализация метода из интерфейса
    public double computeSquare(AbstractShape shape) { // площадь прямоугольника
        double square = 0;
// необходимо проверить тип
        if (shape instanceof Rectangle) {
            Rectangle rectangle = (Rectangle) shape;
            square = rectangle.getA() * rectangle.getB();
        } else {
            throw new IllegalArgumentException("Incompatible shape:"
                    + shape.getClass());
        }
        return square;
    }
    @Override // реализация метода из интерфейса
    public double computePerimeter(AbstractShape shape) { // периметр прямоугольника
        double perimeter = 0;
        if (shape instanceof Rectangle) {
            Rectangle rectangle = (Rectangle) shape;
            perimeter = 2 * (rectangle.getA() + rectangle.getB());
        } else {
            throw new IllegalArgumentException("Incompatible shape:"
                    + shape.getClass());
        }
        return perimeter;
    }
}
