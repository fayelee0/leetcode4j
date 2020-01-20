package com.pursuetao.fayelee0.leetcode.easy;

import java.util.Stack;

// 20. Valid Parentheses
// https://leetcode.com/problems/valid-parentheses/
public class Code20 {
    public static boolean isValid(String s) {
        if (s.length() == 0) {
            return true;
        } else if (s.length() == 1) {
            return false;
        } else {
            Stack<Character> stack = new Stack<>();
            for (char c : s.toCharArray()) {
                if (c == '(' || c == '[' || c == '{') {
                    stack.push(c);
                } else {
                    char x = (c == ')') ? '(' : (c == ']') ? '[' : '{';
                    if (!check(stack, x)) {
                        return false;
                    }
                }
            }
            return stack.isEmpty();
        }
    }

    private static boolean check(Stack<Character> stack, char c) {
        if (stack.isEmpty()) {
            return false;
        } else {
            return stack.pop().charValue() == c;
        }
    }
}
