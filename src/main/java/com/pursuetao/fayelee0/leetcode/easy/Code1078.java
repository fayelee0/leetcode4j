package com.pursuetao.fayelee0.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

// 1078. Occurrences After Bigram
// https://leetcode.com/problems/occurrences-after-bigram/
public class Code1078 {
    public static String[] findOcurrences(String text, String first, String second) {
        String[] substrings = text.split("\\s+");
        int N = substrings.length;
        List<String> ret = new ArrayList<>();
        for (int i = 0; i < N - 2; i++) {
            if (substrings[i].equals(first) && substrings[i + 1].equals(second)) {
                ret.add(substrings[i+2]);
            }
        }
        return ret.toArray(new String[0]);
    }
}
