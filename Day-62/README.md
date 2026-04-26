# Day 62 - 94. Binary Tree Inorder Traversal

## 🧩 Problem
Given the `root` of a binary tree, return the **inorder traversal** of its nodes' values.
Inorder traversal visits nodes in the order: **Left → Root → Right**.

## 💡 Approach
- Use a private helper method `traverse()` to perform recursive DFS
- Base case: if the current node is `null`, return immediately
- Recursively traverse the left subtree first, then add the root value, then traverse the right subtree
- Collect results in a shared `List<Integer>`

## ⏱️ Complexity
- Time: O(n) — every node is visited exactly once
- Space: O(n) — recursion call stack depth in the worst case (skewed tree)
