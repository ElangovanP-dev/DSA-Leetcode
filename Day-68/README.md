# Day 68 - 118. Pascal's Triangle

## 🧩 Problem
Given an integer `numRows`, return the first `numRows` of Pascal's triangle.
In Pascal's triangle, each number is the sum of the two numbers directly above it.

## 💡 Approach
- Create a list of lists called `pascal` to store the rows of the triangle.
- Iterate `i` from `0` to `numRows - 1` to build each row.
- For each row `i`, create a new list `row`.
- Iterate `j` from `0` to `i` to populate the current row.
- If `j == 0` or `j == i` (the edges of the row), add `1` to the row.
- Otherwise, retrieve the previous row from `pascal` and calculate the current element as the sum of `prevRow.get(j)` and `prevRow.get(j-1)`.
- Append the constructed `row` to the `pascal` list.

## 🚀 Key Learning
- Iterative DP-like approach works efficiently by relying on the previously computed row to build the current row.
- Edge elements of every row in Pascal's Triangle are always `1`, making it simple to construct recursively or iteratively.

## 📈 Complexity
- **Time Complexity**: `O(numRows²)` - We traverse a total of `1 + 2 + 3 + ... + numRows` elements, which is `numRows * (numRows + 1) / 2` iterations.
- **Space Complexity**: `O(numRows²)` - This space is used for the output array `pascal` storing all the elements of the triangle. No extra auxiliary space is used.
