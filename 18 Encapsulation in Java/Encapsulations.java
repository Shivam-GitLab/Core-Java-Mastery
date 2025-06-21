
class Students {

    private String name;
    private int age;

    // 🔹 Static Block: runs only once when the class is loaded
    static {
        System.out.println("🔵 Static Block: Runs once when class loads");
    }

    // 🔹 Anonymous Block: runs every time before constructor
    /*{
        System.out.println("🟢 Anonymous Block: Runs before constructor for each object");
    }*/

    // 🔹 Constructor
    public Students(String name, int age) {
        System.out.println("🟡 Constructor: Runs after anonymous block");
        this.name = name;
        this.age = age;
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
        if (age < 0) {
            this.age = 0;
        }
        this.age = age;
    }


}

public class Encapsulations {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Shivam Jha");
        student.setAge(30);        // Valid age
        student.setRollNo(101);

        printDetails(student);
        /*
        System.out.println("Student Name = " + student.getName());
        System.out.println("Student Age = " + student.getAge());
        System.out.println("Student Roll No = " + student.getRollNo());
        * */

        System.out.println();

        Student s2 = new Student("Sumit Jha", 21, 233706);
        printDetails(s2);
    }

    static void printDetails(Student s) {
        System.out.println("Student Name = " + s.getName());
        System.out.println("Student Age = " + s.getAge());
        System.out.println("Student Roll No = " + s.getRollNo());
    }
}

