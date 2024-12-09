package Programs.Array.GreekForGreek;

import java.util.Scanner;

public class Transpose_matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a[][] = new int[3][3];

        int transpose[][] = new int[3][3];

        System.out.println("Enter Element : ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("---------------");
        System.out.println("Before Transpose : ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j] + " ");

            }
            System.out.println("");
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                transpose[j][i] = a[i][j];

            }
        }

        System.out.println("---------------");
        System.out.println("After Transpose : ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println("");
        }

    }
}
