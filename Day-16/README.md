# Day 16 - Plus One

## ðŸ§© Problem
Add 1 to a number represented as an array of digits.

## ðŸ’¡ Approach
- Start from rightmost digit
- Add 1; if result is not 10, return
- If 10, set to 0 and continue to next digit
- If overflow, create new array with leading 1

## â±ï¸ Complexity
- Time: O(n)
- Space: O(1) average, O(n) worst case
