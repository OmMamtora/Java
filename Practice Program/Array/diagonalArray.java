package Programs.Array.GreekForGreek.New;

import java.util.Scanner;

public class diagonalArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        int primaryDiagonal = 0;
        int secondaryDiagonal = 0;

        System.out.println("Enter Value:-> ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = sc.nextInt();
            }

        }

        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < arr.length; i++) {
            primaryDiagonal += arr[i][i];
        }

        for (int i = 0; i < arr.length; i++) {
            secondaryDiagonal += arr[i][arr.length - 1 - i];
        }

        System.out.println();

        System.out.println("Value of Primary diagonal is :->" + primaryDiagonal);
        System.out.println("Value of Secondary diagonal is :->" + secondaryDiagonal);
    }
}
