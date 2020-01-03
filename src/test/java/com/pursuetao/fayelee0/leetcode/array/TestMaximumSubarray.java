package com.pursuetao.fayelee0.leetcode.array;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class TestMaximumSubarray {

    @Test
    public void maxSubarray() {
        assertThat(MaximumSubarray.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}), is(6));
    }

}
