# Day 09 - 55. Jump Game

## 🧩 Problem
Given an integer array nums, you are initially positioned at the first index. Each element represents your maximum jump length at that position. Determine if you can reach the last index.

## 💡 Approach
- Keep track of the furthest reachable index.
- If current index > furthest reachable, then we can't reach the end.

## ⏱️ Complexity
- Time: O(n)
- Space: O(1)
