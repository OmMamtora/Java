package Programs.DSA;

/*
Time Complexity : O(n log(n))
 */
public class Marge_sort {

    private static void margeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            margeSort(arr, left, mid);
            margeSort(arr, mid + 1, right);

            marge(arr, left, mid, right);
        }
    }

    private static void marge(int[] arr, int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] lArr = new int[n1];
        int[] rArr = new int[n2];

        for (int x = 0; x < n1; x++) {
            lArr[x] = arr[left + x];
        }

        for (int y = 0; y < n2; y++) {
            rArr[y] = arr[mid + 1 + y];
        }

        int i = 0, j = 0;
        int k = left;

        while (i < n1 && j < n2) {
            if (lArr[i] < rArr[j]) {
                arr[k] = lArr[i];
                i++;
            } else {
                arr[k] = rArr[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = lArr[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = rArr[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 3, 5, 1, 4, 6, 2 };

        System.out.println("Before Sorting..");
        for (int n : arr) {
            System.out.print(n + " ");
        }
        System.out.println();

        margeSort(arr, 0, arr.length - 1);

        System.out.println("After Sorting..");
        for (int n : arr) {
            System.out.print(n + " ");
        }
    }

}
