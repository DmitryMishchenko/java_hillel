package l14_l15_listener.animals.observers;

import l14_l15_listener.animals.Animal;
import l14_l15_listener.animals.observable.Observer;

public class Doctor implements Observer {
    @Override
    public void handle(Animal animal) {

        animal.healed();

        System.out.println("You are healed");
    }
}
