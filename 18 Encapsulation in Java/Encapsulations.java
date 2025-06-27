
class Students {
    private String name;
    private  int age;

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
        if(age < 0){
            this.age = 0;
        }
        this.age = age;
    }
}
public class Encapsulations {
    public static void main(String[] args) {
        Students students = new Students();
        students.setAge(30);
        // this.age -> this - students' object & age - setAge
        System.out.println(students.getAge());

    }
}
