//package Java2.Lesson6.Server;
//
//import java.io.IOException;
//import java.net.ServerSocket;
//import java.net.Socket;
//import java.util.Scanner;
//import java.io.PrintWriter;
//import java.util.Vector;
//
//public class MainServ {
//
//    //Создаем синхронизированную коллекцию
//    private Vector<ClientHandler> clients;
//
//    public MainServ() {
//        // Write your code here
//
//        //Задача заключается в том, чтобы написать сервер, у которого нет web-интерфейса,
//        //запустить его и подключиться к нему
//
//        clients = new Vector<>();
//
//        //Это наш сервер
//        ServerSocket server = null;
//        Socket socket = null;
//
//        try {
//            //Создаём новый сервер сокет и определяем порт;
//            server = new ServerSocket(8189);
//            System.out.println("Сервер запущен!");
//
//            while (true) {
//                //Создаем точку подключения клиента
//                socket = server.accept();
//                System.out.println("Клиент подключился!");
//
//                clients.add(new ClientHandler(this, socket));
//            }
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                socket.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//            try {
//                server.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//
//    public void broadcastMsg(String msg) {
//        for (ClientHandler o : clients) {
//            o.sendMsg(msg);
//        }
//    }
//}
