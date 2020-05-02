package l14_l15_listener.animals;

import java.util.Set;
import java.util.TreeSet;

import l14_l15_listener.AnimalsDescendingComparator;

public class App {

    public static Zoo init() {
        Zoo zoo = new Zoo();
        Dog notCleverDog = new Dog(6, 1, "Muhtar");
        zoo.add(notCleverDog);

        Cat cat = new Cat(1, 3, "Murka");
        zoo.add(cat);
        Lion lion = new Lion(2, 11, "Lion");
        zoo.add(lion);
        Dog dog = new Dog(3, 7, "Tuzik");
        zoo.add(dog);
        Fish fish = new Fish(4, 3, "Karas'");
        zoo.add(fish);
        Dog cleverDog = new Dog(5, 10, "Sharik");
        zoo.add(cleverDog);
        return zoo;
    }

    public static Set initSet() {
        Set set = new TreeSet(new AnimalsDescendingComparator());
        Dog notCleverDog = new Dog(6, 1, "Muhtar");
        set.add(notCleverDog);

        Cat cat = new Cat(1, 3, "Murka");
        set.add(cat);
        Lion lion = new Lion(2, 11, "Lion");
        set.add(lion);
        Dog dog = new Dog(3, 7, "Tuzik");
        set.add(dog);
        Fish fish = new Fish(4, 3, "Karas'");
        set.add(fish);
        Dog cleverDog = new Dog(4, 10, "Sharik");
        set.add(cleverDog);
        return set;
    }

    public static void main(String[] args) {
        Set<Animal> animals = initSet();

        System.out.println(animals);
        System.out.println(animals.size());
    }
}
