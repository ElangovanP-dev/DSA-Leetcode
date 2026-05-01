# Day 55 - 21. Merge Two Sorted Lists

## 🧩 Problem
You are given the heads of two sorted linked lists `list1` and `list2`. Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists. Return the head of the merged linked list.

## 💡 Approach (Recursive)
- **Base Cases**: If `list1` is null, return `list2`. If `list2` is null, return `list1`.
- **Recursive Step**: Compare the values of the current nodes.
  - If `list1.val < list2.val`, `list1` should come before `list2`. Recursively merge `list1.next` and `list2`, and attach the result to `list1.next`, then return `list1`.
  - Otherwise, `list2` should come before `list1`. Recursively merge `list1` and `list2.next`, and attach the result to `list2.next`, then return `list2`.

## ⏱️ Complexity
- **Time**: $O(n + m)$, where $n$ and $m$ are the lengths of `list1` and `list2`.
- **Space**: $O(n + m)$ due to the recursion stack.

