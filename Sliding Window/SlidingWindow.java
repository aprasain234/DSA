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

Longest Substring Without Repeating Characters
Example: s = "abcabcbb" → answer 3 ("abc")
