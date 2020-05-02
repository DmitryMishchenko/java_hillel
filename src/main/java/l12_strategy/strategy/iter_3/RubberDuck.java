package l12_strategy.strategy.iter_3;

public class RubberDuck extends Duck {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
    @Override
    public void display() {
        System.out.println("I'm a rubber duck");
    }

    @Override
    public void fly() {
        throw new RuntimeException("I can't fly");
    }
}
