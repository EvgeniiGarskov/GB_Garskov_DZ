package Java2.Lesson6.Server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

public class MainServ {

    //Задача заключается в том, чтобы написать сервер, у которого нет web-интерфейса,
    //запустить его и подключиться к нему
    private Vector<ClientHandler> clients;

    public MainServ() {
        // Write your code here

        //Создаем список клиентов из синхронизированной коллекции
        clients = new Vector<>();

        //Это наш сервер
        ServerSocket server = null;
        Socket socket = null;

        try {
            AuthService.connect();
            //Создаём/запускаем новый сервер и определяем порт;
            server = new ServerSocket(8189);
            System.out.println("Сервер запущен!");

            while (true) {
                //Создаем точку подключения клиента и в цикле ожидаем подключения новых клиентов
                socket = server.accept();
                System.out.println("Клиент подключился!");
                //Как только клиент подключился мы добавляем его в список ClientHandler. В списке ClientHandler для каждого клиента создается отдельный
                //поток и входящий/исходящий потоки для взаимодействия по сети(in и out)
                //У всех клиентов разные сокеты
                new ClientHandler(this, socket);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                server.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            AuthService.disconnect();
        }
    }

    //Метод подключения клиента
    public void subscribe(ClientHandler client) {
        clients.add(client);
    }
    //Метод отключения клиента
    public void unsubscribe(ClientHandler client) {
        clients.remove(client);
    }

    public void broadcastMsg(String msg) {
        //Мы берем список клиентов и у каждого клиента вызываем метод sendMsg. То есть передаем сообщение всему списку клиентов и у каждого вызываем sendMsg ->
        for (ClientHandler o : clients) {
            o.sendMsg(msg);
        }
    }
}
