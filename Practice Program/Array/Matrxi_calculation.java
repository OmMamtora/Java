package Programs.Array;

import java.util.Scanner;

class calculation {

    Scanner sc = new Scanner(System.in);

    int[][] a = new int[2][2];
    int[][] b = new int[2][2];
    int[][] sum = new int[2][2];
    int[][] sub = new int[2][2];
    int[][] mul = new int[2][2];
    int[][] div = new int[2][2];

    public void add() {
        System.out.println("Enter value in matix A:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter value in matrix B:");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        System.out.println("-------------");
        for (int i = 0; i < sum.length; i++) {
            for (int j = 0; j < sum.length; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        System.out.println("Sum of a and b");
        for (int i = 0; i < sum.length; i++) {
            for (int j = 0; j < sum.length; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void sub() {
        System.out.println("Enter Value on matrix A:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter Value on matrix B:");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        System.out.println("--------------");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                sub[i][j] = a[i][j] - b[i][j];
            }
        }
        System.out.println("Sub of ans A and B:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(sub[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void mul() {
        System.out.println("Enter Value on matrix A:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter Value on matrix B:");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        System.out.println("--------------");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                mul[i][j] = a[i][j] * b[i][j];
            }
        }
        System.out.println("Sub of ans A and B:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(mul[i][j] + " ");
            }
            System.out.println();
        }

    }

    public void div() {
        System.out.println("Enter Value on matrix A:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter Value on matrix B:");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        System.out.println("--------------");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                div[i][j] = a[i][j] / b[i][j];
            }
        }
        System.out.println("Sub of ans A and B:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(div[i][j] + " ");
            }
            System.out.println();
        }
    }
}

public class Matrxi_calculation {

    calculation cal = new calculation();

    Scanner sc = new Scanner(System.in);

    public void displayMenu() {
        System.out.println("-*-*-*-*-*-*");
        System.out.println("1. Addition of Matrix.");
        System.out.println("2. Subtraction of Matrix.");
        System.out.println("3. Multiplication of Matrix.");
        System.out.println("4. Division of Matrix.");
        System.out.println("5. Exit");
    }

    public void handleCalculation(int choice) {
        switch (choice) {
            case 1:
                System.out.println("Addition of matrix A and B ");
                cal.add();
                break;
            case 2:
                System.out.println("Subtraction of matrix A and B ");
                cal.sub();
                break;
            case 3:
                System.out.println("Multiplication of matrix A and B ");
                cal.mul();
                break;
            case 4:
                System.out.println("Division of matrix A and B ");
                cal.div();
                break;
            case 5:
                System.out.println("Thank you!");
                System.exit(0);

            default:
                System.out.println("Enter valid Choice..");
        }

    }

    public void start() {

        while (true) {
            displayMenu();
            System.out.println("Enter Choice between 1 to 4:->");
            int choice = sc.nextInt();

            handleCalculation(choice);
        }
    }

    public static void main(String[] args) {
        calculation cal = new calculation();
        Matrxi_calculation m_cal = new Matrxi_calculation();
        m_cal.start();
    }
}
