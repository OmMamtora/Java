package Practice_Program;

import java.util.Scanner;

public class Largest_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] no = new int[3];
        int max = 0;
        System.out.println("Enter Three Number..");

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter Number :->");
            no[i] = sc.nextInt();
        }
        System.out.println("----------");
        for (int i = 0; i < 3; i++) {

            System.out.println(no[i]);
        }

        for (int i = 0; i < no.length; i++) {
            if (no[i] > max) {
                max = no[i];
            }

        }
        System.out.println("------------");
        System.out.println("Max Number is " + max);
    }
}
