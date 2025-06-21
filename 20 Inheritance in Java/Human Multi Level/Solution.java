
// import java.lang.classfile.Superclass;

// Multi Level Inheritence
class Child extends Parent {
    
    public Child(int age , String name) {
        super(age,name); // Not Visible
        System.out.println("Constructor Called Child ");
    }

    
    /* 
    void childMethod(){
        super.parentMethod(); // 1. Parent Mathod Called
        System.out.println("Child Method Called"); // 2. Child Mathod Called
        System.out.println("==================");
        System.out.println("Child Method Called");// 1. Child Mathod Called
        super.parentMethod();// 2. Parent Mathod Called
        
    }

    */
}

/*************************/
class Parent extends GrandParent {
    // public Parent(int a){
    //     System.out.println("Constructor Called Parent ");
    // }
    public Parent(int age , String name) {
        super(age, name); // Grand Parent
        // super(); First Because Grant Parent Called Prpperly Then Parent
        System.out.println("Constructor Called Parent ");
        // super(); // Wrong 

       
    }
   
  
   /*
    void parentMethod(){
        System.out.println("Parent Method Called");
    }
    */
    
}

// Super Method - Point immidiate Method

/*************************/
class GrandParent {
    private String name;
    private int age;
    private final boolean isHasSuperPower = true;

    public GrandParent(int age , String name) {
        this.age = age;
        this.name = name;
        System.out.println("Constructor Called GrandParent ");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isHasSuperPower() {
        return isHasSuperPower;
    }
    /*** */

}

/*************************/
public class Solution {
    public static void main(String[] args) {
        Child child = new Child(20 , "Ram");
        System.out.println(child.getAge());
        System.out.println(child.getName());
        // child.setName("Sam");
        // child.setAge(20);
        Parent parent = new Parent(50,"Ramesh");
        System.out.println(parent.getAge());
        System.out.println(parent.getName());
        // parent.setName("Ramesh");
        // parent.setAge(40);

        // GrandParent grandParent = new GrandParent();
        // grandParent.setName("Suresh");
        // grandParent.setAge(53);
        // boolean ans = child.isHasSuperPower();
        // System.out.println(ans);

        // child.childMethod();

       
    }
}
 