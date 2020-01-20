package com.pursuetao.fayelee0.leetcode.easy;

// 14. Longest Common Prefix
// https://leetcode.com/problems/longest-common-prefix/
public class Code14 {
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        } else {
            int N = strs[0].length();
            for (int i = 1, j = strs.length; i < j; i++) {
                N = Math.min(N, strs[i].length());
            }
            if (N == 0) {
                return "";
            } else {
                int index = 0;
                for (int i = 0; i < N; i++) {
                    char c = strs[0].charAt(i);
                    for (int j = 1; j < strs.length; j++) {
                        if (strs[j].charAt(i) != c) {
                            return strs[0].substring(0, index);
                        }
                    }
                    index++;
                }
                return strs[0].substring(0, index);
            }
        }
    }
}
