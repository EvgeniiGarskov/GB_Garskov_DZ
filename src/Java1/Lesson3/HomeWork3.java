package Java1.Lesson3;

import java.util.Arrays;

public class HomeWork3 {

    public static void main(String[] args) {

        /*
        1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1,
        0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
        2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его
        значениями 1 2 3 4 5 6 7 8 … 100;
        3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6
        умножить на 2;
        4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов
        одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами
        (можно только одну из диагоналей, если обе сложно). Определить элементы одной из
        диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0],
        [1][1], [2][2], …, [n][n];
        5. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий
        одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;
        6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы;
        7. ** Написать метод, в который передается не пустой одномерный целочисленный массив,
        метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части
        массива равны.
        Примеры:
        checkBalance([2, 2, 2, 1, 2, 2, ||| 10, 1]) → true, т.е. 2 + 2 + 2 + 1 + 2 + 2 = 10 + 1
        checkBalance([1, 1, 1, ||| 2, 1]) → true, т.е. 1 + 1 + 1 = 2 + 1
        граница показана символами |||, эти символы в массив не входят и не имеют никакого
        отношения к ИЛИ.
        8. *** Написать метод, которому на вход подается одномерный массив и число n (может быть
        положительным, или отрицательным), при этом метод должен сместить все элементы массива
        на n позиций. Элементы смещаются циклично. Для усложнения задачи нельзя пользоваться
        вспомогательными массивами. Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5,
        6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ]. При каком n в какую сторону сдвиг можете
        выбирать сами.
         */

//        Упражнение 1
//        int[] myArray = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
//        System.out.println("Оригинальный массив: " + Arrays.toString(myArray));
//        invertMyArray(myArray);
//        System.out.println("После замены 0 на 1: " + Arrays.toString(myArray));
//        System.out.println("**********");

//        Упражнение 2
//        int[] Array = new int[100];
//        array(Array);
//        System.out.println("**********");

//        Упражнение 3
//        int[] arrNum = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
//        System.out.println("After: " + Arrays.toString(arrNum));
//        arrayMultiplication(arrNum);
//        System.out.println("Before: " + Arrays.toString(arrNum));
//        System.out.println("**********");

//        Упражнение 4
//        int[][] twoDimArr = new int[7][7];
//        twoDimArray(twoDimArr);
//        System.out.println("**********");

//        Упражнение 5
//        int[] arrayFill = lenToInitialValue(5, 7);
//        System.out.println(Arrays.toString(arrayFill));
//        System.out.println("**********");

//        Упражнение 6
//        int[] arrNum2 = {53, 32, 19, 79, 25, 5, 47};
//        System.out.println("The original array: " + Arrays.toString(arrNum2));
//        //Вариант 1
////        minAndMax(arrNum2);
//        //Вариант 2
//        System.out.println("Minimum element: " + findMin(arrNum2));
//        System.out.println("Maximum element: " + findMax(arrNum2));
//        System.out.println("**********");

        //Упражнение 7
//        int[] arrNum3 = {2, 2, 2, 1, 2, 2, 10, 1};
//        System.out.println(Arrays.toString(arrNum3));
//        System.out.println(checkBalance(arrNum3));
    }

    //Упражнение 1
//    public static void invertMyArray(int[] array) {
//
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] == 0) {
//                array[i] = 1;
//            } else {
//                array[i] = 0;
//            }
//        }
//    }

    //Упражнение 2
//    public static void array(int[] array) {
//
//        for (int i = 0; i < array.length; i++) {
//            array[i] = i + 1;
//        }
//
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + " | ");
//        }
//    }

    //Упражнение 3
//    public static void arrayMultiplication(int[] array) {
//
//        for (int i = 0; i < array.length; i++) {
//
//            if (array[i] < 6) {
//                array[i] *= 2;
//            }
//        }
//    }

    //Упражнение 4
//    public static void twoDimArray(int[][] array) {
//
//        for (int i = 0; i < array.length; i++) {
//            array[i][i] = 1;
//            array[i][array.length - i - 1] = 1;
//        }
//
//        for (int x = 0; x < array.length; x++) {
//            for (int y = 0; y < array.length; y++) {
//                System.out.print(array[x][y] + " | ");
//            }
//            System.out.println();
//        }
//    }

    //Упражнение 5
//    public static int[] lenToInitialValue(int len, int initialValue) {
//
//        int [] array = new int[len];
//
//        Arrays.fill(array, initialValue);
//
////        for (int i = 0; i < array.length; i++) {
////            array[i] = initialValue;
////        }
//        return array;
//    }

    //Упражнение 6
    //Вариант 1
//    public static void minAndMax(int[] array) {
//
//        Arrays.sort(array);
//        System.out.println("Minimum array element: " + array[0]);
//        System.out.println("Maximum array element: " + array[array.length - 1]);
//    }

//    public static int findMin(int[] array) {
//        int min = array[0];
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] < min) {
//                min = array[i];
//            }
//        }
//        return min;
//    }
//
//    public static int findMax(int[] array) {
//        int max = array[0];
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] > max) {
//                max = array[i];
//            }
//        }
//        return max;
//    }

    //Упражнение 7
//    private static boolean checkBalance(int[] arrNum3) {
//
//        int right = 0, left = 0;
//
//        for (int i = 0; i < arrNum3.length-1; i++) {
//            left += arrNum3[i];
//            for (int j = i + 1; j < arrNum3.length; j++) {
//                right += arrNum3[j];
//            }
//            if (left == right) {
//                return true;
//            }
//            right = 0;
//        }
//        return false;
//    }
}
