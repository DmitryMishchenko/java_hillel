package l17_map;

class OurMap<V> {
    public static final int MAX_SIZE = 100;

    private Entry<V>[] entries;

    public OurMap() {
        this.entries = new Entry[MAX_SIZE];
    }

    public boolean add(String key, V value) {
        int hash = hash(key);

        Entry<V> entry = new Entry<>(key, value);

        entries[hash] = entry;
        return true;
    }

    public V get(String key) {
        int hash = hash(key);

        Entry<V> entry = entries[hash];
        if (entry == null) {
            return null;
        }
        return entry.value;
    }

    private int hash(String key) {
        int initial = key.length();
        int number = Math.abs(initial);
        int hash = number % MAX_SIZE;

        return hash;
    }

    private static class Entry<V> {
        public Entry(String key, V value) {
            this.key = key;
            this.value = value;
        }

        String key;
        V value;
    }
}
