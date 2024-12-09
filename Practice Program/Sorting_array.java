package Programs.Array.GreekForGreek;

public class Sorting_array {
    public static void main(String[] args) {
        int[] a = { 1, 5, 7, 6, 9 };
        int temp = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] < a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }

            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "  ");
        }
    }
}
