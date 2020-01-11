package com.pursuetao.fayelee0.leetcode.easy;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class TestCode1295 {

    @Test
    public void findNumbers() {
        assertThat(Code1295.findNumbers(new int[]{12, 345, 2, 6, 7896}), is(2));
        assertThat(Code1295.findNumbers(new int[]{555, 901, 482, 1771}), is(1));
    }

}
