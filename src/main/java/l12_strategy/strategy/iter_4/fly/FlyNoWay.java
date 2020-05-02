package l12_strategy.strategy.iter_4.fly;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        //do nothing or
        System.out.println("I can't fly");
    }
}
