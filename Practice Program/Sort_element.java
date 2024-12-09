package Programs.Array.GreekForGreek;

public class Sort_element {

    public static void main(String[] args) {
        int[] a = { 3, 4, 0, 8, 0, 0, 9 };
        // int min = a[0];
        int temp = 0;

        System.out.print("Before sorted : ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }

        }
        System.out.println("");
        System.out.print("After sorted : ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

}
