package Java2.Lesson6.Client;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    /*
    Lesson 6
    1. Разобраться с кодом.
    2. Написать консольный вариант клиент\серверного приложения, в котором пользователь может
    писать сообщения как на клиентской стороне, так и на серверной. Т.е. если на клиентской
    стороне написать «Привет», нажать Enter, то сообщение должно передаться на сервер и там
    отпечататься в консоли. Если сделать то же самое на серверной стороне, сообщение,
    соответственно, передаётся клиенту и печатается у него в консоли. Есть одна особенность,
    которую нужно учитывать: клиент или сервер может написать несколько сообщений подряд.
    Такую ситуацию необходимо корректно обработать.
    Lesson 7
    3. Сделать проверку авторизован ли пользователь на текущий момент (занят ли ник), нельзя войти под одной и той же учетной записью.
    4. * Реализовать личные сообщения, если клиент пишет «/w nick3 Привет», то только клиенту с
    ником nick3 должно прийти сообщение «Привет».
    Lesson 8
    5. Добавить отключение неавторизованных пользователей по тайм-ауту (120 сек. ждём после
    подключения клиента и, если он не авторизовался за это время, закрываем соединение).
    6. Черный список
        - проверка что добавляемый ник существует
        -нельзя добавить в черный список самого себя
        -хранение черного списка в БД
    7. * Реализация свой/чужой (что бы в чате наши сообщения были справа, а чужие слева)
    8. * Отправка личных сообщений автоматизированно (без ручного ввода команд)
     */

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 450, 375));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}