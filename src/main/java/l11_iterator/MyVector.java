package l11_iterator;

import java.util.Iterator;

public class MyVector implements Iterable {

    private Object[] array = new Object[0];

    public boolean add(Object object) {
        Object[] newArray = new Object[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        newArray[array.length] = object;
        array = newArray;

        return true;
    }

    public String toString() {
        String result = "";
        for (Object o : array) {
            result += (" " + o.toString());
        }
        return result;
    }

    @Override
    public Iterator iterator() {
        return new Palec(this.array);
    }
}
