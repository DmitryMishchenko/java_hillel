package l12_strategy.strategy.iter_4;

import l12_strategy.strategy.iter_4.fly.FlyNoWay;
import l12_strategy.strategy.iter_4.quack.Squeak;

public class RubberDuck extends Duck {
    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("I'm a rubber duck");
    }
}
