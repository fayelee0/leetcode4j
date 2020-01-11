package com.pursuetao.fayelee0.leetcode.array;

/**
 * <a href="https://leetcode.com/problems/missing-number/">268. Missing Number</a>
 * <p>
 * Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.
 * <p>
 * Example 1:
 * <p>
 * Input: [3,0,1]
 * Output: 2
 * <p>
 * Example 2:
 * <p>
 * Input: [9,6,4,2,3,5,7,0,1]
 * Output: 8
 * <p>
 * Note:
 * Your algorithm should run in linear runtime complexity. Could you implement it using only constant extra space complexity?
 */
public class Code268 {
    // release
    public static int missingNumber(int[] nums) {
        int N = nums.length;
        long ret = N;
        for (int i = 0; i < N; i++) {
            ret += i;
            ret -= nums[i];
        }
        return (int) ret;
    }

    // Strategy:
    // 1. sum = n·(n+1)/2
    // 2. subtract
    //
    // Measure:
    // Time     O(n)    1.0
    // Space    O(1)    1.0
    public static int missingNumber1(int[] nums) {
        int sum = nums.length * (nums.length + 1) / 2;
        for (int n : nums) {
            sum -= n;
        }
        return sum;
    }

    // fix overflow: n * n bigger than int
    public static int missingNumber2(int[] nums) {
        long sum = nums.length * (nums.length + 1) / 2;
        for (int n : nums) {
            sum -= n;
        }
        return (int) sum;
    }

    // Strategy:
    // 1. nums = [0, 1, ..., n-1, n] except one
    // 2. subtract sequence [0, 1, ..., n-1, n]
    // 3. result is <one>
    //
    // Measure:
    // Time     O(n)    1.0
    // Space    O(1)    1.0
    public static int missingNumber3(int[] nums) {
        int N = nums.length;

        int ret = N;
        for (int i = 0; i < N; i++) {
            ret += i;
            ret -= nums[i];
        }

        return ret;
    }

    // fix overflow
    public static int missingNumber4(int[] nums) {
        int N = nums.length;

        long ret = N;
        for (int i = 0; i < N; i++) {
            ret += i;
            ret -= nums[i];
        }

        return (int) ret;
    }
}
