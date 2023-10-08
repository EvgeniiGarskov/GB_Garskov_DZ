package Java3.Lesson1;

import java.util.ArrayList;

//public class Box <T extends Fruit>{
//
//    private ArrayList<T> box;
//    private double weightBox;
//
//    public Box() {
//        this.box = new ArrayList<>();
//    }
//
//    //Добавление фрукта в коробку
//    public void add(T fruit) {
//        box.add(fruit);
////        weight += fruitWeight(fruit);
//        weightBox += fruit.getWeight();
//    }
//
//    //Вычисление веса одного фрукта
////    public double fruitWeight(T fruit) {
////        if (fruit instanceof Apple) {
////            return 1.0;
////        } else if (fruit instanceof Orange) {
////            return 1.5;
////        } else {
////            return 0;
////        }
////    }
//
//    //Геттер, который возвращает вес всей коробки
//    public double getWeight() {
//        return weightBox;
//    }
//
//    //Сравнивание веса текущей коробки с другой коробкой
//    public boolean compare(Box<?> box) {
//        return Double.compare(this.getWeight(), box.getWeight()) == 0;
//    }
//
//    //Пересыпание фруктов из текущей коробки в другую
//    public void pourTo(Box<T> boxFruits) {
//        for (T fruit : box) {
//            boxFruits.add(fruit);
//        }
//        box.clear();
//
//        weightBox = 0;
//    }
//}
