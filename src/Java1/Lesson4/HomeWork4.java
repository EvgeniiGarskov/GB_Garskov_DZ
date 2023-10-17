package Java1.Lesson4;

import java.util.Random;
import java.util.Scanner;

public class HomeWork4 {

//    public static char[][] map;
//    public static int mapSizeX;
//    public static int mapSizeY;
//
//    public static char human = 'X';
//    public static char ai = 'O';
//    public static char empty_field = '_';
//
//    public static Scanner scanner = new Scanner(System.in);
//    public static Random random = new Random();
//
//    //Метод создания карты
//    public static void createMap() {
//        mapSizeX = 3;
//        mapSizeY = 3;
//        map = new char[mapSizeY][mapSizeX];
//
//        for (int y = 0; y < mapSizeY; y++) {
//            for (int x = 0; x < mapSizeX; x++) {
//                map[y][x] = empty_field;
//            }
//        }
//    }
//
//    //Метод, который выводит игровое поле
//    public static void showMap() {
//        for (int y = 0; y < mapSizeY; y++) {
//            for (int x = 0; x < mapSizeX; x++) {
//                System.out.print(map[y][x] + "|");
//            }
//            System.out.println();
//        }
//        System.out.println("----------");
//    }
//
//    //Метод хода игрока
//    public static void humanTurn() {
//        int x;
//        int y;
//
//        //Игрок ходит, а потом в цикле while проверяем что ход сделан внутри игрового поля и в свободную ячейку
//        do {
//            System.out.println("Enter your turn coordinates from 1 before " + mapSizeX + ":");
//            x = scanner.nextInt() - 1;
//            y = scanner.nextInt() - 1;
//        } while (!isValidCell(x, y) || !isEmptyCell(x, y));
//        map[y][x] = human;
//    }
//
//    //Метод хода искусственного интеллекта
//    public static void aiTurn() {
//        int x;
//        int y;
//
//        do {
//            x = random.nextInt(mapSizeX); //[0;mapSize)
//            y = random.nextInt(mapSizeY);
//        } while (!isEmptyCell(x, y));
//        System.out.println("AI turn is [" + (y + 1) + ":" + (x + 1) + "]");
//        map[y][x] = ai;
//    }
//
//    //Метод, который проверяет то, что ход сделан внутри игрового поля
//    public static boolean isValidCell(int x, int y) {
//        return x >= 0 && x < mapSizeX && y >= 0 && y < mapSizeY;
//    }
//
//    //Метод, который проверят пустая ячейка или нет
//    public static boolean isEmptyCell(int x, int y) {
//        return map[y][x] == empty_field;
//    }
//
//    //Метод проверки ничьей
//    public static boolean isDraw() {
//        for (int y = 0; y < mapSizeY; y++) {
//            for (int x = 0; x < mapSizeX; x++) {
//                if (map[y][x] == empty_field) {
//                    return false;
//                }
//            }
//        }
//        return true;
//    }
//
//    //Метод проверки выигрыша
//    public static boolean isWin(char player) {
//        if (map[0][0] == player && map[0][1] == player && map[0][2] == player) return true;
//        if (map[1][0] == player && map[1][1] == player && map[1][2] == player) return true;
//        if (map[2][0] == player && map[2][1] == player && map[2][2] == player) return true;
//
//        if (map[0][0] == player && map[1][0] == player && map[2][0] == player) return true;
//        if (map[0][1] == player && map[1][1] == player && map[2][1] == player) return true;
//        if (map[0][2] == player && map[1][2] == player && map[2][2] == player) return true;
//
//        if (map[0][0] == player && map[1][1] == player && map[2][2] == player) return true;
//        if (map[0][2] == player && map[1][1] == player && map[2][0] == player) return true;
//
//        return false;
//    }
//
    public static void main(String[] args) {

        /*
        1. Полностью разобраться с кодом, попробовать переписать с нуля, стараясь не подглядывать в
        методичку.
        2. Переделать проверку победы, чтобы она не была реализована просто набором условий,
        например, с использованием циклов.
        3. * Попробовать переписать логику проверки победы, чтобы она работала для поля 5х5 и
        количества фишек 4. Очень желательно не делать это просто набором условий для каждой из
        возможных ситуаций;
        4. *** Доработать искусственный интеллект, чтобы он мог блокировать ходы игрока.
         */

//        createMap();
//        showMap();
//
//        while (true) {
//            humanTurn();
//            showMap();
//            if (isWin(human)) {
//                System.out.println("Human win!!!");
//                break;
//            }
//
//            if (isDraw()) {
//                System.out.println("Is Draw!!!");
//                break;
//            }
//
//            aiTurn();
//            showMap();
//
//            if (isWin(ai)) {
//                System.out.println("AI win!!!");
//                break;
//            }
//
//            if (isDraw()) {
//                System.out.println("Is Draw!!!");
//                break;
//            }
//        }
//        System.out.println("Game over!");
    }
}
