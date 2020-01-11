package com.pursuetao.fayelee0.leetcode.easy;

/**
 * <a href="https://leetcode.com/problems/to-lower-case/">709. To Lower Case (Easy)</a>
 *
 * Implement function ToLowerCase() that has a string parameter str, and returns the same string in lowercase.
 *
 *
 *
 * Example 1:
 *
 * Input: "Hello"
 * Output: "hello"
 *
 * Example 2:
 *
 * Input: "here"
 * Output: "here"
 *
 * Example 3:
 *
 * Input: "LOVELY"
 * Output: "lovely"
 *
 */
public class Code709 {
    public static String toLowerCase(String str) {
        return str.toLowerCase();
    }

    public static String toLowerCase2(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if ('A' <= c && c <= 'Z') {
                sb.append((char) ('a' + c - 'A'));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
