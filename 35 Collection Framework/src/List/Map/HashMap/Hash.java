package List.Map.HashMap;

public class Hash {
    public static void main(String[] args) {
        System.out.println(simpleHash("ABC")); // 8 -> Collision
        System.out.println(simpleHash("CBA")); // 8
        System.out.println(simpleHash("CDF")); // 5
    }
    public static int simpleHash(String key) {
        int sum = 0;
        for (char c : key.toCharArray()) {
            sum += (int) c;
        }
        return sum % 10;
    }
}

/*
class Node<K, V> {
    final int hash;      // hash code of the key
    final K key;         // the key itself
    V value;             // the value associated with the key
    Node<K, V> next;     // pointer to the next node in case of a collision (linked list)

    Node(int hash, K key, V value, Node<K, V> next) {
        this.hash = hash;
        this.key = key;
        this.value = value;
        this.next = next;
    }
}

*/