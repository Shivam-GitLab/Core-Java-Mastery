class Student{

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

    public Student(String name , int age , int rollNo){
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
       
        Student s1 = new Student("Shivam Jha",20,223033);
        getDetails(s1);
        System.out.println();
        Student s2 = new Student("Sumit Jha ",21,233706);
        getDetails(s2);
        System.out.println();
        Student s3 = new Student("Abhinesh Jha ",20,223002);
        getDetails(s3);
        System.out.println(s1.getAge());
       
    }
    static void getDetails(Student s1) {
        System.out.println("Student Name = " + s1.name);
        System.out.println("Student Age = " + s1.age);
        System.out.println("Student Roll No = " + s1.rollNo);
    }
   
}
