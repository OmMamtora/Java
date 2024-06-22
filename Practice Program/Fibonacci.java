package Practice_Program;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number:->");
        int n = sc.nextInt();

        int no1 = 0;
        int no2 = 1;
        int no3;

        for (int i = 0; i <= n; i++) {
            no3 = no1 + no2;
            System.out.print(" " + no3);
            no1 = no2;
            no2 = no3;
        }
    }
}
