package Practice_Program;

import java.util.Scanner;

public class Number_prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean primeNo = true;

        System.out.println("Enter Number:->");
        int no = sc.nextInt();

        if (no <= 1) {
            primeNo = false;
        } else {
            for (int i = 2; i <= Math.sqrt(no); i++) {
                if (no % i == 0) {
                    primeNo = false;
                    break;
                }
            }

        }
        if (primeNo) {
            System.out.println("Number is prime..");
        } else {
            System.out.println("Number is not prime..");
        }
    }
}
