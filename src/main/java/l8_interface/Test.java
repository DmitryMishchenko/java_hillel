package l8_interface;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        int a = 2;
        Person p;
        List<Person> people = new ArrayList<>();
        long i = 0;
        while (true) {
            p = new Person("Ivan");
            people.add(p);
            i++;
            if (i % 100000 == 0) {
                people.clear();
                Thread.sleep(100);
                System.out.println(i);
            }
        }
    }

    public static void change(int a) {
        a = 10;
        int b = 100;
        System.out.println("Hello");
    }

    public static void change(Person p) {
        p.firstName = "Alex";
    }

    public static class Person {
        public String firstName;

        public Person(String firstName) {
            this.firstName = firstName;
        }

        @Override
        public String toString() {
            return "Person{" +
                   "firstName='" + firstName + '\'' +
                   '}';
        }
    }
}
