package com.pursuetao.fayelee0.leetcode.easy;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class TestCode709 {
    @Test
    public void toLowerCase() {
        assertThat(Code709.toLowerCase("Hello"), is("hello"));
        assertThat(Code709.toLowerCase("hello"), is("hello"));
        assertThat(Code709.toLowerCase("LOVELY"), is("lovely"));
    }

    @Test
    public void toLowerCase2() {
        assertThat(Code709.toLowerCase2("Hello"), is("hello"));
        assertThat(Code709.toLowerCase2("hello"), is("hello"));
        assertThat(Code709.toLowerCase2("LOVELY"), is("lovely"));
    }
}
