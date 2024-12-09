package Programs.DSA;

// Time complexity is : O(n)

public class Linear_search1 {

    public static void main(String[] args) {
        int[] nums = { 2, 4, 6, 8, 10, 12, 14 };
        int target = 12;

        int result = linerarsearch(nums, target);

        if (result != -1) {
            System.out.println("Element found at index : " + result);
        } else {
            System.out.println("Element not found..");
        }

    }

    public static int linerarsearch(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }

        return -1;
    }
}
