package l12_strategy.strategy.iter_4.quack;

public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        //do nothing or
        System.out.println("Silence");
    }
}
