package StringBuilder;

public class Solution {
    public static void main(String[] args) {
        // String Builder contain char arr []  its default capacity ( 16 )
         StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World").append(" !"); //.reverse(); // Method Chaining
        System.out.println(sb);
        String str  = sb.toString(); // Now Immutable String Convert
        sb.append(" Ram");
        
        System.out.println(sb);
        // sb.delete(1, 5); // Start & End Exclusive Not Count End - 1 count
        // Op - H World ! Ram
       /*
        int s = sb.length();
        System.out.println(s);
        char ch = sb.charAt(8);
        System.out.println(ch);
       */
        System.out.println(sb);
        sb.insert(1,"Java");
        System.out.println(sb);

    }
}
