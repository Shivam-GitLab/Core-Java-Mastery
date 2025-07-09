
enum Operation {
    ADD, SUBTRACT, MULTIPLY, DIVIDE
}

public class EnumsOperation {

    public static double apply(Operation op, double x, double y) {
        switch (op) {
            case ADD -> {
                return x + y;
            }
            case SUBTRACT -> {
                return x - y;
            }
            case MULTIPLY -> {
                return x * y;
            }
            case DIVIDE -> {
                return x / y;
            }
            default -> throw new AssertionError("Unknown operation: " + op);
        }
    }

    public static void main(String[] args) {
        double a = 10, b = 5;
        for (Operation op : Operation.values()) {
            System.out.println(op + ": " + apply(op, a, b));
        }
    }
}
