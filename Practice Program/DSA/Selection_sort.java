package Programs.DSA;

//Time Complexity  is : O(n2)

public class Selection_sort {

    public static void main(String[] args) {
        int[] nums = { 5, 8, 1, 3, 7, 25 };
        int temp = 0;
        int minIndex = -1;
        int steps = 0;

        System.out.println("Before Sorting..");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();

        for (int i = 0; i < nums.length - 1; i++) {
            minIndex = i;

            for (int j = i + 1; j < nums.length; j++) {
                if (nums[minIndex] > nums[j]) {
                    minIndex = j;
                }
            }
            temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;

            steps++;
        }

        System.out.println();
        System.out.println("Steps are : " + steps);
        System.out.println("After Sorting..");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
