public class MaximumDistanceBetweenPairValue {
    public static int maxDistanceValue(int[] nums1, int[] nums2) {
        int i = 0, j = 0;
        int maxDistance = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] <= nums2[j]) {
                maxDistance = Math.max(maxDistance, j - i);
                j++;
            } else {
                i++;
            }
        }
        return maxDistance;
    }

    public static void main(String[] args) {
        int nums1[] = { 2, 2, 2 };
        int nums2[] = { 10, 10, 1 };
        System.out.println(maxDistanceValue(nums1, nums2));
    }
}