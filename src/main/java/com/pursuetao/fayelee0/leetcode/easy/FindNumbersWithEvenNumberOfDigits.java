package com.pursuetao.fayelee0.leetcode.easy;

/**
 * <a href="https://leetcode.com/problems/find-numbers-with-even-number-of-digits/">LeetCode 1295 Easy</a>
 *
 * Given an array nums of integers, return how many of them contain an even number of digits.
 */
public class FindNumbersWithEvenNumberOfDigits {

    public static int findNumbers(int[] nums) {
        int ret = 0;
        for (int num : nums) {
            if (containsEvenNumberOfDigits(num)) {
                ret++;
            }
        }
        return ret;
    }

    // 1 <= nums[i] <= 10^5
    private static boolean containsEvenNumberOfDigits(int num) {
        if (num < 10) {
            return false;
        } else if (num < 100) {
            return true;
        } else if (num < 1000) {
            return false;
        } else return num < 10000;
    }

}
