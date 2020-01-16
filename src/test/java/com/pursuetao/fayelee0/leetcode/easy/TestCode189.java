package com.pursuetao.fayelee0.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class TestCode189 {
    @Test
    public void rotate() {
        int[] x = new int[]{1, 2, 3, 4, 5, 6, 7};
        Code189.rotate(x, 3);
        assertArrayEquals(x, new int[]{5, 6, 7, 1, 2, 3, 4});

        int[] y = new int[]{-1, -100, 3, 99};
        Code189.rotate(y, 2);
        assertArrayEquals(y, new int[]{3, 99, -1, -100});

        int[] z = new int[]{-1};
        Code189.rotate(z, 2);
        assertArrayEquals(z, z);
    }

    @Test
    public void rotate2() {
        int[] x = new int[]{1, 2, 3, 4, 5, 6, 7};
        Code189.rotate2(x, 3);
        assertArrayEquals(x, new int[]{5, 6, 7, 1, 2, 3, 4});

        int[] y = new int[]{-1, -100, 3, 99};
        Code189.rotate2(y, 2);
        assertArrayEquals(y, new int[]{3, 99, -1, -100});

        int[] z = new int[]{-1};
        Code189.rotate2(z, 2);
        assertArrayEquals(z, z);
    }
}
