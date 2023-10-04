package Java2.Lesson1;

//public class Course {
//    //Course это кдасс-хранилище препятствий
//    private Obstacles[] obstacles;
//
//    public Course(Obstacles... obstacles) {
//        this.obstacles = obstacles;
//    }
//
//    public void doIt(Team team) {
//
//        //перебераем участников
//        for (Competitor c : team.getMembers()) {
//            //перебераем препятствия для каждого из участников
//            for (Obstacles o : obstacles) {
//                //вызываем на каждом препятствии метод doIt()
//                o.doIt(c);
//                //если после преодаления уастник находится не на дистанции, то выходим из цикла, т.к. он выбыл из марафона
//                if (!c.isOnDistance()) break;
//            }
//        }
//    }
//}
