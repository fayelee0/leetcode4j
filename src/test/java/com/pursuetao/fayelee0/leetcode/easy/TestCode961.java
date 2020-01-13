package com.pursuetao.fayelee0.leetcode.easy;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class TestCode961 {
    @Test
    public void repeatedNTimes() {
        assertThat(Code961.repeatedNTimes(new int[]{1,2,3,3}), is(3));
        assertThat(Code961.repeatedNTimes(new int[]{2,1,2,5,3,2}), is(2));
        assertThat(Code961.repeatedNTimes(new int[]{5,1,5,2,5,3,5,4}), is(5));
    }

    @Test
    public void repeatedNTimes2() {
        assertThat(Code961.repeatedNTimes2(new int[]{1,2,3,3}), is(3));
        assertThat(Code961.repeatedNTimes2(new int[]{2,1,2,5,3,2}), is(2));
        assertThat(Code961.repeatedNTimes2(new int[]{5,1,5,2,5,3,5,4}), is(5));
    }
}
