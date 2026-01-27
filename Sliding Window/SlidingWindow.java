****************************************************
SLIDING WINDOWS
****************************************************
The Core Sliding Window Template (Memorize This)
===============================
1. Fixed Window
    for (int i = 0; i < k; i++) add(arr[i]);

    for (int right = k; right < n; right++) {
        remove(arr[right - k]);
        add(arr[right]);
        updateAnswer();
    }

===================================================
2. Variable Window (THIS WINS INTERVIEWS)
    int left = 0;

    for (int right = 0; right < n; right++) {
    add(arr[right]);

    while (conditionBroken()) {
        remove(arr[left]);
        left++;
    }

        updateAnswer();
    }

If you understand why the while exists, you’re ahead of 80% of candidates.
================================================

Given an array of positive integers, find the maximum length subarray whose sum ≤ k.
    int[] nums = [1,2,3,4,5,6,7,8];
    int k

    public int findLength(int[] nums, int k) {
    int left = 0;
    int curr = 0; // curr is the current sum of the window
    int ans = 0;

    for (int right = 0; right < nums.length; right++) {
        curr += nums[right];
        while (curr > k) {
            curr -= nums[left];
            left++;
        }

        ans = Math.max(ans, right - left + 1);
    }

    return ans;
}

===============================

643. Maximum Average Subarray I:
You are given an integer array nums consisting of n elements, and an integer k.
Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value. Any answer with a calculation error less than 10-5 will be
accepted.
Example 1:
Input: nums = [1,12,-5,-6,50,3], k = 4
Output: 12.75000
Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75
Example 2:
Input: nums = [5], k = 1
Output: 5.00000

class Solution {
    public double findMaxAverage(int[] nums, int k) {
        // Calculate sum of first window
        double windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }
        double maxSum = windowSum;
        // Slide window and track maximum sum
        for (int i = k; i < nums.length; i++) {
            windowSum = windowSum - nums[i - k] + nums[i];
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum / k;
    }
}
**Time Complexity:** O(n)
**Space Complexity:** O(1)

============================================================================