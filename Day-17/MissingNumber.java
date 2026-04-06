import java.util.Arrays;

public class MissingNumber {
    public static int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] != i) {
                return i;
            }
        }
        return n;
    }

    public static void main(String[] args) {
        int[] n1 = {3, 0, 1};
        System.out.println("Example 1: " + missingNumber(n1));

        int[] n2 = {0, 1};
        System.out.println("Example 2: " + missingNumber(n2));
    }
}
