package Java1.Lesson7;

public class HomeWork7 {

    public static void main(String[] args) {

        /*
        1. Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды
        (например, в миске 10 еды, а кот пытается покушать 15-20).
        2. Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). Если коту
        удалось покушать (хватило еды), сытость = true.
        3. Считаем, что если коту мало еды в тарелке, то он её просто не трогает, то есть не может быть
        наполовину сыт (это сделано для упрощения логики программы).
        4. Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и
        потом вывести информацию о сытости котов в консоль.
        5. Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.
         */

        // Cat cat = new Cat("Barsik", 5);
        // Plate plate = new Plate(5);
        // plate.info();
        // cat.eat(plate);
        // plate.info();

//        Cat[] cats = {new Cat("Barsik", 5), new Cat("Pushistik", 7), new Cat("Mars", 10)};
//        Plate plate1 = new Plate(20);
//        plate1.info();
//
//        for (Cat cat : cats) {
//            cat.eat(plate1);
//            cat.catInfo();
//        }
//
//        // plate1.addEat(10);
//        plate1.info();
    }
}

//class Plate {
//    private int food;
//    public Plate(int food) {
//        this.food = food;
//    }
//    public boolean decreaseFood(int n) {
//        if (food >= n) {
//            food -= n;
//            return true;
//        } else {
//            return false;
//        }
//    }
//    public void info() {
//        System.out.println("plate: " + food);
//    }
//
//    public void addEat(int k) {
//        food += k;
//    }
//}
//
//class Cat {
//    private String name;
//    private int appetite;
//    private boolean satiety;
//    public Cat(String name, int appetite) {
//        this.name = name;
//        this.appetite = appetite;
//        this.satiety = false;
//    }
//    public void eat(Plate p) {
//        if (p.decreaseFood(appetite))
//            satiety = true;
//    }
//
//    public void catInfo() {
//        if (satiety) {
//            System.out.println(name + " поел " + appetite + " грамм корма и он сыт");
//        } else {
//            System.out.println(name + " не может поесть, т.к. тарелке нет столько еды и он голоден");
//        }
//    }
//}
