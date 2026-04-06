public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2};
        int k = removeDuplicates(nums);
        System.out.println("New length: " + k);
    }
}
