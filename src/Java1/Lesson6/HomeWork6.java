package Java1.Lesson6;

public class HomeWork6 {

    public static void main(String[] args) {

        /*
        1. Создать классы Собака и Кот с наследованием от класса Животное.
        2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина
        препятствия. Результатом выполнения действия будет печать в консоль. (Например,
        dogBobik.run(150); -> 'Бобик пробежал 150 м.');
        3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание:
        кот не умеет плавать, собака 10 м.).
        4. * Добавить подсчет созданных котов, собак и животных.
         */

//        String win = "успешно завершает дистанцию";
//        String lose = "не смог завершить дистанцию";
//        String notSwim = "не может, т.к. не умеет плавать";
//        String nameParticipant;
//        String resultParticipant;
//
//        float distanceRun = 180;
//        float distanceSwim = 7;
//
//        Dog dog1 = new Dog("Reks", 500, 10);
//        Dog dog2 = new Dog("Bobik", 430, 10);
//        Cat cat1 = new Cat("Marsik", 200, 5);
//        Cat cat2 = new Cat("Boris", 150, 9);
//
//        Animal[] animals = {dog1, dog2, cat1, cat2};
//
//        // System.out.print("В забеге на " + distanceRun + " метров участвуют: ");
//        for (int i = 0; i < animals.length; i++){
//            // System.out.print(animals[i].getName() + "; ");
//
//            nameParticipant = animals[i].getName() + " пытается пробежать дистанцию " + distanceRun + " метров";
//            resultParticipant = animals[i].run(distanceRun) ? win : lose;
//            checkResult(nameParticipant, resultParticipant);
//
//            nameParticipant = animals[i].getName() + " пытается проплыть дистанцию " + distanceSwim + " метров";
//            resultParticipant = animals[i].swim(distanceSwim) ? win : lose;
//            if (resultParticipant == lose) {
//                resultParticipant = notSwim;
//            }
//            checkResult(nameParticipant, resultParticipant);
//        }
//    }
//
//    public static void checkResult(String nameParticipant, String resultParticipant) {
//        System.out.println(nameParticipant + " и " + resultParticipant);
    }
}
