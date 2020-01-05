package com.pursuetao.fayelee0.leetcode.array;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class TestToLowerCase {
    @Test
    public void toLowerCase() {
        assertThat(ToLowerCase.toLowerCase("Hello"), is("hello"));
        assertThat(ToLowerCase.toLowerCase("hello"), is("hello"));
        assertThat(ToLowerCase.toLowerCase("LOVELY"), is("lovely"));
    }

    @Test
    public void toLowerCase2() {
        assertThat(ToLowerCase.toLowerCase2("Hello"), is("hello"));
        assertThat(ToLowerCase.toLowerCase2("hello"), is("hello"));
        assertThat(ToLowerCase.toLowerCase2("LOVELY"), is("lovely"));
    }
}
