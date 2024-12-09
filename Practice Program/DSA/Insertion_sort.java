package Programs.DSA;

//We are not going to use  swapping here we are shifting element
public class Insertion_sort {
    public static void main(String[] args) {
        int[] arr = { 8, 2, 6, 7, 1, 9 };

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;

        }
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
