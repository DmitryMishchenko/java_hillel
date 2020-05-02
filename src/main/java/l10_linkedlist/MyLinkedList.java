package l10_linkedlist;

import java.util.Collection;
import java.util.Iterator;

public class MyLinkedList {

    private Node head;
    private int size;

    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        return size;
    }

    public boolean contains(Object o) {

        Node current = head;
        while (current != null) {
            if (current.getData().equals(o)) {
                return true;
            }
            current = current.getNext();
        }
        return false;
    }

    public Object[] toArray() {

        Object[] result = new Object[size()];
        Node current = head;
        int i = 0;
        while (current != null) {
            result[i] = current.getData();
            i++;
            current = current.getNext();
        }

        return result;
    }

    public boolean add(Object o) {
        Node next = new Node(o, head);
        size++;
        head = next;
        return true;
    }

    public boolean remove(Object o) {
        size--;
        return false;
    }

    public boolean addAll(Collection c) {
        for (Object object : c) {
            add(object);
        }
        return true;
    }

    public void clear() {
        size = 0;
        head = null;
    }

    //FIXME WTF

    public Iterator iterator() {
        return null;
    }

    public String toString() {
        return toString(head);
    }

    private String toString(Node node) {
        if (node.getNext() == null) {
            return node.getData().toString();
        } else {
            return toString(node.getNext()) +" "+ node.getData().toString();
        }
    }

    //Not interested

    public boolean retainAll(Collection c) {
        return false;
    }

    public boolean removeAll(Collection c) {
        return false;
    }

    public boolean containsAll(Collection c) {
        return false;
    }

    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
}
