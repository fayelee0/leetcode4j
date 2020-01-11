package com.pursuetao.fayelee0.leetcode.easy;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class TestCode53 {

    @Test
    public void maxSubarray() {
        assertThat(Code53.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}), is(6));
    }

}
