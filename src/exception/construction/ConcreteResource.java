package exception.construction;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

/**
 * Created by green on 31.07.2015.
 */
class ConcreteResource extends Resource { // ����� ��������� �����
    // ����� ��������� �����������
    public ConcreteResource(String name) throws FileNotFoundException {
        super(name);
// more code
    }
    // ����� ��������� �����������
    public ConcreteResource() throws IOException {
        super("file.txt");
// more code
    }
    // ����� �����������
    public ConcreteResource(String name, int mode) throws FileNotFoundException { /* ������ ���������� */
        super(name);
// more code
    }
    public ConcreteResource(String name, int mode, String type) throws ParseException, FileNotFoundException {
/* ������ ���������� */
        super(name);
// more code
    }
}
