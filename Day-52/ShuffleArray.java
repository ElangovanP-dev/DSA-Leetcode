import java.util.Arrays;

class ShuffleArray {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2 * n];
        for (int i = 0; i < n; i++) {
            ans[2 * i] = nums[i];
            ans[2 * i + 1] = nums[n + i];
        }
        return ans;
    }

    public static void main(String[] args) {
        ShuffleArray sol = new ShuffleArray();
        System.out.println(Arrays.toString(sol.shuffle(new int[] { 2, 5, 1, 3, 4, 7 }, 3)));
    }
}