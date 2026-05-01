# Day 17 - Missing Number

## Problem
Find the missing number in array containing n distinct numbers from 0 to n.

## Approach
- Sort the array
- Find first index where nums[i] != i
- If no mismatch found, return n

## Complexity
- Time: O(n log n)
- Space: O(1)

