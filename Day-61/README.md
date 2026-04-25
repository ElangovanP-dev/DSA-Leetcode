# Day 61 - 482. Find Maximum Consecutive Ones

## 🧩 Problem
Given a binary array `nums`, return the maximum number of consecutive `1`s in the array.

## 💡 Approach
- Use a single pointer to traverse the array
- Maintain a `count` for current consecutive ones and `ans` for the maximum seen so far
- Increment `count` on every `1`, reset to `0` on every `0`
- Update `ans` after each increment using `Math.max`

## ⏱️ Complexity
- Time: O(n)
- Space: O(1)
