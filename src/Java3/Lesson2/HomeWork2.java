package Java3.Lesson2;

import java.sql.*;

public class HomeWork2 {

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

            ResultSet rs = stmt.executeQuery("SELECT * from users");

            while(rs.next()) {
                System.out.println(rs.getString("nickname"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //Метод, который позволяет отключиться от баз данных
    public static void disconnect() {
        try {
            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void createTable() {

    }

    public static void main(String[] args) {

        connect();
    }
}