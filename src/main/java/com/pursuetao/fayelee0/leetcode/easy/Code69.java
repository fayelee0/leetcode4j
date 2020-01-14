package com.pursuetao.fayelee0.leetcode.easy;

public class Code69 {
    public static int mySqrt(int x) {
        int i = 1;
        while (i * i < x) {
            i++;
        }
        return (i * i == x) ? i : i - 1;
    }
}
