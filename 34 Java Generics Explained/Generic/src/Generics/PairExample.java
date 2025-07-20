package Generics;

class Pair<K, V> {

    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}

public class PairExample {
    public static void main(String[] args) {
        Pair<String,Integer> pair1 = new Pair<>("Age -> ",30);
        Pair<Integer,String> pair2 = new Pair<>(30," -> Roll No");
        System.out.print(pair1.getKey());
        System.out.println(pair1.getValue());
        System.out.print(pair2.getKey());
        System.out.println(pair2.getValue());

    }
}
