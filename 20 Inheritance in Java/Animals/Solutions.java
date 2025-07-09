
class Animal {
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
        if(age > 0 && age <= 18){
            this.age = age;
        }
        else{
            
            System.out.println("Not Valid");
        }
    }
    public void eat(){
        System.out.println("This Animal Eat Food");
    }
    public void sayHello(){
        System.out.println("--");
    }

}

/************************************/

class Dog extends Animal{
    @Override // Method Overriding
    public void sayHello(){
        System.out.println("Woof");
    }
}
/************************************/
public class Solutions {
    public static void main(String[] args) {
        Dog dog = new  Dog();
        Animal animal = new  Animal();
        dog.setName("Kitu");
        dog.setAge(18); 
        System.out.println("Dog Name = "+dog.getName());
        System.out.println("Dog Age = "+dog.getAge());
        dog.eat();
        dog.sayHello();
        animal.sayHello();
    }
}
