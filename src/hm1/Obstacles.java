package hm1;

public class Obstacles {

    int wallAlt = 2;
    int roadLentgh = 20000;

    void passWall(Jumpable j, String t, int x) {
        if (wallAlt <= x) {
            System.out.println(t + " перепрыгнул стену");
        } else {
            System.out.println(t + " не перепрыгнул стену. Идёт домой тренироваться");
        }
    }

    void passRoad (Runable r, String t, int y) {
        if (roadLentgh <= y) {
            System.out.println(t + " пробежал дистанцию");
        } else {
            System.out.println(t + " не пробежал дистанцию. Идёт домой тренироваться");
        }
    }
}


