# Day 65 - 594. Longest Harmonious Subsequence

## 🧩 Problem
A harmonious array is one where the difference between its maximum and minimum value is exactly `1`.
Given an integer array `nums`, return the length of its **longest harmonious subsequence** among all its possible subsequences.

## 💡 Approach
- **Sort** the array so all equal and consecutive numbers are grouped together
- Use a **two-pointer sliding window** — pointer `i` scans forward, pointer `j` marks the window start
- Shrink the window from the left (`j++`) whenever `nums[i] - nums[j] > 1`
- When `nums[i] - nums[j] == 1` exactly, the window `[j..i]` is a valid harmonious subsequence — update `maxValue`

## Key Learning
- Sorting transforms the problem into a simple sliding window — no extra space needed beyond the two pointers
- The difference condition `== 1` (not `>= 1`) is the key guard; we skip windows where all elements are equal (`diff == 0`)
- This approach trades the O(n) HashMap space for an O(n log n) sort, keeping space at O(1)

## Complexity
- Time: O(n log n) — dominated by sorting
- Space: O(1) — only two integer pointers used

