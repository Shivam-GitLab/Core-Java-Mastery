
public class InnerClass {
    private String outerField = "Outer field";

    class Inner {
        void display() {
            System.out.println("Accessing: " + outerField);
        }
    }
    public static void main(String[] args) {
        InnerClass outer = new InnerClass();
        InnerClass.Inner inner = outer.new Inner();
        inner.display();
    }
}
