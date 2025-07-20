package Generics;
interface Printable{
    void print();
}

class MyNumber extends Number implements Printable{
    private final int value;

    MyNumber(int value) {
        this.value = value;
    }

    @Override
    public void print() {
        System.out.println("Value: " + value);
    }

    @Override
    public int intValue() {
        return 0;
    }

    @Override
    public long longValue() {
        return 0;
    }

    @Override
    public float floatValue() {
        return 0;
    }

    @Override
    public double doubleValue() {
        return 0;
    }

    public int getValue() {
        return value;
    }
}

// For class use extends & for interface also use extends
// but first extends class then one or more than one interface using extends key
class MyBox<T extends Number & Printable> {
    private T item;

    MyBox(T item) {
        this.item = item;
    }

    public void display(){
        item.print();
    }
    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}

public class MyNumExam {
    public static void main(String[] args) {
        MyNumber myNumber = new MyNumber(12);
        MyBox<MyNumber> myBox = new MyBox<>(myNumber);
        myBox.display();
    }
}
