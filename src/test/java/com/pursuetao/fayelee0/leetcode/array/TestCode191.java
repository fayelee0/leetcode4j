package com.pursuetao.fayelee0.leetcode.array;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class TestCode191 {
    @Test
    public void hammingWeight() {
        assertThat(Code191.hammingWeight(0b00000000000000000000000000001011), is(3));
        assertThat(Code191.hammingWeight(0b00000000000000000000000010000000), is(1));
        assertThat(Code191.hammingWeight(0b11111111111111111111111111111101), is(31));
    }
}
