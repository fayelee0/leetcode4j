package com.pursuetao.fayelee0.leetcode.easy;

import com.pursuetao.fayelee0.leetcode.util.ListNode;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class TestCode141 {
    @Test
    public void hasCycle() {
        ListNode n3 = new ListNode(-4);
        ListNode n2 = new ListNode(0, n3);
        ListNode n1 = new ListNode(2, n2);
        ListNode n0 = new ListNode(3, n1);

        n3.next = n1;

        assertThat(Code141.hasCycle(n0), is(true));
    }
}
