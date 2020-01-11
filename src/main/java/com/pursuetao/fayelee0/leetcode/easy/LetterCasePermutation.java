package com.pursuetao.fayelee0.leetcode.easy;

import java.util.*;

/**
 * <a href="https://leetcode.com/problems/letter-case-permutation/">LeetCode 784 Letter Case Permutation (Easy)</a>
 * <p>
 * Given a string S, we can transform every letter individually to be lowercase or uppercase to create another string.  Return a list of all possible strings we could create.
 * <p>
 * Examples:
 * Input: S = "a1b2"
 * Output: ["a1b2", "a1B2", "A1b2", "A1B2"]
 * <p>
 * Input: S = "3z4"
 * Output: ["3z4", "3Z4"]
 * <p>
 * Input: S = "12345"
 * Output: ["12345"]
 * <p>
 * Note:
 * <p>
 * S will be a string with length between 1 and 12.
 * S will consist only of letters or digits.
 */
public class LetterCasePermutation {
    public static List<String> letterCasePermutation(String S) {
        Queue<char[]> queue = new LinkedList<>();
        initQueue(queue, S.charAt(S.length() - 1), S.length());

        for (int i = S.length() - 2; 0 <= i; i--) {
            loopQueue(queue, S.charAt(i), i);
        }

        List<String> ret = new ArrayList<>(queue.size());
        while (!queue.isEmpty()) {
            char[] b = queue.poll();
            ret.add(String.valueOf(b));
        }
        return ret;
    }

    private static void initQueue(Queue<char[]> queue, char c, int len) {
        if (Character.isDigit(c)) {
            initQueueDigit(queue, c, len);
        } else {
            initQueueCharacter(queue, c, len);
        }
    }

    private static void initQueueDigit(Queue<char[]> queue, char c, int len) {
        char[] digit = new char[len];
        digit[len - 1] = c;
        queue.add(digit);
    }

    private static void initQueueCharacter(Queue<char[]> queue, char c, int len) {
        char[] lower = new char[len];
        char[] upper = new char[len];

        lower[len - 1] = Character.toLowerCase(c);
        upper[len - 1] = Character.toUpperCase(c);

        queue.add(lower);
        queue.add(upper);
    }

    private static void loopQueue(Queue<char[]> queue, char c, int pos) {
        if (Character.isDigit(c)) {
            loopQueueDigit(queue, c, pos);
        } else {
            loopQueueCharacter(queue, c, pos);
        }
    }

    private static void loopQueueDigit(Queue<char[]> queue, char c, int p) {
        for (int i = 0, z = queue.size(); i < z; i++) {
            char[] v = queue.poll();
            assert v != null;
            v[p] = c;
            queue.add(v);
        }
    }

    private static void loopQueueCharacter(Queue<char[]> queue, char c, int p) {
        for (int i = 0, z = queue.size(); i < z; i++) {
            char[] v = queue.poll();
            assert v != null;
            v[p] = Character.toUpperCase(c);
            char[] v2 = Arrays.copyOf(v, v.length);
            v2[p] = Character.toLowerCase(c);

            queue.add(v);
            queue.add(v2);
        }
    }

    public static List<String> letterCasePermutation2(String S) {
        List<String> ret = new ArrayList<>();
        letterCasePermutation2inner(ret, S, "", 0);
        return ret;
    }

    private static void letterCasePermutation2inner(List<String> ret, String S, String store, int i) {
        if (store.length() == S.length()) {
            ret.add(store);
        } else {
            char c = S.charAt(i);
            if (Character.isDigit(c)) {
                letterCasePermutation2inner(ret, S, store + c, i + 1);
            } else {
                letterCasePermutation2inner(ret, S, store + Character.toLowerCase(c), i + 1);
                letterCasePermutation2inner(ret, S, store + Character.toUpperCase(c), i + 1);
            }
        }
    }

    public static List<String> letterCasePermutation3(String S) {
        List<char[]> store = new ArrayList<>();
        initStore(store, S.charAt(S.length() - 1), S.length());

        for (int i = S.length() - 2; 0 <= i; i--) {
            char c = S.charAt(i);
            if (Character.isDigit(c)) {
                appendStoreWithDigit(store, c, i);
            } else {
                appendStoreWithLetter(store, c, i);
            }
        }

        List<String> ret = new ArrayList<>();
        store.forEach((v) -> ret.add(String.valueOf(v)));
        return ret;
    }

    private static void appendStoreWithDigit(List<char[]> store, char c, int i) {
        for (char[] chars : store) {
            chars[i] = c;
        }
    }

    private static void appendStoreWithLetter(List<char[]> store, char c, int i) {
        for (int j = 0, z = store.size(); j < z; j++) {
            char[] org = store.get(j);
            org[i] = Character.toUpperCase(c);

            char[] cpy = Arrays.copyOf(org, org.length);
            cpy[i] = Character.toLowerCase(c);
            store.add(cpy);
        }
    }

    private static void initStore(List<char[]> store, char c, int len) {
        if (Character.isDigit(c)) {
            initStoreWithDigit(store, c, len);
        } else {
            initStoreWithLetter(store, c, len);
        }
    }

    private static void initStoreWithDigit(List<char[]> store, char c, int len) {
        char[] v = new char[len];
        v[len - 1] = c;
        store.add(v);
    }

    private static void initStoreWithLetter(List<char[]> store, char c, int len) {
        char[] v0 = new char[len];
        char[] v1 = new char[len];
        v0[len - 1] = Character.toLowerCase(c);
        v1[len - 1] = Character.toUpperCase(c);
        store.add(v0);
        store.add(v1);
    }
}
