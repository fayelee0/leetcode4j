package com.pursuetao.fayelee0.leetcode.easy;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class TestCode1281 {

    @Test
    public void subtractProductAndSum() {
        assertThat(Code1281.subtractProductAndSum(234), is(15));

        assertThat(Code1281.subtractProductAndSum(4421), is(21));
    }

}
