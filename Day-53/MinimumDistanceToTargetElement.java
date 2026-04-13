public class MinimumDistanceToTargetElement {
    public static int getMinDistance(int nums[], int target, int start) {
        int minDis = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                minDis = Math.min(minDis, Math.abs(start - i));
            }
        }
        return minDis;
    }

    public static void main(String args[]) {
        int nums[] = { 1, 2, 3, 4, 5 };
        System.out.println(getMinDistance(nums, 5, 3));
    }
}