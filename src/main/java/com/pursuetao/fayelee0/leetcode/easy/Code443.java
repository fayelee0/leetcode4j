package com.pursuetao.fayelee0.leetcode.easy;

// 443. String Compression
// https://leetcode.com/problems/string-compression/
public class Code443 {
    public static int compress(char[] chars) {
        int N = chars.length;

        if (N == 1) {
            return 1;
        }

        int i = 1, j = 0, k = 0;
        char c = chars[j];
        while (i < N) {
            if (chars[i] != c) {
                k += insert(chars, i - j, k);
                chars[++k] = chars[i];
                j = i;
                c = chars[i];
            }

            i++;
        }

        k += insert(chars, i - j, k);
        return k + 1;
    }

    private static int insert(char[] chars, int v, int k) {
        int ret = 0;
        if (v > 1) {
            if (v < 10) {
                chars[k + 1] = (char) (v + '0');
                ret = 1;
            } else if (v < 100) {
                chars[k + 2] = (char) (v % 10 + '0');
                v /= 10;
                chars[k + 1] = (char) (v + '0');
                ret = 2;
            } else if (v < 1000) {
                chars[k + 3] = (char) (v % 10 + '0');
                v /= 10;
                chars[k + 2] = (char) (v % 10 + '0');
                v /= 10;
                chars[k + 1] = (char) (v + '0');
                ret = 3;
            } else {
                chars[k + 4] = '0';
                chars[k + 3] = '0';
                chars[k + 2] = '0';
                chars[k + 1] = '1';
                ret = 4;
            }
        }
        return ret;
    }
}
