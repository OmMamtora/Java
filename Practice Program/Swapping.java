package Practice_Program;

import java.util.Scanner;

public class Swapping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number 1:->");
        int no1 = sc.nextInt();
        System.out.println("Enter Number 2:->");
        int no2 = sc.nextInt();

        System.out.println("Before Swapping..");
        System.out.println(no1 + " and " + no2);

        no1 = no1 + no2;
        no2 = no1 - no2;
        no1 = no1 - no2;

        System.out.println("After Swapping..");
        System.out.println(no1 + " and " + no2);

    }
}
