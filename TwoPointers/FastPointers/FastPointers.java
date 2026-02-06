****************************************************
FAST TWO POINTERS PROBLEMS
****************************************************

        =========================================================================
        1. Palindrome:
example: radar, racecar

public boolean isPalindrome(String givenString) {
    int left = 0;
    int right = givenString.length() - 1;

    while(left < right) {
        if(givenString.charAt(left) != givenString.charAt(right)) {
            return false;
        }
        left++;
        right--;
    }
    return true;
}

Reference for Palindrome:

public static void main(String[] args) {
    int i = 1;
    while(i <= 10){
        System.out.println("DSA");
        i++;
    }
}

==========================================================================================
public boolean isPalindrome(String s) {
    if(s == null) {
        return false;
    }
    int left = 0;
    int right = s.length() - 1;

    while(left < right) {
        if(s.charAt(left) != s.charAt(right)) {
            return false;
        }
        left++;
        right--;
    }
    return true;
}
==========================================
LC-88
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;          // last valid in nums1
        int j = n - 1;          // last in nums2
        int k = m + n - 1;      // write position in nums1

        while (j >= 0) {        // must place all nums2 elements
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
    }
}

========================================================
LC-11: https://chatgpt.com/canvas/shared/69842bc375448191ba853c176d7dbd68
class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int best = 0;

        while (left < right) {
            int width = right - left;
            int minHeight = Math.min(height[left], height[right]);
            int area = width * minHeight;
            if (area > best)
                best = area;

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return best;
    }
}

public int maxAreaOfWaterTank(int[] givenHeights) {
    int left = 0;
    int right = givenHeights.length - 1;
    int area = 0;

    while(left < right) {
        int width = right - left;
        int minimumHeight = Math.min(givenHeights[left], givenHeights[right]);
        int bestArea = width * minimumHeight;
        if(area < bestArea)
            bestArea = area;
        if(givenHeights[left] < givenHeights[right]) {
            left++;
        } else {
            right--;
        }
    }
    return bestArea;

}
=============================================================================
LC-167:
Two Summ ll - Input Array is Sorted

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;
        while(left < right) {
            if(numbers[left] + numbers[right] == target) {
                return new int[]{left + 1, right + 1};
            } else if(numbers[left] + numbers[right] < target) {
                left++;
            } else if(numbers[left] + numbers[right] > target) {
                right--;
            }
        }
        return new int[]{left + 1, right + 1};
    }
}
==================================================================================
189. Rotate Array
Medium Topics
Hint: Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;  // Handle k > n

        // Step 1: Reverse entire array
        reverse(nums, 0, n - 1);

        // Step 2: Reverse first k elements
        reverse(nums, 0, k - 1);

        // Step 3: Reverse remaining n-k elements
        reverse(nums, k, n - 1);
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
--------------------------------------------------------------------------------------------------------------