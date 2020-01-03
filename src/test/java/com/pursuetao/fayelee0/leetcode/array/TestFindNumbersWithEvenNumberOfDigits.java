package com.pursuetao.fayelee0.leetcode.array;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class TestFindNumbersWithEvenNumberOfDigits {

    @Test
    public void findNumbers() {
        assertThat(FindNumbersWithEvenNumberOfDigits.findNumbers(new int[]{12, 345, 2, 6, 7896}), is(2));
        assertThat(FindNumbersWithEvenNumberOfDigits.findNumbers(new int[]{555, 901, 482, 1771}), is(1));
    }

}
