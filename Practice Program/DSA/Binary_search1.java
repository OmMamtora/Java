package Programs.DSA;

//Time Complexity is : (log2n)

public class Binary_search1 {
    public static void main(String[] args) {

        int[] nums = { 1, 3, 5, 7, 9, 11, 13 };

        int target = 5;
        int result = binary_search(nums, target);

        if (target != -1) {
            System.out.println("Element found on index : " + result);
        } else {
            System.out.println("Element is not found..");
        }
    }

    public static int binary_search(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }

        return -1;
    }

}
