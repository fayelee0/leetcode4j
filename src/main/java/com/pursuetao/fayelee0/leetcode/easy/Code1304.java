package com.pursuetao.fayelee0.leetcode.easy;

// 1304. Find N Unique Integers Sum up to Zero
// https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/
public class Code1304 {
    // if n is odd  ==> [xy0-x-x]
    // if n is even ==> [xy -x-y]
    public static int[] sumZero(int n) {
        if (n == 1) {
            return new int[]{0};
        }

        int[] ret = new int[n];
        int N = n / 2;
        if (n % 2 != 0) {
            ret[N] = 0;
        }

        for (int i = 0; i < N; i++) {
            ret[i] = i + 1;
            ret[n - i - 1] = -ret[i];
        }

        return ret;
    }
}
