package Practice_Program;

import java.util.Scanner;

public class count_odd_even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number:->");
        int n = sc.nextInt();
        int even = 0, odd = 0;

        while (n != 0) {
            int reminder = n % 10;
            if (reminder % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            n /= 10;

        }
        System.out.println("Even number is " + even);
        System.out.println("Odd number is " + odd);
    }
}
