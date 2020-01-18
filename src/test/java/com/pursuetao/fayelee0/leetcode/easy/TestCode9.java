package com.pursuetao.fayelee0.leetcode.easy;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class TestCode9 {
    @Test
    public void isPalindrome() {
        assertThat(Code9.isPalindrome(121), is(true));
        assertThat(Code9.isPalindrome(-121), is(false));
        assertThat(Code9.isPalindrome(10), is(false));
    }

    @Test
    public void isPalindrome2() {
        assertThat(Code9.isPalindrome2(121), is(true));
        assertThat(Code9.isPalindrome2(-121), is(false));
        assertThat(Code9.isPalindrome2(10), is(false));
    }
}
