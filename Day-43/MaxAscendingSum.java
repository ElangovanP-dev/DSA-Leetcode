public class MaxAscendingSum {
    public static int maxAscendingSum(int[] nums) {
        int res = nums[0];
        int temp = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                temp += nums[i];
            } else {
                temp = nums[i];
            }
            res = Math.max(res, temp);
        }

        return res;
    }

    public static void main(String[] args) {
        int[] nums1 = { 10, 20, 30, 5, 10, 50 };
        System.out.print("Example 1 Input: [");
        for (int i = 0; i < nums1.length; i++) System.out.print(nums1[i] + (i < nums1.length - 1 ? "," : ""));
        System.out.println("]");
        System.out.println("Example 1 Output: " + maxAscendingSum(nums1));

        int[] nums2 = { 10, 20, 30, 40, 50 };
        System.out.print("Example 2 Input: [");
        for (int i = 0; i < nums2.length; i++) System.out.print(nums2[i] + (i < nums2.length - 1 ? "," : ""));
        System.out.println("]");
        System.out.println("Example 2 Output: " + maxAscendingSum(nums2));
    }
}
