package com.pursuetao.fayelee0.leetcode.easy;

// 7. Reverse Integer
// https://leetcode.com/problems/reverse-integer/
public class Code7 {
    public static int reverse(int x) {
        if (-10 < x && x < 10) {
            return x;
        }

        if (x == Integer.MIN_VALUE) {
            return 0;
        }

        int sign = (x < 0) ? -1 : 1;
        int ret = 0;
        for (int n = Math.abs(x); n != 0; n /= 10) {
            ret = ret * 10 + n % 10;
        }
        return ret * sign;
    }
}
