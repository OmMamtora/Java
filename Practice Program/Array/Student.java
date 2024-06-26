package Programs.Array;

class student_data {
    int eno;
    String name;
    int marks;
}

public class Student {

    public static void main(String[] args) {
        student_data std1 = new student_data();
        std1.eno = 1;
        std1.name = "Om";
        std1.marks = 97;

        student_data std2 = new student_data();
        std2.eno = 2;
        std2.name = "Abcs";
        std2.marks = 87;

        student_data std3 = new student_data();
        std3.eno = 3;
        std3.name = "xyz";
        std3.marks = 68;

        student_data[] students = new student_data[3];
        students[0] = std1;
        students[1] = std2;
        students[2] = std3;

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].name);
            System.out.println(students[i].eno);
            System.out.println(students[i].marks);
        }

    }
}
