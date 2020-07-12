package l5_basics_oop;

import org.junit.Assert;
import org.junit.Test;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class MyMapTest {
  @Test
  public void testSize() {
    Map<String, Integer> map = new MyMap<>();

    map.put("one", 1);

    Assert.assertEquals(map.size(), 1);
  }

  @Test
  public void testIsEmpty() {
    Map<String, Integer> map = new MyMap<>();

    Assert.assertTrue(map.isEmpty());

    map.put("one", 1);

    Assert.assertFalse(map.isEmpty());
  }

  @Test
  public void testContainsKey() {
    Map<String, Integer> map = new MyMap<>();

    Assert.assertFalse(map.containsKey("one"));

    map.put("one", 1);

    Assert.assertTrue(map.containsKey("one"));
  }

  @Test
  public void testContainsValue() {
    Map<String, Integer> map = new MyMap<>();

    Assert.assertFalse(map.containsValue(10));

    map.put("key1", 10);
    map.put("key2", 20);

    Assert.assertTrue(map.containsValue(10));
    Assert.assertTrue(map.containsValue(20));
    Assert.assertFalse(map.containsValue(30));
  }

  @Test
  public void testGet() {
    Map<String, Integer> map = new MyMap<>();

    map.put("key1", 10);
    map.put("key2", 20);

    Assert.assertEquals(map.get("key1"), new Integer(10));
    Assert.assertEquals(map.get("key2"), new Integer(20));
    Assert.assertNull(map.get("invalid_key"));
  }

  @Test
  public void testRemove() {
    Map<String, Integer> map = new MyMap<>();

    map.put("key1", 10);
    map.put("key2", 20);

    map.remove("key2");

    Assert.assertEquals(map.size(), 1);
    Assert.assertFalse(map.containsKey("key2"));
  }

  @Test
  public void testPutAll() {
    Map<String, Integer> map = new MyMap<>();
    Map<String, Integer> map2 = new MyMap<>();

    map2.put("key1", 10);
    map2.put("key2", 20);

    map.putAll(map2);

    Assert.assertEquals(map.size(), 2);
    Assert.assertTrue(map.containsKey("key2"));
  }

  @Test
  public void testClear() {
    Map<String, Integer> map = new MyMap<>();

    map.put("key1", 10);
    map.put("key2", 20);

    map.clear();

    Assert.assertEquals(map.size(), 0);
    Assert.assertFalse(map.containsKey("key2"));
  }

  @Test
  public void testKeySet() {
    Map<String, Integer> map = new MyMap<>();

    map.put("key1", 10);
    map.put("key2", 20);

    Set<String> set = map.keySet();

    Assert.assertEquals(set.size(), 2);
    Assert.assertTrue(set.contains("key2"));
  }

  @Test
  public void testValues() {
    Map<String, Integer> map = new MyMap<>();

    map.put("key1", 10);
    map.put("key2", 20);

    Collection<Integer> collection = map.values();

    Assert.assertEquals(collection.size(), 2);
    Assert.assertTrue(collection.contains(20));
  }

  @Test
  public void testEntrySet() {
    Map<String, Integer> map = new MyMap<>();

    map.put("key1", 10);
    map.put("key2", 20);

    Set<Map.Entry<String, Integer>> set = map.entrySet();

    Assert.assertEquals(set.size(), 2);
  }

  // nullable tests
  @Test
  public void testAddNull() {
    Map<String, Integer> map = new MyMap<>();

    try {
      map.put(null, null);
    } catch (NullPointerException exception) {
      Assert.assertTrue(exception instanceof NullPointerException);
    }
  }

  @Test
  public void testContainsKeyNull() {
    Map<String, Integer> map = new MyMap<>();

    Assert.assertFalse(map.containsKey(null));
  }

  @Test
  public void testContainsValueNull() {
    Map<String, Integer> map = new MyMap<>();

    map.put("key1", null);

    Assert.assertTrue(map.containsValue(null));
    Assert.assertTrue(map.containsKey("key1"));
  }

  @Test
  public void testGetNull() {
    Map<String, Integer> map = new MyMap<>();

    map.put("key1", null);

    Assert.assertNull(map.get(null));
  }

  @Test
  public void testRemoveNull() {
    Map<String, Integer> map = new MyMap<>();

    map.put("key1", null);

    map.remove(null);
    Assert.assertNull(map.remove(null));
  }
}
