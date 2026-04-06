import java.util.Arrays;

public class HIndex {
    public static int hIndex(int[] citations) {
        int n = citations.length;
        int max = 0;
        Arrays.sort(citations);
        for (int i = 0; i < n; i++) {
            if (citations[i] >= n - i) {
                max = Math.max(max, n - i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] c1 = {3, 0, 6, 1, 5};
        System.out.println("Example 1: " + hIndex(c1));

        int[] c2 = {1, 3, 1};
        System.out.println("Example 2: " + hIndex(c2));
    }
}
