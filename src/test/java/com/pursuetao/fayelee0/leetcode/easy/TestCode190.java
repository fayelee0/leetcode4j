package com.pursuetao.fayelee0.leetcode.easy;

import com.pursuetao.fayelee0.leetcode.easy.Code190;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class TestCode190 {
    @Test
    public void reverseBits() {
        assertThat(Code190.reverseBits(0b00000010100101000001111010011100), is(0b00111001011110000010100101000000));
        assertThat(Code190.reverseBits(0b11111111111111111111111111111101), is(0b10111111111111111111111111111111));
    }
}
