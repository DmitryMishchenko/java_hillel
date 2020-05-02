package l12_strategy.strategy.iter_4;

import l12_strategy.strategy.iter_4.fly.FlyBehavior;
import l12_strategy.strategy.iter_4.quack.QuackBehavior;

public class Duck {
    int id;
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("Swim");
    }

    public void display() {
        System.out.println("I'm a usual duck");
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    @Override
    public String toString() {
        return "Duck{" +
               "id=" + id + "}";
    }

    @Override
    public boolean equals(Object o){
        Duck duck = (Duck)o;
        return duck.id == id;
    }
}
