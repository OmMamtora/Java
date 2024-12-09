package Programs.Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

//Sorting by student age

class Student implements Comparable<Student> {
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }

    public int compareTo(Student that) {
        if (this.age > this.age) {
            return 1;
        } else {
            return -1;
        }
    }

}

public class Collection_interface_2 {
    public static void main(String[] args) {

        List<Student> stud = new ArrayList<>();
        stud.add(new Student(20, "Om"));
        stud.add(new Student(18, "Het"));
        stud.add(new Student(54, "Krushil"));
        stud.add(new Student(60, "Modi"));

        System.out.println(stud);
        for (Student s : stud) {
            System.out.println(s);
        }
    }
}
