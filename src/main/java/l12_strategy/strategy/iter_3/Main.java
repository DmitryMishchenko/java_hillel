package l12_strategy.strategy.iter_3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        Duck redHead = new RedheadDuck();
        Duck rubber = new RubberDuck();

        List<Duck> ducks = new ArrayList<>();
        ducks.add(mallard);
        ducks.add(redHead);
        ducks.add(rubber);


        new Main().pound(ducks);

    }

    public  void pound(List<Duck> ducks){
        for (Duck duck: ducks){
            duck.swim();
            duck.quack();
            duck.display();
            duck.fly();
        }

    }
}
