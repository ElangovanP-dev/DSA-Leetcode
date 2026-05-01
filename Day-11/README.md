# Day 11 - 274. H-Index

## 🧩 Problem
Given an array of citations, return the h-index (maximum value of h such that h papers have at least h citations).

## 💡 Approach
- Sort the array in descending order or use a bucket sort.
- Iterate and find the last index where citations[i] >= i + 1.

## ⏱️ Complexity
- Time: O(n) using bucket sort, or O(n log n) with sorting.
- Space: O(n) or O(1).

