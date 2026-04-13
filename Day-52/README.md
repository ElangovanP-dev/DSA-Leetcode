# Day 52 - Shuffle The Array

## ðŸ§© Problem
Shuffle array of 2n elements as [x1, x_n+1, x2, x_n+2, ..., xn, x_2n].

## ðŸ’¡ Approach
- Create output array
- Interleave elements: place nums[i] at position 2i and nums[n+i] at position 2i+1

## â±ï¸ Complexity
- Time: O(n)
- Space: O(n)
