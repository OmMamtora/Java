package Practice_Program;

import java.util.Scanner;

public class Reverse_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number:->");
        int no = sc.nextInt();

        int reminder;
        int reverse = 0;

        for (int i = 0; no != 0; i++) {
            reminder = no % 10;
            reverse = reverse * 10 + reminder;
            no /= 10;
        }
        System.out.println(reverse);
    }
}
