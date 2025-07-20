package Generic.src.Generics;

class Box<T> {
    /*
    Boundation  -> Integer , Float,
    Not String
    class Box<T extends Number> {

     }
     Box<String> stringBox = new Box<>(); -> Error
     Box<Integer> integerBox = new Box<>(); -> Correct
    */
    private T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}
public class BoxExample {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.setItem("Hello, Generics!");
        String item = stringBox.getItem();
        System.out.println(item);
    }
}