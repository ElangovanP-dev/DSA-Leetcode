# Day 64 - 2033. Minimum Operations to Make a Uni-Value Grid

## 🧩 Problem
Given a 2D integer `grid` of size `m x n` and an integer `x`, in one operation you can add or subtract `x` from any element.
Return the **minimum number of operations** to make all elements equal, or `-1` if it is impossible.

## 💡 Approach
- Flatten the 2D grid into a 1D list and sort it — O(m·n·log(m·n))
- Pick the **median** element as the target (minimises total absolute deviation)
- Validate feasibility: every element must share the same remainder when divided by `x`
- Sum up `|element - median| / x` for all elements to get the minimum operations

## ⚡ Key Learning
- The **median minimises the sum of absolute differences** — a classic mathematical insight that avoids brute-force target enumeration entirely
- Remainder check `num % x != median % x` is a quick early-exit for impossible cases
- Flattening + sorting trades space for a clean, linear scan

## ⏱️ Complexity
- Time: O(m·n·log(m·n)) — dominated by sorting the flattened grid
- Space: O(m·n) — for the auxiliary list
