public class FurthestHousesWithDifferentColors {
    public int maxDistance(int[] colors) {
        int n = colors.length, maxDis = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (colors[i] != colors[j]) {
                    maxDis = Math.max(maxDis, j - i);
                }
            }
        }
        return maxDis;
    }
}