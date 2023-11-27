package Java2.Lesson6.DZ;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {

////        private final String SERVER_ADDR = "localhost";
////        private final int SERVER_PORT = 7633;
//        Socket socket = null;
//
//        try {
//            socket = new Socket("localhost", 7633);
////            socket = new Socket(SERVER_ADDR, SERVER_PORT);
//
//            Scanner in = new Scanner(socket.getInputStream());
//            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
//            Scanner console = new Scanner(System.in);
//
////            DataInputStream in = new DataInputStream(socket.getInputStream());
////            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
//
//            Thread t1 = new Thread(new Runnable() {
//                @Override
//                public void run() {
//                    while (true) {
//                        String str = in.nextLine();
////                        String str = in.readUTF();
//                        if (str.equals("/end")) {
//                            out.println("/end");
////                            out.writeUTF("/end");
//                            break;
//                        }
//                        System.out.println("Server " + str);
//                    }
//                }
//            });
//            t1.start();
//
//            Thread t2 = new Thread(new Runnable() {
//                @Override
//                public void run() {
//                    while (true) {
//                        System.out.println("Введите сообщение");
//                        String str = console.nextLine();
////                        String str = console.readUTF();
//                        System.out.println("Cообщение отправлено");
//                        out.println(str);
////                        out.writeUTF(str);
//                    }
//                }
//            });
//            t2.setDaemon(true);
//            t2.start();
//
//            try {
//                t1.join();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                socket.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
    }
}
