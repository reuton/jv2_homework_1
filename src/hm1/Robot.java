package hm1;

public class Robot implements Activities {
    public String type = "Робот";
    public int jump = 500;
    public int run = 50000;

    @Override
    public void run() {
        System.out.println("Робот может бежать.");
    }

    @Override
    public void jump() {
        System.out.println("Робот может прыгать.");
    }
}