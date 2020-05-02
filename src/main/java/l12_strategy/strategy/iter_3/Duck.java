package l12_strategy.strategy.iter_3;

public class Duck {



    public void quack() {
        System.out.println("Quack");
    }

    public void swim() {
        System.out.println("Swim");
    }

    public void fly() {
        System.out.println("Fly");
    }

    public void display() {
        System.out.println("I'm a usual duck");
    }

    @Override
    public String toString() {
        return "Duck{}";
    }
}
