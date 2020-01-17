package com.pursuetao.fayelee0.leetcode.easy;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class TestCode1309 {
    @Test
    public void freqAlphabets() {
        assertThat(Code1309.freqAlphabets("10#11#12"), is("jkab"));
        assertThat(Code1309.freqAlphabets("1326#"), is("acz"));
        assertThat(Code1309.freqAlphabets("25#"), is("y"));
        assertThat(Code1309.freqAlphabets("12345678910#11#12#13#14#15#16#17#18#19#20#21#22#23#24#25#26#"), is("abcdefghijklmnopqrstuvwxyz"));
    }
}
