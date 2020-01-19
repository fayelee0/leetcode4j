package com.pursuetao.fayelee0.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class TestCode66 {
    @Test
    public void plusOne() {
        assertArrayEquals(Code66.plusOne(new int[]{1, 2, 3}), new int[]{1, 2, 4});
        assertArrayEquals(Code66.plusOne(new int[]{4, 3, 2, 1}), new int[]{4, 3, 2, 2});
        assertArrayEquals(Code66.plusOne(new int[]{9, 9}), new int[]{1, 0, 0});
    }
}
