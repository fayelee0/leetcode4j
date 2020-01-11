package com.pursuetao.fayelee0.leetcode.easy;

/**
 * <a href="https://leetcode.com/problems/valid-palindrome/">LeetCode 125. Valid Palindrome (Easy)</a>
 *
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
 *
 * Note: For the purpose of this problem, we define empty string as valid palindrome.
 *
 * Example 1:
 *
 * Input: "A man, a plan, a canal: Panama"
 * Output: true
 *
 * Example 2:
 *
 * Input: "race a car"
 * Output: false
 */
public class Code125 {
    // Time     O(n)
    // Space    O(1)
    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        for (int i = 0, j = s.length() - 1; i < j;) {
            char ci = s.charAt(i);

            if (!Character.isLetterOrDigit(ci)) {
                i++;
            } else {
                char cj = s.charAt(j);
                if (!Character.isLetterOrDigit(cj)) {
                    j--;
                } else {
                    if (ci != cj) {
                        return false;
                    } else {
                        i++;
                        j--;
                    }
                }
            }
        }
        return true;
    }

    public static boolean isPalindrome2(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                sb.append(Character.toLowerCase(c));
            }
        }
        return sb.toString().equals(sb.reverse().toString());
    }
}
