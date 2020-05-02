package l9_collection;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        MyVector vector = new MyVector();

        //add and toString
        System.out.println(vector);
        vector.add("hello");
        vector.add("czesc");
        System.out.println(vector);

        //isEmpty
        System.out.println(vector.isEmpty());
        System.out.println(new MyVector().isEmpty());

        //addAll
        ArrayList a = new ArrayList();
        a.add(1);
        a.add(2);

        vector.addAll(a);


        System.out.println(vector.size());
        vector.add(a);
        System.out.println(vector.size());

        System.out.println(vector);



    }
}
