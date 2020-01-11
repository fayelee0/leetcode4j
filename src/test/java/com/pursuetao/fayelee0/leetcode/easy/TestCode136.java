package com.pursuetao.fayelee0.leetcode.easy;

import com.pursuetao.fayelee0.leetcode.easy.Code136;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class TestCode136 {
    @Test
    public void singleNumber0() {
        assertThat(Code136.singleNumber0(new int[]{2, 2, 1}), is(1));
        assertThat(Code136.singleNumber0(new int[]{4, 1, 2, 1, 2}), is(4));
    }

    @Test
    public void singleNumber1() {
        assertThat(Code136.singleNumber1(new int[]{2, 2, 1}), is(1));
        assertThat(Code136.singleNumber1(new int[]{4, 1, 2, 1, 2}), is(4));
    }

    @Test
    public void singleNumber2() {
        assertThat(Code136.singleNumber2(new int[]{2, 2, 1}), is(1));
        assertThat(Code136.singleNumber2(new int[]{4, 1, 2, 1, 2}), is(4));
    }
}
