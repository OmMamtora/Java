package Programs.DSA;

//Time Complextiy

//Best Case: O(n log(n))
//Worst Case : O(n2)

public class Quick_sort {

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {

            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }

        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 15, 9, 6, 3, 5 };

        System.out.println("Before Sorting array : ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        quickSort(arr, 0, arr.length - 1);

        System.out.println("After Sorting array : ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
