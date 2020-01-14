package com.pursuetao.fayelee0.leetcode.easy;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class TestCode69 {
    @Test
    public void mySqrt() {
        assertThat(Code69.mySqrt(4), is(2));
        assertThat(Code69.mySqrt(8), is(2));
    }
}
