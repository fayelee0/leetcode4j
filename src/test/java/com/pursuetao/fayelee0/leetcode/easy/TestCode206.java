package com.pursuetao.fayelee0.leetcode.easy;

import com.pursuetao.fayelee0.leetcode.util.ListNode;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class TestCode206 {
    @Test
    public void reverseList() {
        ListNode node = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        assertThat(Code206.reverseList(node).toString(), is("5 4 3 2 1"));
    }

    @Test
    public void reverseList2() {
        ListNode node = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        assertThat(Code206.reverseList2(node).toString(), is("5 4 3 2 1"));
    }
}
