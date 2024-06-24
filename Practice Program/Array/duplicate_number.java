package Practice_Program.Array;

public class duplicate_number {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 5, 8, 9, 6, 5, 2, 8, 3 };

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[j]);
                }
            }
        }

        // Count duplicate value in array..
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    break;
                }
            }
        }
        System.out.println("Count of duplicate value in array is " + count);
    }
}
