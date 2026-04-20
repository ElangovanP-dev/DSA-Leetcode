# Day 58: Two Furthest Houses With Different Colors

## 📝 Problem Description
There are `n` houses evenly lined up on the street, and each house is beautifully painted. You are given a **0-indexed** integer array `colors` of length `n`, where `colors[i]` represents the color of the `i-th` house.

Return the **maximum** distance between two houses with **different** colors. The distance between the `i-th` and `j-th` houses is `abs(i - j)`.

## 💡 Approach: Brute Force Nested Loops
To find the maximum distance between two houses with different colors:

1. **Iterate**: Use two nested loops to check all possible pairs of houses. The outer loop pointer `i` represents the first house, and the inner loop pointer `j` represents the second house.
2. **Check Colors**: If `colors[i]` is not equal to `colors[j]`, calculate the distance `j - i`.
3. **Maximize Distance**: Keep track of the maximum distance found so far using `Math.max(maxDis, j - i)`.

*(Note: While an optimized $O(N)$ approach exists by checking from both ends to the start/end, the current nested loop reliably finds the distance via a simpler mechanism.)*

## ⚡ Key Learnings
- **Nested Iteration**: Basic arrays traversal to evaluate pairs.
- **Handling State**: Keeping a running maximum (`maxDis`) while iterating through possible combinations.

## ⏱️ Complexity
- **Time Complexity**: $O(n^2)$ — Due to checking every possible pair with nested loops.
- **Space Complexity**: $O(1)$ — No extra space is used, only a few variables.

---

## 💻 Implementation
```java
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

    public static void main(String[] args) {
        int[] colors = { 1, 3, 8, 3, 8 };
        FurthestHousesWithDifferentColors solver = new FurthestHousesWithDifferentColors();
        System.out.println(solver.maxDistance(colors));
    }
}
```
