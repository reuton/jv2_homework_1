package hm1;

public class Cat implements Activities {
    public String type = "Кот";
    public int jump = 1;
    public int run = 500;

    @Override
    public void run() {
        System.out.println("Кот может бежать.");
    }

    @Override
    public void jump() {
        System.out.println("Кот может прыгать.");
    }
}

