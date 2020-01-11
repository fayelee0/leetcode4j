package com.pursuetao.fayelee0.leetcode.easy;

/**
 * <a href="https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/">LeetCode 1281 Easy</a>
 * <p>
 * Given an integer number n, return the difference between the product of its digits and the sum of its digits.
 */
public class SubtractTheProductAndSumOfDigitsOfAnInteger {

    // 1 <= n <= 10^5
    public static int subtractProductAndSum(int n) {
        int p = 1, s = 0;

        for (; n != 0; n /= 10) {
            int last = n % 10;

            p *= last;
            s += last;
        }

        return p - s;
    }

}
