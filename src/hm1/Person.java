package hm1;

public class Person implements Activities {
    public String type = "Человек";
    public int jump = 2;
    public int run = 10000;

    @Override
    public void run() {
        System.out.println("Человек может бежать");
    }

    @Override
    public void jump() {
        System.out.println("Человек может прыгать");
    }


}
