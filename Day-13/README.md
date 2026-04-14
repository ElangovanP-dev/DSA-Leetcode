# Day 13 - 238. Product of Array Except Self

## 🧩 Problem
Given an array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

## 💡 Approach
- Use prefix and suffix products.
- Store prefix products in the result array, then iterate backwards to multiply by suffix products.

## ⏱️ Complexity
- Time: O(n)
- Space: O(1) (excluding result array).
