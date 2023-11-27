package Java2.Lesson6.Server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ClientHandler {
    private MainServ serv;
    private Socket socket;
    private String nick;

    DataInputStream in;
    DataOutputStream out;

    public ClientHandler (MainServ serv, Socket socket) {
        try {
            this.serv = serv;
            this.socket = socket;
            this.in = new DataInputStream(socket.getInputStream());
            this.out = new DataOutputStream(socket.getOutputStream());

            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        //Цикл, который отвечает за взаимодействие
                        while (true) {
                            String str = in.readUTF();
                            if (str.startsWith("/auth"));
                            String[] tokens = str.split(" ");
                            String currentNick = AuthService.getNickByLoginAndPass(tokens[1], tokens[2]);
                            if (currentNick != null) {
                                sendMsg("/authok");
                                nick = currentNick;
                                serv.subscribe(ClientHandler.this);
                                break;
                            } else {
                                sendMsg("Неверный логин/пароль");
                            }
                        }
                        //Создаем бесконечный цикл, в котором мы будем взаимодействовать с нашим клиентом (авторизация)
                        //У каждого клиента появляется такой цикл
                        while (true) {
                            //Мы в бесконечном цикле слушаем сообщение
                            String str = in.readUTF();
                            System.out.println("Client: " + str);
                            //Условие выхода
                            if (str.equals("/end")) {
                                out.writeUTF("/serverClosed");
                                break;
                            }
                            //Вызываем метод broadcastMsg ->
                            serv.broadcastMsg(nick + " : " + str);
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    } finally {
                        try {
                            in.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        try {
                            out.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        try {
                            socket.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        serv.unsubscribe(ClientHandler.this);
                    }
                }
            }).start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void sendMsg(String msg) {
        try {
            //У каждого клиента вызывается метод для отправки сообщения. То есть мы одно сообщение распределяем по всем клиентам
            out.writeUTF(msg);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getNick () {
        return nick;
    }
}
