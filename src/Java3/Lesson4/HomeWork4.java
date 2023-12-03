package Java3.Lesson4;

public class HomeWork4 {

    /*
    Создать три потока, каждый из которых выводит определенную букву (A, B и C) 5 раз (порядок
    – ABСABСABС). Используйте wait/notify/notifyAll.
     */


    //объект, на котором будем синхронизироваться
    private final Object mon = new Object();
    //Переменная currentLetter указывает на букву, которая должна быть отпечатана в текущий момент времени
    private volatile char currentLetter = 'A';

    public static void main(String[] args) {

        HomeWork4 waitNotifyObj = new HomeWork4();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                waitNotifyObj.printA();
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                waitNotifyObj.printB();
            }
        });

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                waitNotifyObj.printC();
            }
        });

        thread1.start();
        thread3.start();
        thread2.start();
    }

    public void printA() {
        synchronized(mon) {
            try {
                for (int i = 0; i < 5; i++) {
          /*
          Поскольку notify() и notifyAll() случайным образом пробуждают потоки,
          ожидающие на мониторе этого объекта, не всегда важно, чтобы условие
          выполнялось. Иногда поток просыпается, но условие еще не выполнено.

          При запуске невозможно предсказать какой из потоков начнет выполнение первым. Если первый
          запускается поток B, то он просто переходит в режим ожидания. После чего поток А производит
          печать буквы A в консоль, меняет значение переменной currentLetter, и будит поток B. Если поток
          A зайдет на второй шаг цикла, то увидит что сейчас не его очередь печатать и перейдет в состояние
          wait. Теперь поток B производит печать буквы B в консоль, меняет значение переменной
          currentLetter, и будит поток A.
          */
                    while (currentLetter != 'A') {
                        //приостанавливаем поток, пока какой-либо другой поток не вызовет notify() или notifyAll() для того же объекта
                        mon.wait();
                    }
                    System.out.print("A");
                    currentLetter = 'B';
                    //используем метод notify() для пробуждения потоков, ожидающих доступа к монитору этого объекта
                    mon.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void printB() {
        synchronized(mon) {
            try {
                for (int i = 0; i < 5; i++) {
                    while (currentLetter != 'B') {
                        mon.wait();
                    }
                    System.out.print("B");
                    currentLetter = 'C';
                    mon.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void printC() {
        synchronized(mon) {
            try {
                for (int i = 0; i < 5; i++) {
                    while (currentLetter != 'C') {
                        mon.wait();
                    }
                    System.out.print("C");
                    currentLetter = 'A';
                    mon.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
