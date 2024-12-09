package Programs.DSA;

//Time Complexity is : O(n2)
public class Bubble_sort {
    public static void main(String[] args) {
        int[] nums = { 6, 5, 8, 7, 2, 9 };
        int temp = 0;
        int steps = 0;
        System.out.println("Before sorting..");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    steps++;
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("steps are : " + steps);
        System.out.println();
        System.out.println("After sorting..");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
