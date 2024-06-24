package Practice_Program.Array;

public class Min_Max {
    public static void main(String[] args) {
        int[] number = { 5, 10, 18, 78, 651, 45 };
        int min = number[0];
        int max = number[0];

        for (int i = 0; i < number.length; i++) {
            if (number[i] > max) {
                max = number[i];
            } else if (number[i] < min) {
                min = number[i];
            }
        }
        System.out.println("min number is " + min);
        System.out.println("max number is " + max);
    }
}
