package Java2.Lesson2;

public class HomeWork2 {

    public static void main(String[] args) {

        /*
        1 Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4. При
        подаче массива другого размера необходимо бросить исключение MyArraySizeException.
        2 Далее метод должен пройтись по всем элементам массива, преобразовать в int и
        просуммировать. Если в каком-то элементе массива преобразование не удалось (например, в
        ячейке лежит символ или текст вместо числа), должно быть брошено исключение
        MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.
        3 В методе main() вызвать полученный метод, обработать возможные исключения
        MyArraySizeException и MyArrayDataException и вывести результат расчета (сумму элементов,
        при условии, что подали на вход корректный массив).
            Заметка: Для преобразования строки к числу используйте статический метод класса Integer:
            Integer.parseInt(сюда_подать_строку);
            Заметка: Если Java не сможет преобразовать входную строку (в строке число криво написано), то
            будет сгенерировано исключение NumberFormatException.
         */

//        String[][] array = {
//                {"1", "2", "3", "4"},
//                {"1", "2", "3", "4"},
//                {"1", "2", "3", "4"},
//                {"1", "2", "3", "4"}
//        };
//        try {
//            stringArray(array);
//        } catch (MyArraySizeException | MyArrayDataException e) {
//            System.out.println(e.getMessage());
//        }
    }

//    public static void stringArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
//
//        //можно проверку на размер массива вынести отдельно
//        // if(array.length != 4 || array[0].length != 4) {
//        //   throw new MyArraySizeException ("Массив больше, чем 4х4");
//        // }
//
//        int sum = 0;
//
//        for(int i = 0; i < array.length; i++) {
//            for(int j = 0; j < array[i].length; j++) {
//                if (array.length <= 4 && array[i].length <= 4) {
//                    try{
//                        sum += Integer.parseInt(array[i][j]);
//                    } catch (NumberFormatException e) {
//                        throw new MyArrayDataException ("В ячейке не лежит число, ряд : " + i + " колонка: " + j);
//                    }
//                } else {
//                    throw new MyArraySizeException ("Массив больше, чем 4х4");
//                }
//            }
//        }
//        System.out.println("Сумма элементов: " + sum);
//    }
}
