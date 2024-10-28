package Programs.Array.GreekForGreek.New;

import java.util.Scanner;

public class boundryArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] a = new int[3][3];

        System.out.println("Enter value:->");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.println(a[i][j]);
            }
            System.out.println();
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (i == 0 || j == 0 || i == a.length - 1 || j == a[i].length - 1) {
                    System.out.print(a[i][j]);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
