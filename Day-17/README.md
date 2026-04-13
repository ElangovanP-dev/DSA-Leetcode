# Day 17 - Missing Number

## ðŸ§© Problem
Find the missing number in array containing n distinct numbers from 0 to n.

## ðŸ’¡ Approach
- Sort the array
- Find first index where nums[i] != i
- If no mismatch found, return n

## â±ï¸ Complexity
- Time: O(n log n)
- Space: O(1)
