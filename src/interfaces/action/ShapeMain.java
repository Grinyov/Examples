package interfaces.action;

/**
 * Created by green on 23.07.2015.
 *
 * использование параметризованных интерфейсов
 */
public class ShapeMain {
    public static void main(String[ ] args) {
        Rectangle rectShape = new Rectangle(2, 3);
        IShapeAction<Rectangle> rectAction = new RectangleAction();
        Triangle trShape = new Triangle(3, 4, Math.PI / 6);
        IShapeAction<Triangle> trAction = new TriangleAction();
        System.out.println("Square rectangle: " + rectAction.computeSquare(rectShape));
        System.out.println("Perimeter rectangle: " + rectAction.computePerimeter(rectShape));
        System.out.println("Square triangle: " + trAction.computeSquare(trShape));
        System.out.println("Perimeter triangle: " + trAction.computePerimeter(trShape));
// trAction.computePerimeter(rectShape); // ошибка компиляции
    }
}
