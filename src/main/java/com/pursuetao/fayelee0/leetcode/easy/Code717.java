package com.pursuetao.fayelee0.leetcode.easy;

// 717. 1-bit and 2-bit Characters
// https://leetcode.com/problems/1-bit-and-2-bit-characters/
public class Code717 {
    public static boolean isOneBitCharacter(int[] bits) {
        int N = bits.length;
        int i = 0;
        while (i < N - 1) {
            if (bits[i] != 0) {
                i += 2;
            } else {
                i++;
            }
        }
        return i == N - 1;
    }
}
