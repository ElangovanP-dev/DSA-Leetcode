import java.util.Arrays;

public class RunningSumOf1dArray {

    public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        return nums;
    }

    public static void main(String[] args) {
        RunningSumOf1dArray solution = new RunningSumOf1dArray();
        
        int[] nums1 = {1, 2, 3, 4};
        System.out.println("Input: nums = [1,2,3,4]");
        System.out.println("Output: " + Arrays.toString(solution.runningSum(nums1)));

        int[] nums2 = {1, 1, 1, 1, 1};
        System.out.println("\nInput: nums = [1,1,1,1,1]");
        System.out.println("Output: " + Arrays.toString(solution.runningSum(nums2)));
        
        int[] nums3 = {3, 1, 2, 10, 1};
        System.out.println("\nInput: nums = [3,1,2,10,1]");
        System.out.println("Output: " + Arrays.toString(solution.runningSum(nums3)));
    }
}
