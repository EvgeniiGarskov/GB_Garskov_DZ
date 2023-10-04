package Java2.Lesson1;

public interface Competitor {

    //интерфейс, который определяет то, что должен уметь каждый из участников
    boolean run(int dist);
    void jump(int height);
    boolean isOnDistance();
    void info();
}
