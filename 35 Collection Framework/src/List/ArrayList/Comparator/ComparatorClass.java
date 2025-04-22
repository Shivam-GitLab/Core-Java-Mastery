package List.ArrayList.Comparator;

import java.util.*;

class Student {
    private String name;
    private double gpa;

    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }
}

public class ComparatorClass {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Charlie", 3.5));
        students.add(new Student("Bob", 3.7));
        students.add(new Student("Alice", 3.5));
        students.add(new Student("Sam", 3.9));

       /*  students.sort(null); // Error */
    /*    students.sort((s1,s2) -> (int) (s2.getGpa() - s1.getGpa()));
            int typecast but all same place not change
            Solution =>
     */
        /*
        students.sort((s1,s2) ->
                {
                    if (s2.getGpa() - s1.getGpa() > 0) {
                        return 1;
                    } else if (s2.getGpa() - s1.getGpa() < 0) {
                        return -1;
                    }
                    else {
                    // Alice  Charlie
                        return s1.getName().compareTo(s2.getName());
                        return 0;
                    }
                }
                );
         */
        /*
        Comparator<Student> comparator = Comparator.comparing(Student::getGpa);
        Alice : 3.5
        Charlie : 3.5
        Bob : 3.7
        Sam : 3.9
        */
        /*
        Comparator<Student> comparator = Comparator.comparing(Student::getGpa).reversed();
        Sam : 3.9
        Bob : 3.7
        Alice : 3.5
        Charlie : 3.5
        */

        Comparator<Student> comparator = Comparator.comparing(Student::getGpa).reversed()
                .thenComparing(Student::getName);
        /*
        Sam : 3.9
        Bob : 3.7
        Alice : 3.5
        Charlie : 3.5
         */
        students.sort(comparator);
//  2.      Collections.sort(students,comparator);
        for (Student student : students) {
            System.out.println(student.getName() +" : " +student.getGpa());
        }
    }
}
