package l14_l15_listener.animals;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Animal> animals;

    public Zoo() {
        animals = new ArrayList<Animal>();
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void add(Animal animal) {
        animals.add(animal);
    }

    public Animal get(int index) {
        return animals.get(index);
    }

    public Animal remove(int index) {
        return animals.remove(index);
    }
}