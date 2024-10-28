package Programs.Array.GreekForGreek.New;

public class removeDuplicateArray {
    public static void main(String[] args) {
        int[] a = { 2, 2, 3, 4, 2, 3, 5, 6, 3, 3, 23 };

        int count = 0;
        int[] b = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            boolean isduplicate = false;

            for (int j = 0; j < a.length; j++) {
                if (a[i] == b[j]) {
                    isduplicate = true;
                    break;
                }
            }
            if (!isduplicate) {
                b[count] = a[i];
                count++;
            }
        }
        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < count; i++) {
            System.out.print(b[i] + " ");
        }

    }
}
