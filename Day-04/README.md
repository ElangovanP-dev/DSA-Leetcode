# Day 04 - Remove Duplicates II

## ðŸ§© Problem
Remove duplicates from sorted array allowing at most 2 occurrences of each element.

## ðŸ’¡ Approach
- Single pointer with condition: allow element if fewer than 2 occurrences or current element > two positions back
- Check i < 2 || n > nums[i-2] to validate

## â±ï¸ Complexity
- Time: O(n)
- Space: O(1)
