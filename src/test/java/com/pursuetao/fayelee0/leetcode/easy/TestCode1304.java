package com.pursuetao.fayelee0.leetcode.easy;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class TestCode1304 {
    @Test
    public void sumZeroWith1() {
        int[] ret = Code1304.sumZero(1);

        assertThat(ret.length, is(1));
        assertThat(Arrays.stream(ret).sum(), is(0));
    }

    @Test
    public void sumZeroWith4() {
        int[] ret = Code1304.sumZero(4);

        assertThat(ret.length, is(4));
        assertThat(Arrays.stream(ret).sum(), is(0));
    }
}
