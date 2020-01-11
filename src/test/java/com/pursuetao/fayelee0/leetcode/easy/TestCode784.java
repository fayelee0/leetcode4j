package com.pursuetao.fayelee0.leetcode.easy;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;

public class TestCode784 {
    @Test
    public void letterCasePermutation() {
        assertThat(Code784.letterCasePermutation("a1b2"),
                containsInAnyOrder(Arrays.asList("a1b2", "a1B2", "A1b2", "A1B2").toArray()));
    }

    @Test
    public void letterCasePermutation2() {
        assertThat(Code784.letterCasePermutation2("a1b2"),
                containsInAnyOrder(Arrays.asList("a1b2", "a1B2", "A1b2", "A1B2").toArray()));
    }

    @Test
    public void letterCasePermutation3() {
        assertThat(Code784.letterCasePermutation3("a1b2"),
                containsInAnyOrder(Arrays.asList("a1b2", "a1B2", "A1b2", "A1B2").toArray()));

        assertThat(Code784.letterCasePermutation3("C"),
                containsInAnyOrder(Arrays.asList("c", "C").toArray()));
    }
}
