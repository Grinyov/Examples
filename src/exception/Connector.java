package exception;

/**
 * Created by green on 31.07.2015.
 */
public class Connector {
    public static void loadResource(SameResource f) {
        if (f == null || !f.exists() || !f.isCreate()) {
            throw new IllegalArgumentException(); /* ��������� ���������� */
// ��� �����������, �-�, throw new IllegalResourceException();
        }
// more code
    }
}
