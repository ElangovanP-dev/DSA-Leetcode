# Day 11 - H-Index

## ðŸ§© Problem
Find the h-index where author has at least h papers with h citations each.

## ðŸ’¡ Approach
- Sort citations in ascending order
- For each position, check if citations[i] >= n - i
- Return maximum valid h-index

## â±ï¸ Complexity
- Time: O(n log n)
- Space: O(1)
