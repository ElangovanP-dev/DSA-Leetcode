# Day 12 - 380. Insert Delete GetRandom O(1)

## 🧩 Problem
Implement a data structure that supports insert, delete, and getRandom in O(1) time.

## 💡 Approach
- Use a HashMap to store value-to-index mapping.
- Use an ArrayList to store the actual values.
- For deletion, swap the target element with the last element for O(1) removal.

## ⏱️ Complexity
- Time: O(1) for all operations.
- Space: O(n).

