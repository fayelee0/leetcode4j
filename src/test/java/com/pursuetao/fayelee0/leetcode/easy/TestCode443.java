package com.pursuetao.fayelee0.leetcode.easy;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class TestCode443 {
    @Test
    public void compress() {
        assertThat(Code443.compress(new char[]{'a', 'a', 'b', 'b', 'c', 'c', 'c'}), is(6));
        assertThat(Code443.compress(new char[]{'a'}), is(1));
        assertThat(Code443.compress(new char[]{'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'}), is(4));
    }
}
