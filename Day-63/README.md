# Day 63 - 796. Rotate String

## 🧩 Problem
## Problem
Given two strings `s` and `goal`, return `true` if and only if `s` can become `goal` after some number of shifts.
A shift moves the leftmost character of `s` to the rightmost position.

## Approach
- First check if both strings have the same length — if not, return `false`
- Concatenate `s` with itself → `s + s` contains all possible rotations of `s`
- Simply check if `goal` is a substring of `s + s` using `contains()`

## Key Learning

## Complexity
- Time: O(n) — string concatenation and `contains()` check
- Space: O(n) — for the doubled string `temp`

