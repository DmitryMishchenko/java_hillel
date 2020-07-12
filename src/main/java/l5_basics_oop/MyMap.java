package l5_basics_oop;

import java.util.*;

public class MyMap<K, V> implements Map<K, V> {
  public static final int MAX_SIZE = 1000;

  private LinkedList<Entry<K, V>>[] entries;
  private int size = 0;

  public MyMap() {
    this.entries = new LinkedList[MAX_SIZE];
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
    return key != null && entries[hash(key)] != null;
  }

  @Override
  public boolean containsValue(Object value) {
    for (LinkedList<Entry<K, V>> list : entries) {
      if (list != null) {
        for (Entry<K, V> entry : list) {
          V entryVal = entry.getValue();
          if (value == null ? value == entryVal : value.equals(entry.getValue())) {
            return true;
          }
        }
      }
    }

    return false;
  }

  @Override
  public V get(Object key) {
    if (key == null) return null;
    LinkedList<Entry<K, V>> list = entries[hash(key)];

    if (list == null) return null;
    for (Entry<K, V> entry : list) {
      if (entry.getKey() == key) {
        return entry.getValue();
      }
    }

    return null;
  }

  @Override
  public V put(K key, V value) {
    if (key == null) {
      throw new NullPointerException("key should not be null");
    }

    int hash = hash(key);

    if (entries[hash] == null) {
      entries[hash] = new LinkedList<>();
      size++;
    }

    entries[hash].add(new MyEntry<K, V>(key, value));

    return value;
  }

  @Override
  public V remove(Object key) {
    if (key == null) return null;
    int hash = hash(key);
    LinkedList<Entry<K, V>> list = entries[hash];

    if (list != null) {
      Entry<K, V> removed = null;
      for (Entry<K, V> entry: list) {
        if (entry.getKey() == key) {
          list.remove(entry);
          removed = entry;
          size--;
          break;
        }
      }

      if (list.isEmpty()) {
        entries[hash] = null;
      }

      return removed == null ? null : removed.getValue();
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
    this.entries = new LinkedList[MAX_SIZE];
  }

  @Override
  public Set<K> keySet() {
    Set<K> set = new HashSet<>();

    for (LinkedList<Entry<K, V>> list: entries) {
      if (list == null) {
        continue;
      }

      for (Entry<K, V> entry : list) {
        if (entry != null) {
          set.add(entry.getKey());
        }
      }
    }

    return set;
  }

  @Override
  public Collection<V> values() {
    Collection<V> listCollection = new LinkedList<>();

    for (LinkedList<Entry<K, V>> list: entries) {
      if (list == null) {
        continue;
      }

      for (Entry<K, V> entry : list) {
        if (entry != null) {
          listCollection.add(entry.getValue());
        }
      }
    }

    return listCollection;
  }

  @Override
  public Set<Entry<K, V>> entrySet() {
    Set<Entry<K, V>> set = new HashSet<>();

    for (LinkedList<Entry<K, V>> list: entries) {
      if (list == null) {
        continue;
      }

      for (Entry<K, V> entry : list) {
        if (entry != null) {
          set.add(entry);
        }
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
