package hm1;

public class Wall {
    int alt = 2;

    void passWall(Jumpable j, String t, int x) {
        if (alt <= x) {
            System.out.println(t + " перепрыгнул стену");
        } else {
            System.out.println(t + " не перепрыгнул стену. Идёт домой тренироваться");
        }
    }
}