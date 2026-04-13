# Day 44 - Isomorphic Strings

## ðŸ§© Problem
Determine if two strings are isomorphic (characters can be remapped).

## ðŸ’¡ Approach
- Track last seen index of each character in both strings
- If mapping is inconsistent (different indices), not isomorphic
- Update indices as we iterate

## â±ï¸ Complexity
- Time: O(n)
- Space: O(1)
