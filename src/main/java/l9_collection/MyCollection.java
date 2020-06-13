package l9_collection;

import l10_linkedlist.Node;

import java.util.Collection;
import java.util.Iterator;

public class MyCollection<T> implements Collection {
  private int size = 0;
  private Node head = null;
  private Node tail = null;

  @Override
  public int size() {
    return size;
  }

  @Override
  public boolean isEmpty() {
    return size == 0;
  }

  @Override
  public boolean contains(Object o) {
    Node current = head;

    while(current != null) {
      if (o.equals(current.getData())) {
        return true;
      }

      current = current.getNext();
    }

    return false;
  }

  @Override
  public Iterator iterator() {
    return new Iterator() {
      Node node = head;

      @Override
      public boolean hasNext() {
        return node != null;
      }

      @Override
      public Object next() {
        Node current = node;
        node = node.getNext();

        return current.getData();
      }
    };
  }

  @Override
  public Object[] toArray() {
    Object[] arr = new Object[size];
    int i = 0;

    for (Node node = head; node != null; node = node.getNext()) {
      arr[i++] = node.getData();
    }
    return arr;
  }

  @Override
  public boolean add(Object o) {
    Node node = new Node(o, null);

    if (tail == null) {
      head = node;
      tail = node;
    } else {
      tail.setNext(node);
    }

    tail = node;
    size++;
    return true;
  }

  @Override
  public boolean remove(Object o) {
    Node dummy = new Node(0, head);

    for (Node node = dummy; node != null; node = node.getNext()) {
      Node next = node.getNext();
      if (o.equals(next.getData())) {
        node.setNext(next.getNext());
        if (next.equals(head)) {
          head = next.getNext();
        }
        if (next.equals(tail)) {
          tail = node;
        }
        size--;
        return true;
      }
    }

    return false;
  }

  @Override
  public boolean addAll(Collection c) {
    for (Object o : c) {
      add(o);
    }

    return true;
  }

  @Override
  public void clear() {
    size = 0;
    head = null;
    tail = null;
  }

  @Override
  public boolean retainAll(Collection c) {
    Node dummy = new Node(0, null);
    Node current = dummy;
    int newSize = 0;


    for (Object o : c) {
      if (contains(o)) {
        newSize++;
        current.setNext(new Node(o, null));
        current = current.getNext();
      }
    }

    boolean modified = size < newSize;

    size = newSize;
    head = dummy.getNext();
    tail = current;

    return modified;
  }

  @Override
  public boolean removeAll(Collection c) {
    for (Object o : c) {
      remove(o);
    }

    return true;
  }

  @Override
  public boolean containsAll(Collection c) {
    for (Object o : c) {
      if (!contains(o)) return false;
    }

    return true;
  }

  @Override
  @SuppressWarnings("unchecked")
  public Object[] toArray(Object[] a) {
    if (a.length < size) {
      a = (T[]) java.lang.reflect.Array.newInstance(
        a.getClass().getComponentType(),
        size
      );
    }
    int i = 0;

    for (Node node = head; node != null; node = node.getNext()) {
      a[i++] = node.getData();
    }

    if (a.length > size)
      a[size] = null;

    return a;
  }
}
