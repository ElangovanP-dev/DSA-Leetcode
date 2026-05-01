# Day 56 - Mirror Of Integer

## 🧩 Problem
Find the absolute difference between a given integer and its mirror image (reversed integer).

## 💡 Approach
- Extract the digits of the given integer one by one from right to left using modulo `10`.
- Reconstruct the mirrored integer by successively multiplying the current mirrored value by `10` and adding the extracted digit.
- Continue this process by dividing a temporary copy of the original number by `10` until it becomes `0`.
- Finally, calculate and return the absolute difference between the original integer and the newly formed mirrored integer.

## ⏱️ Complexity
- Time: O(log₁₀(n)) where n is the given integer, which represents the number of digits.
- Space: O(1)

