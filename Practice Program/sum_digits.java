package Practice_Program;

import java.util.Scanner;

public class sum_digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number:->");
        int no = sc.nextInt();

        int digit, sum = 0;

        for (int i = 0; no != 0; i++) {
            digit = no % 10;
            sum = sum + digit;
            no /= 10;
        }
        System.out.println(sum);
    }
}
