# Day 59: Longest Continuous Increasing Subsequence

## 📝 Problem Description
Given an unsorted array of integers `nums`, return the length of the **longest continuous strictly increasing subsequence** (i.e., subarray).

A subsequence is continuous if it is a subarray of one contiguous part of nums.

## 💡 Approach: Linear Scan

1. **Iterate**: Traverse the array from index `1` to `n-1`.
2. **Check**: If `nums[i] > nums[i-1]`, the current streak continues — increment counter `c`.
3. **Reset**: Otherwise, reset `c` back to `1` (a single element is always a valid subsequence).
4. **Track Maximum**: After each step, update `count` with the maximum of `count` and `c`.

## ⚡ Key Learnings
- **Single Pass**: No need for nested loops — one pass is enough to track the running streak.
- **Reset on Break**: When the increasing condition fails, the streak resets to `1`, not `0`, since each element alone counts as a subsequence of length 1.

## ⏱️ Complexity
- **Time Complexity**: $O(n)$ — Single pass through the array.
- **Space Complexity**: $O(1)$ — Only a constant number of variables used.

---

## 💻 Implementation
```java
class LongestContinuousSubsequence {
    public int findLengthOfLCIS(int[] nums) {
        int n = nums.length;
        if (n == 1)
            return 1;
        int count = 0, c = 1;
        for (int i = 1; i < n; i++) {
            if (nums[i] > nums[i - 1]) {
                c++;
            } else {
                c = 1;
            }
            if (c > count) {
                count = c;
            }
        }
        return count;
    }
}
```

