package com.pursuetao.fayelee0.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class TestCode88 {
    @Test
    public void merge() {
        int[] data0 = new int[]{1, 2, 3, 0, 0, 0};
        Code88.merge(data0, 3, new int[]{2, 5, 6}, 3);
        assertArrayEquals(data0, new int[]{1, 2, 2, 3, 5, 6});

        int[] data1 = new int[]{0};
        Code88.merge(data1, 0, new int[]{1}, 1);
        assertArrayEquals(data1, new int[]{1});
    }
}
