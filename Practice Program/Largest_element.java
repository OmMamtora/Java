package Programs.Array.GreekForGreek;

public class Largest_element {
    public static void main(String[] args) {
        int arr[] = { 25, 26, 27, 28, 29 };

        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Max Value is " + max);
    }
}
