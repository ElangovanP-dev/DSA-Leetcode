# Day 27 - Roman To Integer

## Problem
Convert a Roman numeral string to an integer.

## Approach
- HashMap to store Roman symbol values
- Iterate from right to left
- Add symbol value if greater than previous, subtract if smaller (handles cases like IV, IX)

## Complexity
- Time: O(n)
- Space: O(1)

