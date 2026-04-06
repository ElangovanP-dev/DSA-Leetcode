public class SearchRange {
    public static int[] searchRange(int[] nums, int target) {
        int fPos = -1;
        int lPos = -1;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                if (fPos == -1) {
                    fPos = i;
                }
                lPos = i;
            }
        }
        
        return new int[]{fPos, lPos};
    }

    public static void main(String[] args) {
        int[] nums1 = {5, 7, 7, 8, 8, 10};
        int target1 = 8;
        int[] res1 = searchRange(nums1, target1);
        System.out.println("Example 1: [" + res1[0] + ", " + res1[1] + "]");

        int[] nums2 = {5, 7, 7, 8, 8, 10};
        int target2 = 6;
        int[] res2 = searchRange(nums2, target2);
        System.out.println("Example 2: [" + res2[0] + ", " + res2[1] + "]");

        int[] nums3 = {};
        int target3 = 0;
        int[] res3 = searchRange(nums3, target3);
        System.out.println("Example 3: [" + res3[0] + ", " + res3[1] + "]");
    }
}
