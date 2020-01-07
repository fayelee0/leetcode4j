package com.pursuetao.fayelee0.leetcode.array;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;

public class TestLetterCasePermutation {
    @Test
    public void letterCasePermutation() {
        assertThat(LetterCasePermutation.letterCasePermutation("a1b2"),
                containsInAnyOrder(Arrays.asList("a1b2", "a1B2", "A1b2", "A1B2").toArray()));
    }

    @Test
    public void letterCasePermutation2() {
        assertThat(LetterCasePermutation.letterCasePermutation2("a1b2"),
                containsInAnyOrder(Arrays.asList("a1b2", "a1B2", "A1b2", "A1B2").toArray()));
    }

    @Test
    public void letterCasePermutation3() {
        assertThat(LetterCasePermutation.letterCasePermutation3("a1b2"),
                containsInAnyOrder(Arrays.asList("a1b2", "a1B2", "A1b2", "A1B2").toArray()));

        assertThat(LetterCasePermutation.letterCasePermutation3("C"),
                containsInAnyOrder(Arrays.asList("c", "C").toArray()));
    }
}
