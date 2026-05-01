# Day 50 - Excel Sheet Column Number

## Problem
Convert column title (like "A", "Z", "AA") to column number.

## Approach
- Base-26 conversion
- Multiply result by 26 and add character value (A=1, B=2, ..., Z=26)

## Complexity
- Time: O(n)
- Space: O(1)

