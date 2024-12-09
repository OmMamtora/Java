package Programs.Array.GreekForGreek;

public class Min_Max {
    public static void main(String[] args) {
        int a[] = { 1, 5, 7, 6, 9 };

        int min = a[0], max = a[0];

        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            } else {
                a[i] = min;

            }
        }
        System.out.println("Max " + max);
        System.out.println("min " + min);
    }
}
