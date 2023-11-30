package Java1.Lesson2;

public class HomeWork2 {

    public static void main(String[] args) {

        /*
        1. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит
        в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.

        2. Написать метод, которому в качестве параметра передается целое число, метод должен
        напечатать в консоль, положительное ли число передали или отрицательное. Замечание: ноль
        считаем положительным числом.

        3. Написать метод, которому в качестве параметра передается целое число. Метод должен
        вернуть true, если число отрицательное, и вернуть false если положительное.

        4. Написать метод, которому в качестве аргументов передается строка и число, метод должен
        отпечатать в консоль указанную строку, указанное количество раз;

        5. * Написать метод, который определяет, является ли год високосным, и возвращает boolean
        (високосный - true, не високосный - false). Каждый 4-й год является високосным, кроме каждого
        100-го, при этом каждый 400-й – високосный.
         */

        System.out.println("Результат: " + within10and20(7, 5));
        System.out.println("**********");

        isPositiveOrNegative(35);
        System.out.println("**********");

        System.out.println(isNegative(-7));
        System.out.println("**********");

        printWordNTimes("Hello", 5);
        System.out.println("**********");

        System.out.println(wiscoseYear(2023));
    }

    //Упражнение 1
    public static boolean within10and20(int a, int b) {

        return (a + b) >= 10 && (a + b) <= 20;
    }

    //Упражнение 2
    public static void isPositiveOrNegative(int c) {

        if (c >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    //Упражнение 3
    public static boolean isNegative(int d) {

        if (d < 0) {
            return true;
        }
        return false;
    }

    //Упражнение 4
    public static void printWordNTimes(String word, int times) {

        for (int i = 1; i <= times; i++) {
            System.out.println(word);
        }
    }

    //Упражнение 5
    public static boolean wiscoseYear(int year) {

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
