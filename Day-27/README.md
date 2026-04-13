# Day 27 - Roman To Integer

## ðŸ§© Problem
Convert a Roman numeral string to an integer.

## ðŸ’¡ Approach
- HashMap to store Roman symbol values
- Iterate from right to left
- Add symbol value if greater than previous, subtract if smaller (handles cases like IV, IX)

## â±ï¸ Complexity
- Time: O(n)
- Space: O(1)
