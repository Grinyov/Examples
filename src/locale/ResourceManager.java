package locale;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by Grinyov Vitaliy on 29.07.15.
 *
 * менеджер ресурсов
 */
public enum ResourceManager {
    INSTANCE;
    private ResourceBundle resourceBundle;
    private final String resourceName = "property.text";
    private ResourceManager() {
        resourceBundle = ResourceBundle.getBundle(resourceName, Locale.getDefault());
    }
    public void changeResource(Locale locale) {
        resourceBundle = ResourceBundle.getBundle(resourceName, locale);
    }
    public String getString(String key) {
        return resourceBundle.getString(key);
    }
}