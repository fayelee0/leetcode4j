package com.pursuetao.fayelee0.leetcode.easy;

import com.pursuetao.fayelee0.leetcode.util.ListNode;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class TestCode21 {
    @Test
    public void mergeTwoLists() {
        assertThat(Code21.mergeTwoLists(new ListNode(1, new ListNode(2, new ListNode(4))),
                new ListNode(1, new ListNode(3, new ListNode(4)))).toString(), is("1 1 2 3 4 4"));
    }

    @Test
    public void mergeTwoLists2() {
        assertThat(Code21.mergeTwoLists2(new ListNode(1, new ListNode(2, new ListNode(4))),
                new ListNode(1, new ListNode(3, new ListNode(4)))).toString(), is("1 1 2 3 4 4"));
    }
}
