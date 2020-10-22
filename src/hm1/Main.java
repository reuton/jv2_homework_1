package hm1;

public class Main {
    public static void main(String[] args) {

//        Activities[] participantsArray = {
//                new Person(),
//                new Cat(),
//                new Robot()
//        };

        Obstacles obst = new Obstacles();

        Cat cat = new Cat();
        obst.passWall(cat, cat.type,cat.jump);
        obst.passRoad(cat, cat.type,cat.run);

        Person per = new Person();
        obst.passWall(per, per.type,per.jump);
        obst.passRoad(per, per.type,per.run);

        Robot rob = new Robot();
        obst.passWall(rob, rob.type,rob.jump);
        obst.passRoad(rob, rob.type,rob.run);

    }
}
