package Programs.Array;

public class Genrate_randomNum {
    public static void main(String[] args) {
        int[][] num = new int[3][4];

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                num[i][j] = (int) (Math.random() * 100);

            }
        }

        System.out.println("--------------------");

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                System.out.print(num[i][j] + " ");
            }
            System.out.println(" ");
        }

    }
}
