package polymorphism;

/**
 * Created by green on 21.07.2015.
 */
public class ManagerFinalize {
    private int id;
    public ManagerFinalize(int value) {
        id = value;
    }
    protected void finalize() throws Throwable {
        try {
// код освобождения ресурсов
            System.out.println("объект будет удален, id=" + id);
        } finally {
            super.finalize();
        }
    }
}
