class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return left;
    }

    public static void main(String[] args) {
        System.out.println("Expected 2, got: " + searchInsert(new int[]{1,3,5,6}, 5));
        System.out.println("Expected 1, got: " + searchInsert(new int[]{1,3,5,6}, 2));
        System.out.println("Expected 4, got: " + searchInsert(new int[]{1,3,5,6}, 7));
    }
}