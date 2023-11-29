//package Java2.Lesson6;
//
//import java.io.PrintWriter;
//import java.sql.*;
//
//public class Test {
//
//    //Объект, который позволяет соединить наше приложение и базу данных
//    private static Connection connection;
//    //Объект с помощью которого мы можем передавать запросы в базу данных и получать какой-то результат
//    private static Statement stmt;
//
//    //Метод подключения к базе
//    public static void connect() {
//
////        PrintWriter pw = response.getWriter();
//        // 1) Для того, чтобы подключится к базе данных, нам сначала нужно загрузить драйвер
//        // в джаву. Эта строка подключит драйвер к нашему java-приложению
//        try {
//            Class.forName("org.sqlite.JDBC");
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//
//        // 2) Теперь, когда мы подключили драйвер, откроем подключение к базе данных
//        try {
//            connection = DriverManager.getConnection("jdbc:sqlite:main.db");
//            // 3) Создадим объект для совершения запросов. С помощью этого объекта мы
//            // можем создавать SQL запросы к нашей базе данных
//            stmt = connection.createStatement();
//            // 4) Создадим запрос и получим результаты этого запроса
//            ResultSet rs = stmt.executeQuery("SELECT * from users");
//
//            while(rs.next()) {
////                pw.println(rs.getString("nickname"));
//                System.out.println(rs.getString("nickname"));
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public static void main(String[] args) {
//        connect();
//    }
//}
