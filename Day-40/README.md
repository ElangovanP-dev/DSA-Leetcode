# Day 40 - Climbing Stairs

## Problem
Find the number of ways to climb n stairs taking 1 or 2 steps at a time.

## Approach
- Dynamic programming with Fibonacci-like recurrence
- Maintain only last two values for space optimization
- f(n) = f(n-1) + f(n-2)

## Complexity
- Time: O(n)
- Space: O(1)

