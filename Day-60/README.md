# Day 60 - 2806. Account Balance After Rounded Purchase

## 🧩 Problem
Given a string `moves` containing characters `'L'`, `'R'`, and `'_'`, find the furthest distance from the origin after all moves. `'_'` can be replaced with either `'L'` or `'R'` to maximize the distance.

## 💡 Approach
- Traverse the string and count `L` moves (decrement), `R` moves (increment), and `_` (wildcards)
- After processing, assign all wildcards to whichever direction the pointer is already leaning (positive → right, negative → left)
- Return the absolute value of the final position

## ⏱️ Complexity
- Time: O(n)
- Space: O(1)
