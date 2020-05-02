package l12_strategy.strategy.iter_2;

public class Main {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        Duck redHead = new RedheadDuck();

        mallard.swim();
        redHead.swim();

        mallard.quack();
        redHead.quack();

        mallard.display();
        redHead.display();

        mallard.fly();
        redHead.fly();
    }
}
