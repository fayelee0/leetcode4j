package com.pursuetao.fayelee0.leetcode.easy;

import org.junit.Test;

import static org.hamcrest.collection.ArrayMatching.arrayContainingInAnyOrder;
import static org.hamcrest.MatcherAssert.assertThat;

public class TestCode1078 {
    @Test
    public void findOcurrences() {
        assertThat(Code1078.findOcurrences("alice is a good girl she is a good student", "a", "good"), arrayContainingInAnyOrder("girl", "student"));
        assertThat(Code1078.findOcurrences("we will we will rock you", "we", "will"), arrayContainingInAnyOrder("we", "rock"));
    }
}
