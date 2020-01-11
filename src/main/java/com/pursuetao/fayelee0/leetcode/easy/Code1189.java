package com.pursuetao.fayelee0.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode.com/problems/maximum-number-of-balloons/">1189. Maximum Number of Balloons (Easy)</a>
 * <p>
 * Given a string text, you want to use the characters of text to form as many instances of the word "balloon" as possible.
 * <p>
 * You can use each character in text at most once. Return the maximum number of instances that can be formed.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: text = "nlaebolko"
 * Output: 1
 * <p>
 * Example 2:
 * <p>
 * Input: text = "loonbalxballpoon"
 * Output: 2
 * <p>
 * Example 3:
 * <p>
 * Input: text = "leetcode"
 * Output: 0
 * <p>
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= text.length <= 10^4
 * text consists of lower case English letters only.
 */
public class Code1189 {
    public static int maxNumberOfBalloons(String text) {
        Map<Character, Integer> store = new HashMap<>();
        store.put('b', 0);
        store.put('a', 0);
        store.put('l', 0);
        store.put('o', 0);
        store.put('n', 0);

        for (int i = 0; i < text.length(); i++) {
            if (store.containsKey(text.charAt(i))) {
                store.put(text.charAt(i), store.get(text.charAt(i)) + 1);
            }
        }

        int ret = 10000;
        for (Map.Entry<Character, Integer> entry : store.entrySet()) {
            int value = entry.getValue();
            if (entry.getKey().charValue() == 'l' || entry.getKey().charValue() == 'o') {
                value /= 2;
            }
            if (value < ret) {
                ret = value;
            }
        }
        return ret;
    }

    // balloon
    public static int maxNumberOfBalloons2(String text) {
        if (text.length() < 7) {
            return 0;
        }

        char[] store = new char[26];
        for (char c : text.toCharArray()) {
            store[c - 'a']++;
        }

        int ret;
        ret = Math.min(store[0], store['b' - 'a']); // a, b
        ret = Math.min(ret, store['l' - 'a'] / 2);
        ret = Math.min(ret, store['n' - 'a']);
        ret = Math.min(ret, store['o' - 'a'] / 2);
        return ret;
    }
}
