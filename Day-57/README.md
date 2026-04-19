# Day 57: Maximum Distance Between a Pair of Values

## 📝 Problem Description
Given two **non-increasing** integer arrays `nums1` and `nums2`, find the maximum distance `j - i` such that `i <= j` and `nums1[i] <= nums2[j]`.

## 💡 Approach: Two-Pointer Technique
Since both arrays are already sorted in descending order (non-increasing), we can find the optimal distance efficiently:

1. **Two Pointers**: Use `i` for `nums1` and `j` for `nums2`.
2. **Scan & Match**:
   - If `nums1[i] <= nums2[j]`: We found a valid pair. We update our `maxDistance` and move `j` forward to see if we can get even further.
   - If `nums1[i] > nums2[j]`: The current value in `nums1` is too large. We increment `i` to find a smaller value.
3. **Efficiency**: This ensures we visit each element at most once.

## ⚡ Key Learnings
- **Double Pointers**: Excellent for optimizing searches in sorted or semi-sorted arrays.
- **Linear Scan**: Avoiding nested loops transforms the solution from $O(N^2)$ to $O(N+M)$.

## ⏱️ Complexity
- **Time Complexity**: $O(n + m)$ — Linear pass through both arrays.
- **Space Complexity**: $O(1)$ — No extra storage used.

---

## 💻 Implementation
```java
public class MaximumDistanceBetweenPairValue {
    public static int maxDistance(int[] nums1, int[] nums2) {
        int i = 0, j = 0;
        int maxDist = 0;
        
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] <= nums2[j]) {
                maxDist = Math.max(maxDist, j - i);
                j++; 
            } else {
                i++;
            }
        }
        return maxDist;
    }
}
```
