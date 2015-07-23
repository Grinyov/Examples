package interfaces.action;

/**
 * Created by Grinyov Vitaliy on 22.07.15.
 */
public interface IShapeAction <T extends AbstractShape> {

        double computeSquare(T shape);
        double computePerimeter(T shape);
}
