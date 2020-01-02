package com.pursuetao.fayelee0.leetcode.array;

/**
 * LeetCode 53 Easy
 *
 * Given an integer array nums, find the contiguous subarray (containing at least one number)
 * which has the largest sum and return its sum.
 */
public class MaximumSubarray {

    // If you have figured out the O(n) solution,
    // try coding another solution using the divide and conquer approach,
    // which is more subtle.
    public static int maxSubArray(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        int sum = nums[0];
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            sum = Math.max(sum + nums[i], nums[i]);
            max = Math.max(sum, max);
        }

        return max;
    }

}
