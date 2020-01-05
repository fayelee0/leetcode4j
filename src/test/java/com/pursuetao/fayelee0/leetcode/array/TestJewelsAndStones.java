package com.pursuetao.fayelee0.leetcode.array;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class TestJewelsAndStones {
    @Test
    public void numJewelsInStones() {
        assertThat(JewelsAndStones.numJewelsInStones("aA", "aAAbbbb"), is(3));
        assertThat(JewelsAndStones.numJewelsInStones("z", "ZZ"), is(0));
    }

    @Test
    public void numJewelsInStones2() {
        assertThat(JewelsAndStones.numJewelsInStones2("aA", "aAAbbbb"), is(3));
        assertThat(JewelsAndStones.numJewelsInStones2("z", "ZZ"), is(0));
    }
}
