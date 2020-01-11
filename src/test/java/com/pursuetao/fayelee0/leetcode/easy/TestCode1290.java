package com.pursuetao.fayelee0.leetcode.easy;

import com.pursuetao.fayelee0.leetcode.util.ListNode;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class TestCode1290 {
    @Test
    public void getDecimalValue101() {
        ListNode node = new ListNode(1, new ListNode(0, new ListNode(1)));
        assertThat(Code1290.getDecimalValue(node), is(5));
    }

    @Test
    public void getDecimalValue0() {
        ListNode node = new ListNode(0);
        assertThat(Code1290.getDecimalValue(node), is(0));
    }

    @Test
    public void getDecimalValue1() {
        ListNode node = new ListNode(1);
        assertThat(Code1290.getDecimalValue(node), is(1));
    }

    @Test
    public void getDecimalValue100100111000000() {
        ListNode node = new ListNode(1,
                new ListNode(0,
                        new ListNode(0,
                                new ListNode(1,
                                        new ListNode(0,
                                                new ListNode(0,
                                                        new ListNode(1,
                                                                new ListNode(1,
                                                                        new ListNode(1,
                                                                                new ListNode(0,
                                                                                        new ListNode(0,
                                                                                                new ListNode(0,
                                                                                                        new ListNode(0,
                                                                                                                new ListNode(0,
                                                                                                                        new ListNode(0)))))))))))))));

        assertThat(Code1290.getDecimalValue(node), is(18880));
    }

    @Test
    public void getDecimalValue00() {
        ListNode node = new ListNode(0, new ListNode(0));
        assertThat(Code1290.getDecimalValue(node), is(0));
    }
}
