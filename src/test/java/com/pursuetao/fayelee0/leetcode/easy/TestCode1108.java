package com.pursuetao.fayelee0.leetcode.easy;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class TestCode1108 {

    @Test
    public void defangIPAddr() {
        assertThat(Code1108.defangIPAddr("1.1.1.1"), is("1[.]1[.]1[.]1"));
    }

    @Test
    public void defangIPAddr2() {
        assertThat(Code1108.defangIPAddr2("1.1.1.1"), is("1[.]1[.]1[.]1"));
    }

    @Test
    public void defangIPAddr3() {
        assertThat(Code1108.defangIPAddr3("1.1.1.1"), is("1[.]1[.]1[.]1"));
    }

}
