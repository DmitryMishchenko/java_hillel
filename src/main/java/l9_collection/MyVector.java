package l9_collection;

import java.util.Collection;
import java.util.Iterator;

public class MyVector implements Collection {

    private Object[] array = new Object[0];

    @Override
    public boolean add(Object object) {
        Object[] newArray = new Object[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        newArray[array.length] = object;
        array = newArray;

        return true;
    }

    @Override
    public String toString() {
        String result = "";
        for (Object o : array) {
            result += (" " + o.toString());
        }
        return result;
    }

    @Override
    public int size() {
        return array.length;
//        throw new NullPointerException();
    }

    @Override
    public boolean isEmpty() {
        return array.length == 0;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return array;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        Object[] toAdd = c.toArray();
        for (Object objectToAdd : toAdd) {
            add(objectToAdd);
        }
        return true;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
}
