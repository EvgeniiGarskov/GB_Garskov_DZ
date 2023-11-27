package Java2.Lesson6.Server;

import java.sql.*;

public class AuthService {
    //Объект, который позволяет соединить наше приложение и базу данных
    private static Connection connection;
    //Объект с помощью которого мы можем передавать запросы в базу данных и получать какой-то результат
    private static Statement stmt;

    //Метод подключения к базе данных
    public static void connect() {
        try {
            //Инициализация драйвера
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:main.db");
            stmt = connection.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String getNickByLoginAndPass(String login, String pass) {
        String sql = String.format("SELECT nickname FROM users WHERE login = '%s' AND password = '%s'", login, pass);
        try {
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()) {
                return rs.getString(1);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    //Метод, который позволяет отключится от баз данных
    public static void disconnect() {
        try {
            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
