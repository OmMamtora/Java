package Programs.Array;

import java.util.Scanner;

public class Sum_Of_2d_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[2][2];
        int[][] b = new int[2][2];
        int[][] sum = new int[2][2];

        System.out.println("Enter element of matrix A:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] = sc.nextInt();
            }

        }

        System.out.println("------------");

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {

                System.out.println(a[i][j]);
            }

        }

        System.out.println("Enter element of matrix B:");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length; j++) {
                b[i][j] = sc.nextInt();
            }

        }

        System.out.println("--------------");

        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length; j++) {

                System.out.println(b[i][j]);
            }

        }

        for (int i = 0; i < sum.length; i++) {
            for (int j = 0; j < sum.length; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }

        for (int i = 0; i < sum.length; i++) {
            for (int j = 0; j < sum.length; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }

    }
}