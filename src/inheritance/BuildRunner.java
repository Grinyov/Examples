package inheritance;

/**
 * Created by green on 21.07.2015.
 *
 * В данной ситуации при компиляции в подклассе Point3DCreator создают-
 ся три метода createPoint(). Один имеет возвращаемое значение Point3D,
 другие (явно невидимые) — Point1D и Point2D. При обращении к методу createPoint()
 версия метода определяется «ранним связыванием» без использо-
 вания полиморфизма, но при выполнении срабатывает полиморфизм и вызы-
 вается метод с возвращаемым значением Point3D. Обращение к полю также
 производится по типу объекта, возвращаемого методом createPoint(), т. е. к полю
 класса Point3D. Для результатов обращения к полям следует в классах Point1D
 и его наследниках убрать спецификатор private.
 На практике методы подставки могут использоваться для расширения воз-
 можностей класса по прямому извлечению (без преобразования) объектов под-
 классов, инициализированных в ссылке на суперкласс.
 */
public class BuildRunner {

    public static void main(String[ ] args) {
        Point2DCreator br = new Point3DCreator();
// Point3D p = br.createPoint(); // ошибка компиляции
        Point2Dv2 p = br.createPoint(); // "раннее связывание"
        System.out.println(br.createPoint().x);
        System.out.println(br.createPoint().y);
// System.out.println(br.createPoint().z);
    }
}
