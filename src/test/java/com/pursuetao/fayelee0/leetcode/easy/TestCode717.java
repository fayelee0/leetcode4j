package com.pursuetao.fayelee0.leetcode.easy;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class TestCode717 {
    @Test
    public void isOneBitCharacter() {
        assertThat(Code717.isOneBitCharacter(new int[]{1, 0, 0}), is(true));
        assertThat(Code717.isOneBitCharacter(new int[]{1, 1, 1, 0}), is(false));
    }
}
