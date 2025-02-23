package MyADT;

import java.util.Set;

public interface MyHashMapInterface <K, V> {

    void put(K key, V value);
    V get(K key);
    Set<K> getKeys();
    boolean containsKey(K key);
    void remove(K key);
    int size();
    void resize();
}
