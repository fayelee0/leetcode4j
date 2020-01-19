package com.pursuetao.fayelee0.leetcode.easy;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class TestCode7 {
    @Test
    public void reverse() {
        assertThat(Code7.reverse(123), is(321));
        assertThat(Code7.reverse(-123), is(-321));
        assertThat(Code7.reverse(120), is(21));
        assertThat(Code7.reverse(1056389759), is(0));
    }
}
