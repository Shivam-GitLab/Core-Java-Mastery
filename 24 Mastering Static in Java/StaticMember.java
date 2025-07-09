class StaticData{


    // 1. Static variables (data members)
    static int age = 20;

    // 2. Static Block
    static {
        System.out.println("Static Block Execute");
    }
    
    // 3. Static Method
    static void setAge(int x){
        age = x;
    } 
    static int getAge(){
        return age;
    } 
}
public class StaticMember {
    public static void main(String[] args) {
        StaticData.age = 20;
        System.out.println(StaticData.age);
        Hello();

        StaticData.setAge(50);
        System.out.println(StaticData.getAge());

    }

    public static void  Hello(){
        StaticData.age = 10;
        System.out.println(StaticData.age);

    }
}


