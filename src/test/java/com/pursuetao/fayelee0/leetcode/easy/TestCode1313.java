package com.pursuetao.fayelee0.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class TestCode1313 {
    @Test
    public void decompressRLElist() {
        assertArrayEquals(Code1313.decompressRLElist(new int[]{1,2,3,4}), new int[]{2,4,4,4});
    }
}
