package exception.construction;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

/**
 * Created by green on 31.07.2015.
 */
class ConcreteResource extends Resource { // ранее созданный класс
    // ранее созданный конструктор
    public ConcreteResource(String name) throws FileNotFoundException {
        super(name);
// more code
    }
    // ранее созданный конструктор
    public ConcreteResource() throws IOException {
        super("file.txt");
// more code
    }
    // новый конструктор
    public ConcreteResource(String name, int mode) throws FileNotFoundException { /* ошибка компил€ции */
        super(name);
// more code
    }
    public ConcreteResource(String name, int mode, String type) throws ParseException, FileNotFoundException {
/* ошибка компил€ции */
        super(name);
// more code
    }
}
