package com.pursuetao.fayelee0.leetcode.array;

import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode.com/problems/jewels-and-stones">LeetCode 771 Jewels and Stones (Easy)</a>
 *
 * You're given strings J representing the types of stones that are jewels, and S representing the stones you have.  Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.
 *
 * The letters in J are guaranteed distinct, and all characters in J and S are letters. Letters are case sensitive, so "a" is considered a different type of stone from "A".
 *
 * Example 1:
 *
 * Input: J = "aA", S = "aAAbbbb"
 * Output: 3
 *
 * Example 2:
 *
 * Input: J = "z", S = "ZZ"
 * Output: 0
 *
 * Note:
 *     S and J will consist of letters and have length at most 50.
 *     The characters in J are distinct.
 */
public class JewelsAndStones {
    public static int numJewelsInStones(String J, String S) {
        Map<Character, Boolean> store = new HashMap<>();
        for (int i = 0; i < J.length(); i++) {
            store.put(J.charAt(i), true);
        }

        int ret = 0;
        for (int i = 0; i < S.length(); i++) {
            if (store.containsKey(S.charAt(i))) {
                ret++;
            }
        }

        return ret;
    }

    public static int numJewelsInStones2(String J, String S) {
        int ret = 0;

        for (int i = 0; i < S.length(); i++) {
            if (J.indexOf(S.charAt(i)) != -1) {
                ret++;
            }
        }

        return ret;
    }
}
