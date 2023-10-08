package Java3.Lesson1;

import java.util.ArrayList;
import java.util.Arrays;

public class HomeWork1 {

    public static void main(String[] args) {

        /*
        1. Написать метод, который меняет два элемента массива местами (массив может быть любого
        ссылочного типа);
        2. Написать метод, который преобразует массив в ArrayList;
        3. Задача:
        a. Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
        b. Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу
        фрукта, поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
        c. Для хранения фруктов внутри коробки можно использовать ArrayList;
        d. Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта
        и их количество: вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
        e. Внутри класса Box сделать метод compare(), который позволяет сравнить текущую
        коробку с той, которую подадут в compare() в качестве параметра. true – если их массы
        равны, false в противоположном случае. Можно сравнивать коробки с яблоками и
        апельсинами;
        f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
        Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
        Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются
        объекты, которые были в первой;
        g. Не забываем про метод добавления фрукта в коробку.
         */

//        Integer[] numArray = {1, 2, 3, 4, 5};
//
//        //Свапаем элементы
//        System.out.println("Массив: " + Arrays.toString(numArray));
//        swap(numArray, 1, 2);
//        System.out.println("Поменяли два элемента местами: " + Arrays.toString(numArray));
//
//        //Конвертируем в ArrayList
//        System.out.println("Преобразуем массив в ArrayList: " + convertsToArrayList(numArray));
//
//        // Упражнение 3
//        Box <Apple> boxApples = new Box<>();
//
//        boxApples.add(new Apple());
//        boxApples.add(new Apple());
//        boxApples.add(new Apple());
//
//        Box <Orange> boxOrange = new Box<>();
//
//        boxOrange.add(new Orange());
//        boxOrange.add(new Orange());
//        boxOrange.add(new Orange());
//
//        System.out.println("**********");
//        System.out.println("Вес коробки с яблоками: " + boxApples.getWeight());
//        System.out.println("Вес коробки с апельсинами: " + boxOrange.getWeight());
//        System.out.println("Вес коробок равный? " + boxApples.compare(boxOrange));
//
//        Box <Apple> boxApples2 = new Box<>();
//
//        boxApples2.add(new Apple());
//        boxApples2.add(new Apple());
//
//        System.out.println("Создаём ещё одну коробку с яблоками, вес: " + boxApples2.getWeight());
//        System.out.println("Пересыпим яблоки из первой коробки в третью");
//        boxApples.pourTo(boxApples2);
//        System.out.println("Вес первой коробки с яблоками: " + boxApples.getWeight());
//        System.out.println("Вес второй коробки с яблоками: " + boxApples2.getWeight());
    }

//    public static final <T> void swap(T[] arr, int i, int j) {
//        T temp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
//    }
//
//    public static <T> ArrayList convertsToArrayList(T[] arr) {
//        ArrayList <T> arrayList = new ArrayList<>(Arrays.asList(arr));
//        return arrayList;
//    }
}
