package locale;

import java.util.Locale;

/**
 * Created by Grinyov Vitaliy on 29.07.15.
 *
 * извлечение информации из файла ресурсов и смена локали
 *
 */
public class ResourceManagerRun {
    public static void main(String[ ] args) {
        ResourceManager manager = ResourceManager.INSTANCE;
        System.out.println(manager.getString("str1"));
        manager.changeResource(new Locale("ua","UA"));
        System.out.println(manager.getString("str1"));
    }
}
