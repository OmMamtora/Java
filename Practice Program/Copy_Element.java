package Programs.Array.GreekForGreek;

public class Copy_Element {
    public static void main(String[] args) {
        int arr1[] = { 23, 34, 45, 56, 67 };
        int arr2[] = new int[arr1.length];

        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
        System.out.println("Array 2 value brfore copy");
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }

        System.out.println("Array 2 value after copy..");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                arr2 = arr1;
            }
            // System.out.println(arr1[i] + "|" + arr2[i]);
            System.out.println(arr2[i]);
        }
    }
}
