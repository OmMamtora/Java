package Programs.Array;

import java.util.Scanner;

class studentInfo {
    int eno;
    String name;
    int marks;
}

public class Student_new {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Size of an array:->");
        int size = sc.nextInt();

        studentInfo[] student = new studentInfo[size];

        for (int i = 0; i < student.length; i++) {
            studentInfo std = new studentInfo();
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.println("Enter eno:");
            std.eno = sc.nextInt();
            System.out.println("Enter name:");
            std.name = sc.next();
            System.out.println("Enter marks:");
            std.marks = sc.nextInt();

            student[i] = std;
        }
        System.out.println("---------");
        for (int i = 0; i < student.length; i++) {
            System.out.println(student[i].eno);
            System.out.println(student[i].name);
            System.out.println(student[i].marks);
            System.out.println("-----------");
        }
    }
}