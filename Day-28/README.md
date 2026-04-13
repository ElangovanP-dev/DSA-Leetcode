# Day 28 - Longest Common Prefix

## ðŸ§© Problem
Find the longest common prefix string among an array of strings.

## ðŸ’¡ Approach
- Sort the array
- Compare characters of first and last strings (after sorting, extremes determine common prefix)
- Return substring of matching characters

## â±ï¸ Complexity
- Time: O(n log n + m) where n is array size, m is string length
- Space: O(1)
