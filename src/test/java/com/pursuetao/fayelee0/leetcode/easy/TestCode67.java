package com.pursuetao.fayelee0.leetcode.easy;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class TestCode67 {
    @Test
    public void addBinary() {
        assertThat(Code67.addBinary("11", "1"), is("100"));
        assertThat(Code67.addBinary("1010", "1011"), is("10101"));
        assertThat(Code67.addBinary("10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101",
                "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011"), is("110111101100010011000101110110100000011101000101011001000011011000001100011110011010010011000000000"));
    }
}
