# Day 14 - 134. Gas Station

## 🧩 Problem
Find the starting gas station index from which you can travel the entire circuit.

## 💡 Approach
- Check if total gas >= total cost.
- Greedy: If net gas at any point becomes negative, reset start to next station and current gas to 0.

## ⏱️ Complexity
- Time: O(n)
- Space: O(1)

