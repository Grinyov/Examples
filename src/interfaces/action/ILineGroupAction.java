package interfaces.action;

/**
 * Created by Grinyov Vitaliy on 22.07.15.
 *
 * объявление интерфейсов
 *
 * Для более простой идентификации интерфейсов в большом проекте в сообще-
 стве разработчиков действует негласное соглашение о добавлении к имени интер-
 фейса символа I, в соответствии с которым вместо имени ShapeAction следует
 записать IShapeAction. В конец названия может добавляться able в случае, если
 в названии присутствует действие (глагол). В конец имени класса, реализующего
 интерфейс, для указания на источник действий часто добавляется слово Impl.
 */
public interface ILineGroupAction {

    double computePerimeter(AbstractShape shape);
}