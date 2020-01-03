package com.pursuetao.fayelee0.leetcode.array;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class TestDefangingAnIPAddress {

    @Test
    public void defangIPAddr() {
        assertThat(DefangingAnIPAddress.defangIPAddr("1.1.1.1"), is("1[.]1[.]1[.]1"));
    }

    @Test
    public void defangIPAddr2() {
        assertThat(DefangingAnIPAddress.defangIPAddr2("1.1.1.1"), is("1[.]1[.]1[.]1"));
    }

    @Test
    public void defangIPAddr3() {
        assertThat(DefangingAnIPAddress.defangIPAddr3("1.1.1.1"), is("1[.]1[.]1[.]1"));
    }

}
