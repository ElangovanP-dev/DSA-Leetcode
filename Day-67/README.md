# Day 67 - 396. Rotate Function

## 🧩 Problem
Given an integer array `nums` of length `n`, define `F(k)` as:
`F(k) = 0 * nums[k] + 1 * nums[k+1] + ... + (n-1) * nums[k+n-1]`
where indices are taken mod `n`. Return the maximum value of `F(k)` over all rotations `k`.

## 💡 Approach
- Compute `F(0)` and `sum` of the entire array in one pass — O(n)
- Use the rolling formula to derive each subsequent rotation:
  `F(k) = F(k-1) + sum - n * nums[n-k]`
- Track the maximum value across all rotations

## ⚡ Key Learning
- Brute-force would be O(n²) — recomputing F(k) for every rotation from scratch
- The rolling recurrence formula cuts it to **O(n)** by reusing the previous result
- This pattern of "deriving the next state from the current state" is a powerful trick for rotation/window problems

## ⏱️ Complexity
- Time: O(n) — two linear passes (one for F(0)/sum, one for rotations)
- Space: O(1) — no extra data structures used
