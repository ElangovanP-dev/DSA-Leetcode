import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class IntersectionOfTwoArrays {
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        for (int num : nums1) {
            set1.add(num);
        }

        Set<Integer> result = new HashSet<>();
        for (int num : nums2) {
            if (set1.contains(num)) {
                result.add(num);
            }
        }

        int[] out = new int[result.size()];
        int idx = 0;
        for (int num : result) {
            out[idx++] = num;
        }

        return out;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        System.out.println("Expected [2], got: " + Arrays.toString(intersection(nums1, nums2)));

        int[] nums3 = {4, 9, 5};
        int[] nums4 = {9, 4, 9, 8, 4};
        System.out.println("Expected [4,9] or [9,4], got: " + Arrays.toString(intersection(nums3, nums4)));
    }
}