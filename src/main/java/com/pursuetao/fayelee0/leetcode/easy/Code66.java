package com.pursuetao.fayelee0.leetcode.easy;

import java.util.Arrays;

// 66. Plus One
// https://leetcode.com/problems/plus-one/
public class Code66 {
    public static int[] plusOne(int[] digits) {
        int N = digits.length;
        int c = 1;
        int sum;
        for (int i = N - 1; 0 <= i; i--) {
            sum = digits[i] + c;
            if (sum >= 10) {
                digits[i] = sum - 10;
                c = 1;
            } else {
                digits[i] = sum;
                return digits;
            }
        }

        int[] ret = new int[N+1];
        ret[0] = c;
        System.arraycopy(digits, 0, ret, 1, N);
        return ret;
    }
}
