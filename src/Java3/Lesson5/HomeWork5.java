package Java3.Lesson5;

import java.util.concurrent.CyclicBarrier;

public class HomeWork5 {

    /*
    1. Перенести приведенный ниже код в новый проект, где мы организуем гонки.
    Все участники должны стартовать одновременно, несмотря на разное время подготовки. В тоннель не
    может одновременно заехать больше половины участников (условность).
    Попробуйте все это синхронизировать.
    Первый участник, пересекший финишную черту, объявляется победителем (в момент пересечения
    этой самой черты). Победитель должен быть только один (ситуация с 0 или 2+ победителями
    недопустима).
    Когда все завершат гонку, нужно выдать объявление об окончании.
    Можно корректировать классы (в том числе конструктор машин) и добавлять объекты классов из
    пакета java.util.concurrent.
     */

    public static final int CARS_COUNT = 4;

    public static void main(String[] args) {
        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Подготовка!!!");
        CyclicBarrier barrier = new CyclicBarrier(CARS_COUNT + 1);
        Race race = new Race(new Road(60), new Tunnel(), new Road(40));
        Car[] cars = new Car[CARS_COUNT];
        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car(race, 20 + (int) (Math.random() * 10), barrier);
            new Thread(cars[i]).start();
        }
        try {
            barrier.await();
            System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка началась!!!");
            barrier.await();
            barrier.await();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка закончилась!!!");
    }
}