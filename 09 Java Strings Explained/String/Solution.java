package String;

public class Solution {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = str1.concat(" World");
        System.out.println(str1);
        System.out.println(str2);

//        ====== Why Need String Buffer & Builder ======
        // every iteration make new string store in result lots of memory increase
        String result = "";
        for (int i = 0; i < 1000; i++) {
            result = result + "Hello";
        }
        System.out.println(result);
    }
}
