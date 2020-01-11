package com.pursuetao.fayelee0.leetcode.easy;

import com.pursuetao.fayelee0.leetcode.easy.Code762;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class TestCode762 {
    @Test
    public void countPrimeSetBits() {
        assertThat(Code762.countPrimeSetBits(6, 10), is(4));
        assertThat(Code762.countPrimeSetBits(10, 15), is(5));
    }

    @Test
    public void prime() {
        assertThat(Code762.prime(1), is(false));
        assertThat(Code762.prime(2), is(true));
        assertThat(Code762.prime(3), is(true));
        assertThat(Code762.prime(4), is(false));
        assertThat(Code762.prime(5), is(true));
        assertThat(Code762.prime(6), is(false));
        assertThat(Code762.prime(7), is(true));
        assertThat(Code762.prime(8), is(false));
        assertThat(Code762.prime(9), is(false));
        assertThat(Code762.prime(10), is(false));
        assertThat(Code762.prime(11), is(true));
        assertThat(Code762.prime(12), is(false));
        assertThat(Code762.prime(13), is(true));
        assertThat(Code762.prime(14), is(false));
        assertThat(Code762.prime(15), is(false));
        assertThat(Code762.prime(16), is(false));
        assertThat(Code762.prime(17), is(true));
        assertThat(Code762.prime(18), is(false));
        assertThat(Code762.prime(19), is(true));
        assertThat(Code762.prime(20), is(false));
    }

    @Test
    public void bits() {
        assertThat(Code762.bits(1), is(1));
        assertThat(Code762.bits(Integer.MAX_VALUE), is(31));
        assertThat(Code762.bits(Integer.MIN_VALUE), is(1));
    }
}
