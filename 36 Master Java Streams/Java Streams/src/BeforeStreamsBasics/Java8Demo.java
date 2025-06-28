package BeforeStreamsBasics;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class Java8Demo {

    public static void main(String[] args) {
        // Streams
        // Java 8 --> minimal code, functional programing
        // Java 8 --> lambda expression, Streams, Date & Time API
        // lambda expression => is an anonymous function
        // (no name, no return type, no access modifier)
        // Thread t1 = new Thread(new Task());
        // new Task() Replace with lambda expression
        // lambda expression use for implement functional interface
        Thread t1 = new Thread(() -> {
            System.out.println("Hello");
        });
//        MathOperation sumOperation = (a, b) -> a + b;
//        MathOperation sumOperation = (int a, int b) -> a + b;
        MathOperation sumOperation = Integer::sum;
        MathOperation subtractOperation = (a, b) -> a - b;
        int res = sumOperation.operate(1, 2);
        System.out.println(res);
        MathOperation multiplyOperation = (a, b) -> a * b;
//      MathOperation divideOperation = (a, b) -> b != 0 ? a / b : 0;
        MathOperation divideOperation = (a, b) -> a / b;
        MathOperation max = Math::max;
        MathOperation min = Math::min;

        System.out.println("Sum: " + sumOperation.operate(5, 3));
        System.out.println("Subtract: " + subtractOperation.operate(5, 3));
        System.out.println("Multiply: " + multiplyOperation.operate(5, 3));
        System.out.println("Divide: " + divideOperation.operate(5, 3));
        System.out.println("Max: " + max.operate(5, 3));
        System.out.println("Min: " + min.operate(5, 3));

        // Predicate --> Functional interface (Boolean valued function)
        // => Holds Condition
        Predicate<Integer> isEven = x -> x % 2 == 0;
        System.out.println(isEven.test(4));
        Predicate<String> isWordStartingWithA = x -> x.toLowerCase().startsWith("a");
        Predicate<String> isWordEndingWithT = x -> x.toLowerCase().endsWith("t");
        Predicate<String> and = isWordStartingWithA.and(isWordEndingWithT);
        System.out.println(and.test("Akshay"));

        // Function --> work for you
        // Function<T, R> --> T is an input type, R is an output type
        Function<Integer, Integer> doubleIt = x -> 2 * x;
        Function<Integer, Integer> tripleIt = x -> 3 * x;
        System.out.println(doubleIt.andThen(tripleIt).apply(20));
        System.out.println(tripleIt.andThen(doubleIt).apply(20)); // same
        System.out.println(doubleIt.compose(tripleIt).apply(20)); // same
        System.out.println(doubleIt.apply(100));
        Function<Integer, Integer> identity = Function.identity();
        Integer res2 = identity.apply(5);
        System.out.println(res2);

        // Consumer
       // Consumer <Integer> print = x -> System.out.println(x);
        Consumer<Integer> print = System.out::println;
        print.accept(51);
        List<Integer> list = Arrays.asList(1, 2, 3);
        Consumer<List<Integer>> printList = x -> {
            for (int i : x) {
                System.out.println(i);
            }
        };
        printList.accept(list);

        // Supplier => Not take only Give
        Supplier<String> giveHelloWorld = () -> "Hello World";
        System.out.println(giveHelloWorld.get());

        // combined example
        Predicate<Integer> predicate = x -> x % 2 == 0;
        Function<Integer, Integer> function = x -> x * x;
        Consumer<Integer> consumer = x -> System.out.println(x);
        Supplier<Integer> supplier = () -> 100;

        if (predicate.test(supplier.get())) {
            consumer.accept(function.apply(supplier.get()));
        }

        // BiPredicate, BiConsumer, BiFunction
        BiPredicate<Integer, Integer> isSumEven = (x, y) -> (x + y) % 2 == 0;
        System.out.println(isSumEven.test(5, 5));
        BiConsumer<Integer, String> biConsumer = (x, y) -> {
            System.out.println(x);
            System.out.println(y);
        };
        BiFunction<String, String, Integer> biFunction = (x, y) -> (x + y).length();
        System.out.println(biFunction.apply("a", "bc"));

        // UnaryOperator, BinaryOperator
        UnaryOperator<Integer> a = x -> 2 * x;
        BinaryOperator<Integer> b = Integer::sum;
//        BinaryOperator<Integer> b = (x, y) -> x + y;

        // Method reference --> use a method without invoking & in place of lambda expression
        List<String> students1 = Arrays.asList("Ram", "Shyam", "Shanghai");
        List<String> students2 = Arrays.asList("A", "B", "C");
//        students.forEach(x -> System.out.println(x));
        students1.forEach(System.out::println);
        students2.forEach(System.out::println);

        // Constructor reference
        List<String> names = Arrays.asList("A", "B", "C");
//        List<MobilePhone> mobilePhoneList = names.stream().map(MobilePhone::new).collect(Collectors.toList());
        List<MobilePhone> mobilePhoneList = names.stream().map(MobilePhone::new).toList();
    }
}

class MobilePhone {

    String name;

    public MobilePhone(String name) {
        this.name = name;
    }
}

@FunctionalInterface
interface MathOperation {

    int operate(int a, int b);
}
/*
class Task implements Runnable{
    @Override
    // (no name, no return type, no access modifier)
 */
 /* Add Arrow ->
    () -> {
        System.out.println("Hello");
    }
 *//*

    public void run() {
        System.out.println("Hello");
    }
}
 */
