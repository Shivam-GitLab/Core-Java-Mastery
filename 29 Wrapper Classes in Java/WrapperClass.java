
public class WrapperClass {
    public static void main(String[] args) {
        int a = 10;
        // Autoboxing: converting int to Integer
        Integer aObj = a;

        // Unboxing: converting Integer to int
        int b = aObj;

        System.out.println("Primitive int: " + a);
        System.out.println("Wrapper Integer: " + aObj);
        System.out.println("Unboxed int: " + b);

        // Using some methods of wrapper class
        String str = "123";
        int num = Integer.parseInt(str);
        System.out.println("Parsed int from String: " + num);

        Integer value = Integer.valueOf("456");
        System.out.println("Value of Integer from String: " + value);
    }
}
