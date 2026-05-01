# Day 06 - 189. Rotate Array

## Problem
Rotate array to the right by k steps.

## Approach
- Create temporary array to store rotated positions
- Use modulo operator to calculate new positions: (i + k) % n
- Copy back to original array

## Complexity
- Time: O(n)
- Space: O(n)

