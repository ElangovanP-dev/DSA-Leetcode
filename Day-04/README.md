# Day 04 - 80. Remove Duplicates from Sorted Array II

## 🧩 Problem
Remove duplicates from sorted array allowing at most 2 occurrences of each element.

## 💡 Approach
- Single pointer with condition: allow element if fewer than 2 occurrences or current element is greater than the element two positions back.
- Formula: `i < 2 || n > nums[i-2]` to validate.

## ⏱️ Complexity
- Time: O(n)
- Space: O(1)
