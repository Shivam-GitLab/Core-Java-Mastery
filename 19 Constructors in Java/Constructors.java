class Person {

    static {
        System.out.println("Hello from static block");
    }

    private String name;
    private int age;
    private int rollNo;

    public Person(String name, int age, int rollNo) {
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
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

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
}

public class Constructors {
    public static void main(String[] args) {

        Person s1 = new Person("Shivam Jha", 20, 223033);
        printDetails(s1);
        System.out.println();

        Person s2 = new Person("Sumit Jha", 21, 233706);
        printDetails(s2);
        System.out.println();

        Person s3 = new Person("Abhinesh Jha", 20, 223002);
        printDetails(s3);
        System.out.println("Age of s1 = " + s1.getAge());
    }

    static void printDetails(Person person) {
        System.out.println("Person Name = " + person.getName());
        System.out.println("Person Age = " + person.getAge());
        System.out.println("Person Roll No = " + person.getRollNo());
    }
}

/*
class Person{

    // Ano

    
    // Anonymous block
    // {
    //     System.out.println("Hello from static block");
    // }
    static {
        System.out.println("Hello from static block");
    }
    String name;
    int age;
    int rollNo;

    public Person(String name , int age , int rollNo){
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
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

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    
}
public class Constructors {
       public static void main(String[] args) {
       
        Person s1 = new Person("Shivam Jha",20,223033);
        getDetails(s1);
        System.out.println();
        Person s2 = new Person("Sumit Jha ",21,233706);
        getDetails(s2);
        System.out.println();
        Person s3 = new Person("Abhinesh Jha ",20,223002);
        getDetails(s3);
        System.out.println(s1.getAge());
       
    }
    static void getDetails(Person s1) {
        System.out.println("Person Name = " + s1.name);
        System.out.println("Person Age = " + s1.age);
        System.out.println("Person Roll No = " + s1.rollNo);
    }
   
}
*/
