# Day 50 - Excel Sheet Column Number

## ðŸ§© Problem
Convert column title (like "A", "Z", "AA") to column number.

## ðŸ’¡ Approach
- Base-26 conversion
- Multiply result by 26 and add character value (A=1, B=2, ..., Z=26)

## â±ï¸ Complexity
- Time: O(n)
- Space: O(1)
