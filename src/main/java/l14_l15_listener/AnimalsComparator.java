package l14_l15_listener;

import java.util.Comparator;

import l14_l15_listener.animals.Animal;

public class AnimalsComparator implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        return o1.getAge() - o2.getAge();
    }
}
