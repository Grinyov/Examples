package jdbc.data.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;

import jdbc.data.connect.ConnectorDB;
import jdbc.data.subject.Abonent;

/**
 * Created by green on 26.09.2015.
 *
 * Приложение, осуществляющее простейший запрос на выбор всей информации из таблицы
 *
 * В несложном приложении достаточно контролировать закрытие соединения,
 * так как незакрытое или «провисшее» соединение снижает быстродействие системы.
 */
public class SimpleJDBCRunner {

    public static void main(String[ ] args) throws SQLException {
        /*
        String url = "jdbc:mysql://localhost:3306/testphones";
        Properties prop = new Properties();
        prop.put("user", "root");
        prop.put("password", "pass");
        prop.put("autoReconnect", "true");
        prop.put("characterEncoding", "UTF-8");
        prop.put("useUnicode", "true");
*/
        Connection cn = null;
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        try { // 1 блок
            cn = ConnectorDB.getConnection();//DriverManager.getConnection(url, prop);
            Statement st = null;
            try { // 2 блок
                st = cn.createStatement();
                ResultSet rs = null;
                try { // 3 блок
                    rs = st.executeQuery("SELECT * FROM phonebook");
                    ArrayList<Abonent> lst = new ArrayList<>();
                    while (rs.next()) {
                        int id = rs.getInt(1);
                        int phone = rs.getInt(3);
                        String name = rs.getString(2);
                        lst.add(new Abonent(id, phone, name));
                    }
                    if (lst.size() > 0) {
                        System.out.println(lst);
                    } else {
                        System.out.println("Not found");
                    }
                } finally { // для 3-го блока try
/*
* закрыть ResultSet, если он был открыт
* или ошибка произошла во время
* чтения из него данных
*/
                    if (rs != null) { // был ли создан ResultSet
                        rs.close();
                    } else {
                        System.err.println(
                                "ошибка во время чтения из БД");
                    }
                }
            } finally {
/*
* закрыть Statement, если он был открыт или ошибка
* произошла во время создания Statement
*/
                if (st != null) { // для 2-го блока try
                    st.close();
                } else {
                    System.err.println("Statement не создан");
                }
            }
        } catch (SQLException e) { // для 1-го блока try
            System.err.println("DB connection error: " + e);
/*
* вывод сообщения о всех SQLException
*/
        } finally {
/*
* закрыть Connection, если он был открыт
*/
            if (cn != null) {
                try {
                    cn.close();
                } catch (SQLException e) {
                    System.err.println("Сonnection close error: " + e);
                }
            }
        }
    }
}

