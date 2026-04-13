class MaximumAverageSubarrayI {
    public static double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        if (k <= 0 || k > n) {
            throw new IllegalArgumentException("k must be between 1 and nums.length");
        }

        long sum = 0L;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }        

        long maxSum = sum;

        for (int i = k; i < n; i++) {
            sum += nums[i];
            sum -= nums[i - k];
            if (sum > maxSum) {
                maxSum = sum;
            }
        }

        return (double) maxSum / k;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 12, -5, -6, 50, 3};
        int k1 = 4;
        System.out.println("Expected 12.75, got: " + findMaxAverage(nums1, k1));

        int[] nums2 = {5};
        int k2 = 1;
        System.out.println("Expected 5.0, got: " + findMaxAverage(nums2, k2));

        int[] nums3 = {-1, -12, -5, -6, -50, -3};
        int k3 = 2;
        System.out.println("Expected -3.5, got: " + findMaxAverage(nums3, k3));
    }
}