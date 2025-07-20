package Generics;

public class GenricMethod {
    public static void main(String[] args) {
        Integer[] intArr = {1,2,3,4};
        String[] stArr = {"Sam","Abhi","Sumit","Sonu","Rohan"};
        printArray(intArr);
        printArray(stArr);
        display("St");
        display(12);
    }


    public static <T> void display(T element){
        System.out.println(element);
    }

    // Method overloading

    public static void display(int element){
        System.out.println(element);
    }
    public static <T> void printArray(T[] arr){
        for(T element : arr){
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
