package Practice_Program;

import java.util.Scanner;

public class ASCII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter character for finding ASCII value:");
        String input = sc.nextLine();

        // Check if the user input is not empty
        if (!input.isEmpty()) {
            char ch = input.charAt(0);
            System.out.println("The ASCII value of " + ch + " is: " + (int) ch);
        } else {
            System.out.println("Invalid input. Please enter a character.");
        }

        // char ch = 'M';
        // System.out.println((int) ch);

    }
}
