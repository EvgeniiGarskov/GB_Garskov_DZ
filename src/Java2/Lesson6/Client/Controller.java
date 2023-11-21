//package Java2.Lesson6.Client;
//
//import javafx.fxml.FXML;
//import javafx.fxml.Initializable;
//import javafx.scene.control.TextArea;
//import javafx.scene.control.TextField;
//
//import java.io.DataInputStream;
//import java.io.DataOutputStream;
//import java.io.IOException;
//import java.net.Socket;
//import java.net.URL;
//import java.util.ResourceBundle;
//
//public class Controller implements Initializable {
//
//    @FXML
//    TextArea textArea;
//
//    @FXML
//    TextField textField;
//
//    //Добавим объекты, которые нам потребуются для работы по сети
//    Socket socket;
//    DataInputStream in;
//    DataOutputStream out;
//
//    final String IP_ADRESS = "localhost";
//    final int PORT = 8189;
//
//
//    //Метод, который позволяет производить инициализацию в момент запуска
//    //Как только наш клиент будет запущен, сработает этот метод
//    @Override
//    public void initialize(URL location, ResourceBundle recources) {
//        try {
//            socket = new Socket(IP_ADRESS, PORT);
//            in = new DataInputStream(socket.getInputStream());
//            out = new DataOutputStream(socket.getOutputStream());
//
//            //Как только наш клиент начинает работу, мы объявляем поток и взаимодействуем
//            //с нашим сервером
//            new Thread(new Runnable() {
//                @Override
//                public void run() {
//                    try {
//                        while (true) {
//                            String str = in.readUTF();
//                            textArea.appendText(str + "\n");
//                        }
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                    } finally {
//                        try {
//                            socket.close();
//                        } catch (IOException e) {
//                            e.printStackTrace();
//                        }
//                    }
//                }
//            }).start();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public void sendMsg() {
//
//        try {
//            out.writeUTF(textField.getText());
//            textField.clear();
//            textField.requestFocus();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//    }
//}
