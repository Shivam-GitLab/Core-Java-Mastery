package Generics;

enum Operation {
    ADD, SUBTRACT, MULTIPLY, DIVIDE;
    public <T extends Number> double apply(T a, T b) {
        return switch (this) {
            case ADD -> a.doubleValue() + b.doubleValue();
            case SUBTRACT -> a.doubleValue() - b.doubleValue();
            case MULTIPLY -> a.doubleValue() * b.doubleValue();
            case DIVIDE -> a.doubleValue() / b.doubleValue();
            default -> throw new AssertionError("Unknown operation: " + this);
        };
    }
}

public class EnumExample {
    public static void main(String[] args) {

        double result1 = Operation.ADD.apply(10, 20);
        double result2 = Operation.MULTIPLY.apply(5.5, 4);
        System.out.println(result1);  // Output: 30.0
        System.out.println(result2);  // Output: 22.0
    }
}
