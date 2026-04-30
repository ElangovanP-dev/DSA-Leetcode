# Day 66 - 561. Array Partition

## 🧩 Problem
Given an integer array `nums` of `2n` integers, group these integers into `n` pairs `(a1, b1), (a2, b2), ..., (an, bn)` such that the sum of `min(ai, bi)` for all `i` is **maximised**. Return the maximised sum.

## 💡 Approach
- Sort the array in ascending order
- After sorting, the optimal pairing is always adjacent elements: `(nums[0], nums[1])`, `(nums[2], nums[3])`, ...
- The minimum of each pair is always the smaller (even-indexed) element
- Iterate from the second-last element backwards with a step of 2 and sum every even-indexed value

## ⚡ Key Learning
- Sorting reveals the greedy insight: pairing adjacent elements maximises the contribution of each pair's minimum
- Traversing from the right with step 2 is a clean alternative to the classic left-to-right even-index sum — both yield the same result

## ⏱️ Complexity
- Time: O(n log n) — dominated by sorting
- Space: O(1) — in-place sort, no extra data structures
