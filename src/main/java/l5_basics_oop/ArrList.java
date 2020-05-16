package l5_basics_oop;

import java.util.*;

public class ArrList<T> implements List<T> {
  private static final int DEFAULT_CAPACITY = 10;
  private int capacity = DEFAULT_CAPACITY;
  private int size = 0;
  private Object[] data;

  public ArrList() {
    data = new Object[capacity];
  }

  public ArrList(T[] initData) {
    int capacity = Math.max(initData.length * 2, DEFAULT_CAPACITY);
    this.capacity = capacity;
    data = new Object[capacity];

    size = initData.length;
    System.arraycopy(initData, 0, data, 0, size);
  }

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
    return indexOf(o) >= 0;
  }

  @Override
  public Iterator iterator() {
    return null;
  }

  @Override
  public Object[] toArray() {
    return Arrays.copyOf(data, size);
  }

  @Override
  public boolean add(T val) {
    ensureCapacity(1);
    data[size] = val;
    size++;
    return true;
  }

  @Override
  public boolean remove(Object o) {
    int indexToRemove = indexOf(o);

    if (indexToRemove == -1) {
      return false;
    }

    remove(indexToRemove);

    return true;
  }

  @Override
  public boolean addAll(Collection c) {
    ensureCapacity(c.size());

    c.forEach(o -> add((T) o));

    return false;
  }

  @Override
  public boolean addAll(int index, Collection c) {
    ensureCapacity(c.size());
    if (index < 0) return false;

    if (index >= size) {
      return addAll(c);
    }

    for (int i = size - 1; i >= index; i--) {
      data[i + c.size()] = data[i];
    }

    int i = index;
    for (Object o : c) {
      data[i++] = o;
    }

    size = size + c.size();

    return false;
  }

  @Override
  public void clear() {
    capacity = DEFAULT_CAPACITY;
    data = new Object[capacity];
    size = 0;
  }

  @Override
  public T get(int index) {
    if (invalidIndex(index)) return null;
    return data(index);
  }

  @Override
  public T set(int index, Object element) {
    if (invalidIndex(index)) return null;

    T old = data(index);
    data[index] = element;
    return old;
  }

  @Override
  public void add(int index, Object element) {
    if (invalidIndex(index)) return;
    Object prev = element;
    for (int i = index; i <= size; i++) {
      Object current = data[i];
      data[i] = prev;
      prev = current;
    }
    size++;
  }

  @Override
  public T remove(int index) {
    if (invalidIndex(index)) return null;

    T removedObj = data(index);

    for (int i = index + 1; i <= size; i++) {
      data[i - 1] = data[i];
    }
    size--;

    return removedObj;
  }

  @Override
  public int indexOf(Object o) {
    for (int i = 0; i < size; i++) {
      if (data[i] == o) {
        return i;
      }
    }

    return -1;
  }

  @Override
  public int lastIndexOf(Object o) {
    for (int i = size - 1; i >= 0; i--) {
      if (data[i] == o) {
        return i;
      }
    }
    return -1;
  }

  @Override
  public ListIterator<T> listIterator() {
    return null;
  }

  @Override
  public ListIterator listIterator(int index) {
    return null;
  }

  @Override
  public List subList(int fromIndex, int toIndex) {
    if (!isSubListValidBoundaries(fromIndex, toIndex)) {
      return null;
    }

    Object[] subListArr = new Object[toIndex - fromIndex];

    for (int i = fromIndex; i < toIndex; i++) {
      subListArr[subListArr.length] = data[i];
    }

    return new ArrList<>(subListArr);
  }

  private boolean isSubListValidBoundaries(int fromIndex, int toIndex) {
    return fromIndex >= 0 && fromIndex < size && fromIndex < toIndex && toIndex < size;
  }

  @Override
  public boolean retainAll(Collection c) {
    return false;
  }

  @Override
  public boolean removeAll(Collection c) {
    boolean success = true;
    for (Object o : c) {
      success = success && remove(o);
    }
    return success;
  }

  @Override
  public boolean containsAll(Collection c) {
    for (Object o : c) {
      if (!contains(o)) return false;
    }
    return true;
  }

  public Object[] toArray(Object[] a) {
    return Arrays.copyOf(data, size);
  }

  private void ensureCapacity(int requiredSpace) {
    if (size + requiredSpace >= capacity) {
      grow();
    }
  }

  private boolean invalidIndex(int index) {
    return index < 0 || index >= size;
  }

  private void grow() {
    capacity = capacity * 2;
    Object[] newData = new Object[capacity];
    System.arraycopy(data, 0, newData, 0, data.length);
    data = newData;
  }

  T data(int index) {
    return (T) data[index];
  }
}
