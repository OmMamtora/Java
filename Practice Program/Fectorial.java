package Practice_Program;

import java.util.Scanner;

public class Fectorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int fact = 1;
        System.out.println("Enter number:->");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            fact = i * fact;

        }
        System.out.println("Factorial of number " + n + " is " + fact);
    }
}
