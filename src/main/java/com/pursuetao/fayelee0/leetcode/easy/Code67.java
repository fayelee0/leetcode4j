package com.pursuetao.fayelee0.leetcode.easy;

// 67. Add Binary
// https://leetcode.com/problems/add-binary/
public class Code67 {
    public static String addBinary(String a, String b) {
        int N = a.length();
        int M = b.length();

        int i = N - 1;
        int j = M - 1;

        StringBuilder sb = new StringBuilder();
        int A = 0;
        int S;
        while (i >= 0 && j >= 0) {
            S = (a.charAt(i--) + b.charAt(j--) - '0' - '0' + A);
            A = S / 2;
            sb.append((char) (S % 2 + '0'));
        }

        while (i >= 0) {
            S = (a.charAt(i--) - '0' + A);
            A = S / 2;
            sb.append((char) (S % 2 + '0'));
        }

        while (j >= 0) {
            S = (b.charAt(j--) - '0' + A);
            A = S / 2;
            sb.append((char) (S % 2 + '0'));
        }

        if (A != 0) {
            sb.append((char) (A + '0'));
        }

        return sb.reverse().toString();
    }
}
