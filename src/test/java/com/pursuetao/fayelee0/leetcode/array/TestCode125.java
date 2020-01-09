package com.pursuetao.fayelee0.leetcode.array;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class TestCode125 {
    @Test
    public void isPalindrome() {
        assertThat(Code125.isPalindrome("A man, a plan, a canal: Panama"), is(true));
        assertThat(Code125.isPalindrome("race a car"), is(false));
    }
}
