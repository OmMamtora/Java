package Programs.Array.GreekForGreek;

import java.util.Scanner;

public class SumTwoMatrix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a[][] = new int[2][2];
        int b[][] = new int[2][2];
        int sum[][] = new int[2][2];

        System.out.println("Enter value in matrix A:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter value in matrix B:");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        System.out.println("Sum of matrix A and B is : ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                sum[i][j] = a[i][j] + b[i][j];
                System.out.print(sum[i][j] + " ");
            }
            System.out.println(" ");
        }

    }
}
