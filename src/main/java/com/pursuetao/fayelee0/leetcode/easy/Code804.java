package com.pursuetao.fayelee0.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

// 804. Unique Morse Code Words
// https://leetcode.com/problems/unique-morse-code-words/
public class Code804 {
    public static int uniqueMorseRepresentations(String[] words) {
        String[] mapping = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> set = new HashSet<>();
        StringBuilder sb;
        for (String word : words) {
            sb = new StringBuilder();
            for (char c : word.toCharArray()) {
                sb.append(mapping[c - 'a']);
            }
            set.add(sb.toString());
        }
        return set.size();
    }
}
