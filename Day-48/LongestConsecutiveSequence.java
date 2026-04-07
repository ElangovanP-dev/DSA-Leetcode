import java.util.*;

public class LongestConsecutiveSequence {
    public static int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int longest = 0;

        for (int num : set) {
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int count = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    count++;
                }

                longest = Math.max(longest, count);
            }
        }

        return longest;
    }

    public static void main(String[] args) {
        int[] nums1 = { 100, 4, 200, 1, 3, 2 };
        System.out.println("Example 1 \nInput: [100,4,200,1,3,2]");
        System.out.println("Output: " + longestConsecutive(nums1));

        int[] nums2 = { 0, 3, 7, 2, 5, 8, 4, 6, 0, 1 };
        System.out.println("\nExample 2 \nInput: [0,3,7,2,5,8,4,6,0,1]");
        System.out.println("Output: " + longestConsecutive(nums2));

        int[] nums3 = { 1, 0, 1, 2 };
        System.out.println("\nExample 3 \nInput: [1,0,1,2]");
        System.out.println("Output: " + longestConsecutive(nums3));
    }
}
