public class BitwiseOperators {
    public static void main(String[] args) {
        /*  
        System.out.println("Bitwise Operators in Java");
        System.out.println("Bitwise AND Operator &");
        System.out.println("Bitwise OR Operator |");
        System.out.println("Bitwise XOR Operator ^");
        System.out.println("Bitwise Complement Operator ~");
        System.out.println("Left Shift Operator <<");
        System.out.println("Right Shift Operator >>");
        System.out.println("Unsigned Right Shift Operator >>>");
        */

        //Computer --> 01
        int a = 5; // 101
        System.out.println(Integer.toBinaryString(a));

        // Operand --> byte --> 8 , bits short --> 16 , bits int --> 32 bits , long --> 64 bits
        // Operator --> AND --> &
        int and = 5 & 6; // 101 & 110 = 100
        System.out.println("Binary = "+Integer.toBinaryString(and));
        System.out.println("Integer = "+and);
        int or = 5 | 6; // 101 & 110 = 100
        System.out.printf("Binary = "+Integer.toBinaryString(or)+"\n");
        System.out.printf("Integer = "+or);


    }
}

 
