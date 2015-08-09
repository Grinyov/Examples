package collection;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by green on 09.08.2015.
 *
 * создание экземпляра и файла properties
 *
 */
public class PropertiesDemoWriter {
    public static void main(String[ ] args) {
        Properties props = new Properties();
        try {
// установка значений экземпляру
            props.setProperty("db.driver", "com.mysql.jdbc.Driver");
// props.setProperty("db.url", "jdbc:mysql://127.0.0.1:3306/testphones");
            props.setProperty("db.user", "root");
            props.setProperty("db.password", "pass");
            props.setProperty("db.poolsize", "5");
// запись properties-файла в папку prop проекта
            props.store(new FileWriter("prop" + File.separator + "database.properties"),null);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
