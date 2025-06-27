


public class Solution {
    public static void main(String[] args) {
        int[] numerators = { 10, 200, 30, 40 };
        int[] denominators = { 1, 2, 0, 4 };

        for (int i = 0; i < numerators.length; i++) {
            System.out.println(divide(numerators[i], denominators[i]));
        }
        System.out.println("Good Job!");
    }

    public static int divide(int a, int b) {
        // return a / b;

        try{
            return a / b;
        }catch(ArithmeticException e){
            System.out.println("Not");
            return -1;
        }
        finally{
            System.out.println("Terminated");
        }
    }
    /*
     * Program Will Crash During Runtime Errors
     * Runtime Error
     * 10
     * 100
     * Exception in thread "main" java.lang.ArithmeticException: / by zero
     * at Solution.divide(Solution.java:14)
     * at Solution.main(Solution.java:8)
     */
    /*
     * Exception i san event that distrupts the normal flow of the program.
     * It is an object which is thrown at runtime
     */
}
