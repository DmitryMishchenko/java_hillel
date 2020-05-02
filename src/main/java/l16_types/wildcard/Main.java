//package lx_generics;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class Main {
//    public static void main(String[] args) {
//        Student ivanov = new Student("Ivan", "Ivanov", "Java");
//
//        //example of collections and inheritance
//        //        1
//        List<Person> persons = new ArrayList<>();
//        persons.add(ivanov);
//        //        persons.add(100);
//        System.out.println(persons);
//
//        //        2
//        List<Object> objects = new ArrayList<>();
//        objects.add("Hello");
//        objects.add(100);
//        System.out.println(objects);
//
//        //       3
//        //        objects = persons;
//        //        objects.add(42);
//        //        Person person = persons.get(3);
//        //        List<String> is not subclass of List<Object>
//        //        parametrized type is invariant
//
//        //        wildcard - ?
//        //        List<? super Person> test = new ArrayList<>();
//        //        testMethod(test);
//        //        List<Person> personList = test;
//        //        test.add(ivanov);
//        //        Object o = test.get(1);
//        String[] str = new String[2];
//        Object[] objects1 = str;
//        objects1[0] = 1;
//        System.out.println(str[0]);
//
//        List<Student> test = new ArrayList<>();
//        testMethod(test);
//    }
//
//    private static void testMethod(List<? super Person> l) {
//        Person person = l.get(1);
//    }
//}
