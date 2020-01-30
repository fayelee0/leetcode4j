package com.pursuetao.fayelee0.leetcode.medium;

import com.pursuetao.fayelee0.leetcode.util.ListNode;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class TestCode2 {
    @Test
    public void addTwoNumbers() {
        assertThat(
                Code2.addTwoNumbers(
                        new ListNode(2, new ListNode(4, new ListNode(3))),
                        new ListNode(5, new ListNode(6, new ListNode(4)))).toString(),
                is("7 0 8"));

        assertThat(Code2.addTwoNumbers(new ListNode(5), new ListNode(5)).toString(), is("0 1"));

        assertThat(Code2.addTwoNumbers(new ListNode(9, new ListNode(8)), new ListNode(1)).toString(), is("0 9"));

        assertThat(Code2.addTwoNumbers(new ListNode(1), new ListNode(9, new ListNode(9))).toString(), is("0 0 1"));
    }

    @Test
    public void addTwoNumbers2() {
        assertThat(
                Code2.addTwoNumbers2(
                        new ListNode(2, new ListNode(4, new ListNode(3))),
                        new ListNode(5, new ListNode(6, new ListNode(4)))).toString(),
                is("7 0 8"));

        assertThat(Code2.addTwoNumbers2(new ListNode(5), new ListNode(5)).toString(), is("0 1"));

        assertThat(Code2.addTwoNumbers2(new ListNode(9, new ListNode(8)), new ListNode(1)).toString(), is("0 9"));

        assertThat(Code2.addTwoNumbers2(new ListNode(1), new ListNode(9, new ListNode(9))).toString(), is("0 0 1"));

        assertThat(Code2.addTwoNumbers2(new ListNode(1, new ListNode(8)), new ListNode(0)).toString(), is("1 8"));
    }

    @Test
    public void addTwoNumbers3() {
        assertThat(
                Code2.addTwoNumbers3(
                        new ListNode(2, new ListNode(4, new ListNode(3))),
                        new ListNode(5, new ListNode(6, new ListNode(4)))).toString(),
                is("7 0 8"));

        assertThat(Code2.addTwoNumbers3(new ListNode(5), new ListNode(5)).toString(), is("0 1"));

        assertThat(Code2.addTwoNumbers3(new ListNode(9, new ListNode(8)), new ListNode(1)).toString(), is("0 9"));

        assertThat(Code2.addTwoNumbers3(new ListNode(1), new ListNode(9, new ListNode(9))).toString(), is("0 0 1"));

        assertThat(Code2.addTwoNumbers3(new ListNode(1, new ListNode(8)), new ListNode(0)).toString(), is("1 8"));
    }
}
