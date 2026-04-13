# Day 12 - Product Of Array Except Self

## ðŸ§© Problem
Return array where each element is the product of all other elements (without using division).

## ðŸ’¡ Approach
- First pass: calculate product of all elements left of current index
- Second pass: multiply by product of all elements right of current index

## â±ï¸ Complexity
- Time: O(n)
- Space: O(n)
