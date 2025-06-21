class Student {
    private String name;
    private int age;
    private int rollNo;

    static {
        System.out.println("Hello from static block");
    }

    public Student() {
        // Default constructor
    }

    public Student(String name, int age, int rollNo) {
        this.name = name;
        setAge(age); // Use setter to apply validation
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
        if (age < 0) {
            System.out.println("Invalid age. Setting to 0.");
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
}
