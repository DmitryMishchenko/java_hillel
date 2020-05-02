package l10_linkedlist;

import java.util.Collection;

public class Test {
    public static void main(String[] args) {
        MyLinkedList collection = new MyLinkedList();
        //add
        collection.add(3);
        collection.add(2);
        collection.add(1);

        //toString
        System.out.println(collection);

//        size
//        System.out.println(collection.size());//2
//        System.out.println(new MyLinkedList().size());//0
//
//        isEmpty
//        System.out.println(collection.isEmpty());//false
//        System.out.println(new MyLinkedList().isEmpty());//true


    }
}
