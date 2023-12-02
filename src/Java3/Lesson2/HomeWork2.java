//package Java3.Lesson2;
//
//import java.sql.*;
//
//public class HomeWork2 {
//
//    //Объект, который позволяет соединить наше приложение и базу данных
//    private static Connection connection;
//    //Объект с помощью которого мы можем передавать запросы в базу данных и получать какой-то результат
//    private static Statement stmt;
//
//    //Метод подключения к базе данных
//    public static void connect() {
//        try {
//            //Инициализация драйвера
//            Class.forName("org.sqlite.JDBC");
//            connection = DriverManager.getConnection("jdbc:sqlite:tableJava3.db");
//            stmt = connection.createStatement();
//
////            ResultSet rs = stmt.executeQuery("SELECT * from users");
//            ResultSet rs = stmt.executeQuery("SELECT * from books");
//
//            while(rs.next()) {
//                System.out.println(rs.getString("title"));
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    //Метод, который позволяет отключиться от баз данных
//    public static void disconnect() {
//        try {
//            connection.close();
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }
//    }
//
//    public static void createNewTable() {
//
//        try {
//            String create = "CREATE TABLE IF NOT EXISTS books (\n"
//                    + " id serial NOT NULL,\n"
//                    + " title varchar(100) NOT NULL, \n"
//                    + " author varchar(100) NOT NULL, \n"
//                    + " quantity numeric NOT NULL)";
//
//            stmt.executeUpdate(create);
//        } catch (SQLException e) {
//            System.out.println(e.getMessage());
//        }
//    }
//
//    public static void updateTable() {
//
//        try {
//            String update = "INSERT INTO books (id, title, author, quantity) VALUES (1, 'War and Peace', 'Leo Tolstoy', 10)";
//
//            stmt.executeUpdate(update);
//        } catch (SQLException e) {
//            System.out.println(e.getMessage());
//        }
//    }
//
//    public static void deleteTable() {
//
//        try {
//            String delete = "DROP TABLE books";
//
//            stmt.executeUpdate(delete);
//        } catch (SQLException e) {
//            System.out.println(e.getMessage());
//        }
//    }
//
//    public static void main(String[] args) {
//
//        connect();
////        createNewTable();
////        updateTable();
////        deleteTable();
//    }
//}