package l8_interface;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student ivan = new Student("Ivan", "Ivanov");
        Student petya = new Student("Petya", "Petrov");
        Teacher teacher = new Teacher("Fedor", "Fedorov");

//        Greetable[] group = new Greetable[3];
//        group[0] = ivan;
////        group.add(petya);
////        group.add(teacher);
//
//        test(group);
    }

    public static Object[]subArray(Object[] objects){
        return null;
    }









    private static void test(List<Greetable> group) {
        for (Greetable greetable : group) {
            greetable.greet();
        }
    }
}
