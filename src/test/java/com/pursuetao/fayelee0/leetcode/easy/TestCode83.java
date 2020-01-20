package com.pursuetao.fayelee0.leetcode.easy;

import com.pursuetao.fayelee0.leetcode.util.ListNode;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class TestCode83 {
    @Test
    public void deleteDuplicates() {
        ListNode n1 = new ListNode(1, new ListNode(1, new ListNode(2)));
        assertThat(Code83.deleteDuplicates(n1).toString(), is(new ListNode(1, new ListNode(2)).toString()));
    }
}
