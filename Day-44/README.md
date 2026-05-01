# Day 44 - Isomorphic Strings

## Problem
Determine if two strings are isomorphic (characters can be remapped).

## Approach
- Track last seen index of each character in both strings
- If mapping is inconsistent (different indices), not isomorphic
- Update indices as we iterate

## Complexity
- Time: O(n)
- Space: O(1)

