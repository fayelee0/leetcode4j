package com.pursuetao.fayelee0.leetcode.easy;

// 9. Palindrome Number
// https://leetcode.com/problems/palindrome-number/
public class Code9 {
    public static boolean isPalindrome(int x) {
        String str = Integer.toString(x);
        return new StringBuilder(str).reverse().toString().equals(str);
    }

    public static boolean isPalindrome2(int x) {
        if (x < 0) {
            return false;
        } else if (x == 0) {
            return true;
        } else {
            char[] cc = Integer.toString(x).toCharArray();
            for (int i = 0, j = cc.length - 1; i < j; i++, j--) {
                if (cc[i] != cc[j]) {
                    return false;
                }
            }
            return true;
        }
    }
}
