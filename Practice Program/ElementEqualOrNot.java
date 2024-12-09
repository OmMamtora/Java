package Programs.Array.GreekForGreek;

import java.util.Scanner;

public class ElementEqualOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] a = new int[2][2];
        int[][] b = new int[2][2];
        boolean result = false;

        System.out.println("Enter elements in matrix A:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements in matrix B:");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i][j] == b[i][j]) {
                    result = true;
                    break;
                } else {
                    result = false;
                    break;
                }
            }
        }

        // Print result
        if (result) {
            System.out.println("Matrices are the same.");
        } else {
            System.out.println("Matrices are not the same.");
        }
    }
}
