package l12_strategy.strategy.iter_4;

import l12_strategy.strategy.iter_4.fly.FlyBehavior;
import l12_strategy.strategy.iter_4.fly.FlyWithWings;
import l12_strategy.strategy.iter_4.quack.Quack;
import l12_strategy.strategy.iter_4.quack.QuackBehavior;

public class MallardDuck extends Duck {
    public MallardDuck(){
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }
    public MallardDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior){
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }

    @Override
    public void display() {
        System.out.println("I'm a mallard duck");
    }
}
