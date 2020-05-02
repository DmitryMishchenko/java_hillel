package l17_map;

import java.util.HashMap;
import java.util.Map;

import l6.inheritance.Person;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Lena", "Ivanova");

        Map<Person, Double> map = new HashMap<>();
        map.put(person, 1000.5);

        System.out.println(new Object().hashCode());
        System.out.println(new Object().hashCode());
        System.out.println(person.hashCode());
//        person.setLastName("Sidorova");







        Person personToFind = new Person("Lena", "Sidorova");

        System.out.println(person.equals(personToFind));
        System.out.println(person.hashCode());
        System.out.println(personToFind.hashCode());






    }
}
