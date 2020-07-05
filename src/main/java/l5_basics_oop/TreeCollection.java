package l5_basics_oop;

import java.util.*;

public class TreeCollection implements Set {
  Node root = null;
  int size = 0;

  @Override
  public int size() {
    return size;
  }

  @Override
  public boolean isEmpty() {
    return size() == 0;
  }

  @Override
  public boolean contains(Object o) {
    int val = (int)o;
    Node current = root;

    while (current != null) {
     if (current.val.equals(o)) {
       return true;
     }

     current = current.val > val ? current.left : current.right;
    }

    return false;
  }

  @Override
  public Iterator iterator() {
    final Object[] data = toArray();

    return new Iterator() {
      int index = 0;

      @Override
      public boolean hasNext() {
        return index < size;
      }

      @Override
      public Object next() {
        return data[index++];
      }
    };
  }

  @Override
  public Object[] toArray() {
    return toArray(new Object[size]);
  }

  @Override
  public boolean add(Object o) {
    int val = (int)o;
    root = insertRec(root, val);
    size++;

    return true;
  }

  private Node insertRec(Node root, int val) {
    if (root == null) {
      return new Node(val);
    }

    if (val < root.val) {
      root.left = insertRec(root.left, val);
    } else if (val > root.val) {
      root.right = insertRec(root.right, val);
    }

    return root;
  }

  @Override
  public boolean remove(Object o) {
    if (contains(o)) {
      int val = (int)o;
      root = deleteRec(root, val);
      size--;
      return true;
    }

    return false;
  }

  private Node deleteRec(Node root, int key) {
    if (root == null) {
      return null;
    }

    if (key < root.val) {
      root.left = deleteRec(root.left, key);
    } else if (key > root.val) {
      root.right = deleteRec(root.right, key);
    } else {
      if (root.left == null) {
        return root.right;
      } else if (root.right == null) {
        return root.left;
      }

      root.val = minValue(root.right);
      root.right = deleteRec(root.right, root.val);
    }

    return root;
  }

  private int minValue(Node root) {
    int minVal = root.val;
    while (root.left != null) {
      minVal = root.left.val;
      root = root.left;
    }
    return minVal;
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
    root = null;
  }

  @Override
  public boolean removeAll(Collection c) {
    for (Object o : c) {
      remove(o);
    }
    return false;
  }

  @Override
  public boolean retainAll(Collection c) {
    boolean modified = false;

    for (Iterator it = iterator(); it.hasNext(); ) {
      Object o = it.next();
      if (!c.contains(o)) {
        remove(o);
        modified = true;
      }
    }
    return modified;
  }

  @Override
  public boolean containsAll(Collection c) {
    for (Object o : c) {
      if (!contains(o)) return false;
    }
    return true;
  }

  @Override
  public Object[] toArray(Object[] a) {
    Object[] arr = a.length >= size ? a : new Integer[size];
    Stack<Node> stack = new Stack<>();
    Node current = root;
    int i = 0;

    while (current != null || !stack.isEmpty()) {
      while (current != null) {
        stack.push(current);
        current = current.left;
      }

      Node node = stack.pop();

      arr[i++] = node.val;
      current = node.right;
    }
    return arr;
  }

  private class Node {
    public Integer val;
    public Node left = null;
    public Node right = null;

    public Node(Integer val) {
      this.val = val;
    }
  }
}
