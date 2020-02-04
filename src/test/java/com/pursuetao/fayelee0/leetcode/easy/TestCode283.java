package com.pursuetao.fayelee0.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class TestCode283 {
    @Test
    public void moveZeroes() {
        int[] data = new int[]{0, 1, 0, 3, 12};
        Code283.moveZeroes(data);
        assertArrayEquals(data, new int[]{1, 3, 12, 0, 0});
    }

    @Test
    public void moveZeroes2() {
        int[] data = new int[]{0, 1, 0, 3, 12};
        Code283.moveZeroes2(data);
        assertArrayEquals(data, new int[]{1, 3, 12, 0, 0});
    }
}
