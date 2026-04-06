public class JumpGameII {
    public static int jump(int[] nums) {
        int jump = 0;
        int curEnd = 0;
        int farthest = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            farthest = Math.max(farthest, i + nums[i]);
            if (i == curEnd) {
                jump++;
                curEnd = farthest;
            }
        }
        return jump;
    }

    public static void main(String[] args) {
        int[] nums1 = {2, 3, 1, 1, 4};
        System.out.println("Example 1: " + jump(nums1));

        int[] nums2 = {2, 3, 0, 1, 4};
        System.out.println("Example 2: " + jump(nums2));
    }
}
