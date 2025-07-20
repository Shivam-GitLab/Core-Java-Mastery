package Generics;
interface Container<T> {
    void add(T item);
    T get();
}
class GenericContainer<T> implements Container<T> {
// class GenericContainer<K,V> implements Container<T> {
    private T item;

    @Override
    public void add(T item) {
        this.item = item;
    }

    @Override
    public T get() {
        return item;
    }
}

/*
class StringContainer implements Container<String> {
    private String item;

    @Override
    public void add(String item) {
        this.item = item;
    }

    @Override
    public String get() {
        return item;
    }
}
*/
