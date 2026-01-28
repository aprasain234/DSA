//****************************************************
//PREFIX SUM
//****************************************************
//The Core Sliding Window Template (Memorize This)
//===============================


//----------------------------------------------------------------------
//  CORE Formula:
public class PrefixSum {
    public static int[] calculatePrefixSum(int[] arr) {
        int[] prefixSum = new int[arr.length];
        prefixSum[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefixSum[i] = prefixSum[i-1] + arr[i];
        }
        return prefixSum;
    }
}
//---------------------------------------------------------------------------------------
/*
LC: 560. Subarray Sum Equals K
Solved
        Medium
Topics
premium lock icon
        Companies
Hint
Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.

A subarray is a contiguous non-empty sequence of elements within an array.

Example 1:
Input: nums = [1,1,1], k = 2
Output: 2

Example 2:
Input: nums = [1,2,3], k = 3
Output: 2


import java.util.HashMap;
import java.util.Map;

class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        freq.put(0, 1); // empty prefix sum occurs once

        int prefixSum = 0;
        int count = 0;

        for (int x : nums) {
            prefixSum += x;

            // number of previous prefix sums equal to (prefixSum - k)
            count += freq.getOrDefault(prefixSum - k, 0);

            // record current prefix sum
            freq.put(prefixSum, freq.getOrDefault(prefixSum, 0) + 1);
        }

        return count;
    }
}
*/

//---------------------------------------------------------------------------------------------------------


