package exception;

/**
 * Created by green on 31.07.2015.
 *
 * Вызываемый метод loadResource() может (при отсутствии требуемого ресурса
 или при аргументе null) генерировать исключение, перехватываемое обработчиком.
 В результате экземпляр непроверяемого исключения IllegalArgumentException как
 подкласса класса RuntimeException передается обработчику исключений
 в методе main().
 */
public class ConnectorRunner {
    public static void main(String[] args) {
        SameResource f = new SameResource(); // SameResource f = null;
        try {// необязателен только при гарантированной корректности значения параметра
            Connector.loadResource(f);
        } catch (IllegalArgumentException e) {
            System.err.print("обработка unchecked-исключения вне метода: " + e);
        }
    }
}
