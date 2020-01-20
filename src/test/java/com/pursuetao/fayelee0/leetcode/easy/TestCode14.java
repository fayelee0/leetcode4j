package com.pursuetao.fayelee0.leetcode.easy;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class TestCode14 {
    @Test
    public void longestCommonPrefix() {
        assertThat(Code14.longestCommonPrefix(new String[]{"flower", "flow", "flight"}), is("fl"));
        assertThat(Code14.longestCommonPrefix(new String[]{"dog", "racecar", "car"}), is(""));
    }
}
