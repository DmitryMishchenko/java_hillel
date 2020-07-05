import l5_basics_oop.TreeCollection;
import org.junit.Assert;
import org.junit.Test;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

public class TreeCollectionTest {
  @Test
  public void testAdd() {
    Set tree = new TreeCollection();
    tree.add(10);

    Assert.assertEquals(tree.size(), 1);
  }

  @Test
  public void testIsEmpty() {
    Set tree = new TreeCollection();

    Assert.assertTrue(tree.isEmpty());

    tree.add(10);

    Assert.assertFalse(tree.isEmpty());
  }

  @Test
  public void testContains() {
    Set tree = new TreeCollection();

    Assert.assertFalse(tree.contains(10));

    tree.add(10);
    tree.add(15);

    Assert.assertTrue(tree.contains(15));
    Assert.assertTrue(tree.contains(10));
    Assert.assertFalse(tree.contains(12));
  }

  @Test
  public void testToArray() {
    Set tree = new TreeCollection();

    tree.add(10);
    tree.add(2);
    tree.add(15);
    tree.add(7);
    tree.add(3);

    Assert.assertEquals(new int[]{2, 3, 7, 10, 15}, tree.toArray());
  }

  @Test
  public void testToIterator() {
    Set tree = new TreeCollection();

    tree.add(3);
    tree.add(2);
    tree.add(1);

    Iterator it = tree.iterator();

    Assert.assertTrue(it.hasNext());
    Assert.assertEquals(it.next(), 1);
    Assert.assertEquals(it.next(), 2);
    Assert.assertEquals(it.next(), 3);
    Assert.assertFalse(it.hasNext());
  }

  @Test
  public void testRemove() {
    Set tree = new TreeCollection();

    tree.add(3);
    tree.add(2);
    tree.add(1);


    Assert.assertEquals(tree.size(), 3);

    tree.remove(2);
    tree.remove(3);
    tree.remove(1);
    tree.remove(9);

    Assert.assertEquals(tree.size(), 0);
    Assert.assertEquals(tree.contains(2), false);
  }

  @Test
  public void testAddAll() {
    Set tree = new TreeCollection();
    Collection list = new LinkedList();

    list.add(3);
    list.add(2);
    list.add(1);

    tree.addAll(list);

    Assert.assertTrue(tree.contains(3));
    Assert.assertEquals(tree.size(), 3);
  }

  @Test
  public void testRemoveAll() {
    Set tree = new TreeCollection();
    Collection list = new LinkedList();

    tree.add(1);
    tree.add(2);
    tree.add(4);

    list.add(3);
    list.add(2);
    list.add(1);

    tree.removeAll(list);

    Assert.assertTrue(tree.contains(4));
    Assert.assertEquals(tree.size(), 1);
  }

  @Test
  public void testContainsAll() {
    Set tree = new TreeCollection();
    Collection list = new LinkedList();

    tree.add(1);
    tree.add(2);
    tree.add(3);

    list.add(3);
    list.add(2);
    list.add(1);

    Assert.assertTrue(tree.containsAll(list));

    tree.remove(2);

    Assert.assertFalse(tree.containsAll(list));
  }
}
