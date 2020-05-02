package l11_iterator;

import java.util.Iterator;

public class Palec implements Iterator {
    private int position = 0;
    private Object[] objects;

    public Palec(Object[] objects) {
        this.objects = objects;
    }

    @Override
    public boolean hasNext() {
        return position < objects.length;
    }

    @Override
    public Object next() {
        Object o = objects[position];
        position++;
        return o;
    }
}
