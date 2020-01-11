package com.pursuetao.fayelee0.leetcode.easy;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class TestCode771 {
    @Test
    public void numJewelsInStones() {
        assertThat(Code771.numJewelsInStones("aA", "aAAbbbb"), is(3));
        assertThat(Code771.numJewelsInStones("z", "ZZ"), is(0));
    }

    @Test
    public void numJewelsInStones2() {
        assertThat(Code771.numJewelsInStones2("aA", "aAAbbbb"), is(3));
        assertThat(Code771.numJewelsInStones2("z", "ZZ"), is(0));
    }
}
