public class JumpGame {
    public static boolean canJump(int[] nums) {
        int reachable = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > reachable) {
                return false;
            }
            reachable = Math.max(reachable, i + nums[i]);
        }
        return true;
    }

    public static void main(String[] args) {
        int[] nums1 = {2, 3, 1, 1, 4};
        System.out.println("Can Jump (Example 1): " + canJump(nums1));

        int[] nums2 = {3, 2, 1, 0, 4};
        System.out.println("Can Jump (Example 2): " + canJump(nums2));
    }
}
