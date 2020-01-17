package com.pursuetao.fayelee0.leetcode.easy;

// 1309. Decrypt String from Alphabet to Integer Mapping
// https://leetcode.com/problems/decrypt-string-from-alphabet-to-integer-mapping/
public class Code1309 {
    // Time     O(n)
    // Space    O(n)
    public static String freqAlphabets(String s) {
        int N = s.length();
        StringBuilder sb = new StringBuilder();
        for (int i = N - 1; i >= 0;) {
            if (s.charAt(i) == '#') {
                sb.append(mapping(s.charAt(i - 2), s.charAt(i - 1)));
                i -= 3;
            } else {
                sb.append(mapping(' ', s.charAt(i)));
                i--;
            }
        }
        return sb.reverse().toString();
    }

    private static char mapping(char s, char c) {
        char t;
        if (s == '2') {
            t = 't';
        } else if (s == '1') {
            t = 'j';
        } else {
            t = 'a' - 1;
        }
        return (char) (c - '0' + t);
    }

}
