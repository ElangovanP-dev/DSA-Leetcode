class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max = 0;

        while (left < right) {
            int h = Math.min(height[left], height[right]);
            int w = right - left;
            max = Math.max(max, h * w);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] h1 = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println("Expected 49, got: " + maxArea(h1));

        int[] h2 = {1, 1};
        System.out.println("Expected 1, got: " + maxArea(h2));

        int[] h3 = {4, 3, 2, 1, 4};
        System.out.println("Expected 16, got: " + maxArea(h3));
    }
}