package com.pursuetao.fayelee0.leetcode.easy;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class TestCode169 {
    @Test
    public void majorityElement() {
        assertThat(Code169.majorityElement(new int[]{3, 2, 3}), is(3));
        assertThat(Code169.majorityElement(new int[]{2,2,1,1,1,2,2}), is(2));
    }

    @Test
    public void majorityElement2() {
        assertThat(Code169.majorityElement2(new int[]{3, 2, 3}), is(3));
        assertThat(Code169.majorityElement2(new int[]{2,2,1,1,1,2,2}), is(2));
    }

    @Test
    public void majorityElement3() {
        assertThat(Code169.majorityElement3(new int[]{3, 2, 3}), is(3));
        assertThat(Code169.majorityElement3(new int[]{2,2,1,1,1,2,2}), is(2));
    }

    @Test
    public void majorityElement4() {
        assertThat(Code169.majorityElement4(new int[]{3, 2, 3}), is(3));
        assertThat(Code169.majorityElement4(new int[]{2,2,1,1,1,2,2}), is(2));
    }
}
