package com.pursuetao.fayelee0.leetcode.easy;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class TestCode804 {
    @Test
    public void uniqueMorseRepresentations() {
        assertThat(Code804.uniqueMorseRepresentations(new String[]{"gin", "zen", "gig", "msg"}), is(2));
    }
}
