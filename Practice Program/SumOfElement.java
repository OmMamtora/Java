package Programs.Array.GreekForGreek;

public class SumOfElement {
    public static void main(String[] args) {
        int a[] = { 1, 5, 7, 6, 9 };
        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        System.out.println(sum);
    }
}
