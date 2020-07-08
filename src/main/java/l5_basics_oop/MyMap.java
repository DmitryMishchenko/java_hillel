package l5_basics_oop;

import java.util.*;

public class MyMap<K, V> implements Map<K, V> {
  public static final int MAX_SIZE = 1000;

  private Entry<K, V>[] entries;
  private int size = 0;

  public MyMap() {
    this.entries = new MyEntry[MAX_SIZE];
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
  public boolean containsKey(Object key) {
    return entries[hash(key)] != null;
  }

  @Override
  public boolean containsValue(Object value) {
    for (Entry<K, V> entry : entries) {
      if (entry != null && value.equals(entry.getValue())) {
        return true;
      }
    }

    return false;
  }

  @Override
  public V get(Object key) {
    Entry<K, V> entry = entries[hash(key)];
    return entry == null ? null : entry.getValue();
  }

  @Override
  public V put(K key, V value) {
    int hash = hash(key);

    if (entries[hash] == null) {
      size++;
    }

    entries[hash] = new MyEntry<K, V>(key, value);

    return value;
  }

  @Override
  public V remove(Object key) {
    int hash = hash(key);

    if (entries[hash] != null) {
      Entry<K, V> entry = entries[hash];
      entries[hash] = null;
      size--;

      return entry.getValue();
    }

    return null;
  }

  @Override
  public void putAll(Map m) {
    for (Object entry : m.entrySet()) {
      Entry<K, V> en = (Entry)entry;
      put(en.getKey(), en.getValue());
    }
  }

  @Override
  public void clear() {
    size = 0;
    this.entries = new Entry[MAX_SIZE];
  }

  @Override
  public Set<K> keySet() {
    Set<K> set = new HashSet<>();

    for (Entry<K, V> entry : entries) {
      if (entry != null) {
        set.add(entry.getKey());
      }
    }

    return set;
  }

  @Override
  public Collection<V> values() {
    Collection<V> list = new LinkedList<>();

    for (Entry<K, V> entry : entries) {
      if (entry != null) {
        list.add(entry.getValue());
      }
    }

    return list;
  }

  @Override
  public Set<Entry<K, V>> entrySet() {
    Set<Entry<K, V>> set = new HashSet<>();

    for (Entry<K, V> entry : entries) {
      if (entry != null) {
        set.add(entry);
      }
    }

    return set;
  }

  private int hash(Object key) {
    return Math.abs(key.hashCode()) % MAX_SIZE;
  }

  private static class MyEntry<K, V> implements Entry<K, V> {
    private K key;
    private V value;

    public MyEntry(K key, V value) {
      this.key = key;
      this.value = value;
    }

    @Override
    public K getKey() {
      return key;
    }

    @Override
    public V getValue() {
      return value;
    }

    @Override
    public V setValue(V value) {
      this.value = value;
      return value;
    }
  }
}
