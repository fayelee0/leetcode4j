package com.pursuetao.fayelee0.leetcode.easy;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class TestCode20 {
    @Test
    public void isValid() {
        assertThat(Code20.isValid("()"), is(true));
        assertThat(Code20.isValid("()[]{}"), is(true));
        assertThat(Code20.isValid("(]"), is(false));
        assertThat(Code20.isValid("([)]"), is(false));
        assertThat(Code20.isValid("{[]}"), is(true));
    }
}
