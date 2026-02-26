

public class KadanesAlgorithm {
    public static void main(String[] args) {

    }
    public int maxSubArray(int[] nums) {
        // Initialize variables to track the current subarray sum and the maximum sum
        int currentSum = nums[0];
        int maxSum = nums[0];

        // Iterate through the array, starting from the second element
        for (int i = 1; i < nums.length; i++) {
            // Decide whether to extend the current subarray or start a new one
            currentSum = Math.max(nums[i], currentSum + nums[i]);

            // Update the global maximum sum if the current sum is larger
            maxSum = Math.max(maxSum, currentSum);
        }

        // Return the maximum sum found
        return maxSum;
    }
}
