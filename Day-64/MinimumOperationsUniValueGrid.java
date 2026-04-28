import java.util.*;

class MinimumOperationsUniValueGrid {
    public int minOperations(int[][] grid, int x) {
        List<Integer> numsArray = new ArrayList<>();
        int result = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                numsArray.add(grid[i][j]);
            }
        }
        Collections.sort(numsArray);
        int length = numsArray.size();
        int finalCommonNumber = numsArray.get(length / 2);
        for (int number : numsArray) {
            if (number % x != finalCommonNumber % x) {
                return -1;
            }
            result += Math.abs(finalCommonNumber - number) / x;
        }
        return result;
    }
}
