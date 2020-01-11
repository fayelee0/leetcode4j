package com.pursuetao.fayelee0.leetcode.easy;

import com.pursuetao.fayelee0.leetcode.easy.SubtractTheProductAndSumOfDigitsOfAnInteger;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class TestSubtractTheProductAndSumOfDigitsOfAnInteger {

    @Test
    public void subtractProductAndSum() {
        assertThat(SubtractTheProductAndSumOfDigitsOfAnInteger.subtractProductAndSum(234), is(15));

        assertThat(SubtractTheProductAndSumOfDigitsOfAnInteger.subtractProductAndSum(4421), is(21));
    }

}
