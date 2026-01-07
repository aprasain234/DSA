****************************************************
SLOW TWO POINTERS PROBLEMS
****************************************************


public int removeDuplicates(int[] numbers) {
    int left = 0;
    for(int right=0;right<=numbers.length-1;right++) {
        if(numbers[right] != numbers[left]) {

            left++;

        }
    }
    return left+1;
}

int[] numbers = {1,3,4,5,5,7,8,9,9,10,11,11}

public int removeDuplicates(int[] numbers) {
    if (numbers.length == 0) return 0;

    int left = 0;

    for (int right = 1; right < numbers.length; right++) {
        if (numbers[right] != numbers[left]) {
            left++;
            numbers[left] = numbers[right];
        }
    }

    return left + 1;
}

public int removeElement(int[] nums, int val) {
    int left=0;
    for(int right=0;right<nums.length;right++) {
        if(nums[right] != val) {
            nums[left] = nums[right];
            left++;
        }
    }
    return left;
}

int[] nums = {1,2,3,4,5,6,7}
int val= 6;


=============================================
Remove Duplicates from Sorted Array II
Input: nums = [1,1,1,2,2,3]
Output: 5, nums = [1,1,2,2,3,_]

class Solution {
    public int removeDuplicates(int[] numbers) {
        if (numbers.length <= 2) return numbers.length;
        int left = 2;
        for(int right=2;right<numbers.length;right++) {
            if(numbers[right] != numbers[left - 2]) {
                numbers[left] = numbers[right];
                left++;
            }
        }
        return left;
    }
}
==========================================

public int Solution(int[] nums) {
    int left = 0;
    for(int right = 0; right <= nums.length -1 ;right++) {
        if(nums[right] >= 0) {
            nums[left] = nums[right];
            left++;
        }
    }
    return left;
}
=================================

public int solution(int[] numbers) {
    int left = 0;
    for(int right = 0; right < numbers.length;right++) {
        if(numbers[right] != 0) {
            numbers[left] = numbers[right];
            left++;
        }
    }
    while (left < numbers.length) {
        numbers[left] = 0;
        left++;
    }

    return left;
}
============================================

