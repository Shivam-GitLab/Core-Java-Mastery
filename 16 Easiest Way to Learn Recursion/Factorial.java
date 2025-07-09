
public class Factorial {
    public static void main(String[] args) {
        System.out.println(facto(5));
    }

    public static int facto(int num){
        if(num == 1 ){
            return 1;
        }
        return num * facto(num - 1);
    }
   
}
