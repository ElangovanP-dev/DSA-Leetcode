public class MaxSubarray {
    public static int maxSubArray(int[] nums) {
        int res = nums[0];
        int total = 0;
        for (int n : nums) {
            if (total < 0) {
                total = 0;
            }
            total += n;
            res = Math.max(res, total);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Example 1: " + maxSubArray(nums1));

        int[] nums2 = {1};
        System.out.println("Example 2: " + maxSubArray(nums2));
    }
}
