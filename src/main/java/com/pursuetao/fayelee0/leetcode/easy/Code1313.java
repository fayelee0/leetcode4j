package com.pursuetao.fayelee0.leetcode.easy;

// 1313. Decompress Run-Length Encoded List
// https://leetcode.com/problems/decompress-run-length-encoded-list/
public class Code1313 {
    // [1, 2, 3, 4, 5, 6]
    // [2]
    // [4, 4, 4]
    // [6, 6, 6, 6, 6]
    public static int[] decompressRLElist(int[] nums) {
        int N = nums.length;
        int M = 0;
        for (int i = 0; i < N - 1; i += 2) {
            M += nums[i];
        }

        int[] ret = new int[M];
        int k = 0;
        for (int i = 0; i < N - 1; i += 2) {
            int freq = nums[i], val = nums[i + 1];
            for (int j = 0; j < freq; j++) {
                ret[k++] = val;
            }
        }

        return ret;
    }
}
