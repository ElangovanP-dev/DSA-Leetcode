public class NumberOfSubarrays {
    public static int numOfSubarrays(int[] arr, int k, int threshold) {
        int targetSum = k * threshold;
        int windowSum = 0;
        int count = 0;

        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        if (windowSum >= targetSum) {
            count++;
        }

        for (int i = k; i < arr.length; i++) {
            windowSum += arr[i] - arr[i - k];
            if (windowSum >= targetSum) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr1 = { 2, 2, 2, 2, 5, 5, 5, 8 };
        int k1 = 3;
        int threshold1 = 4;
        System.out.println("Example 1 Output: " + numOfSubarrays(arr1, k1, threshold1));

        int[] arr2 = { 11, 13, 17, 23, 29, 31, 7, 5, 2, 3 };
        int k2 = 3;
        int threshold2 = 5;
        System.out.println("Example 2 Output: " + numOfSubarrays(arr2, k2, threshold2));
    }
}
