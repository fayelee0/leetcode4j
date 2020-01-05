package com.pursuetao.fayelee0.leetcode.array;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class TestConvertBinaryNumberInALinkedListToInteger {
    @Test
    public void getDecimalValue101() {
        ConvertBinaryNumberInALinkedListToInteger.ListNode node = new ConvertBinaryNumberInALinkedListToInteger.ListNode(1,
                new ConvertBinaryNumberInALinkedListToInteger.ListNode(0,
                        new ConvertBinaryNumberInALinkedListToInteger.ListNode(1)));

        assertThat(ConvertBinaryNumberInALinkedListToInteger.getDecimalValue(node), is(5));
    }

    @Test
    public void getDecimalValue0() {
        ConvertBinaryNumberInALinkedListToInteger.ListNode node = new ConvertBinaryNumberInALinkedListToInteger.ListNode(0);

        assertThat(ConvertBinaryNumberInALinkedListToInteger.getDecimalValue(node), is(0));
    }

    @Test
    public void getDecimalValue1() {
        ConvertBinaryNumberInALinkedListToInteger.ListNode node = new ConvertBinaryNumberInALinkedListToInteger.ListNode(1);

        assertThat(ConvertBinaryNumberInALinkedListToInteger.getDecimalValue(node), is(1));
    }

    @Test
    public void getDecimalValue100100111000000() {
        ConvertBinaryNumberInALinkedListToInteger.ListNode node = new ConvertBinaryNumberInALinkedListToInteger.ListNode(1,
                new ConvertBinaryNumberInALinkedListToInteger.ListNode(0,
                        new ConvertBinaryNumberInALinkedListToInteger.ListNode(0,
                                new ConvertBinaryNumberInALinkedListToInteger.ListNode(1,
                                        new ConvertBinaryNumberInALinkedListToInteger.ListNode(0,
                                                new ConvertBinaryNumberInALinkedListToInteger.ListNode(0,
                                                        new ConvertBinaryNumberInALinkedListToInteger.ListNode(1,
                                                                new ConvertBinaryNumberInALinkedListToInteger.ListNode(1,
                                                                        new ConvertBinaryNumberInALinkedListToInteger.ListNode(1,
                                                                                new ConvertBinaryNumberInALinkedListToInteger.ListNode(0,
                                                                                        new ConvertBinaryNumberInALinkedListToInteger.ListNode(0,
                                                                                                new ConvertBinaryNumberInALinkedListToInteger.ListNode(0,
                                                                                                        new ConvertBinaryNumberInALinkedListToInteger.ListNode(0,
                                                                                                                new ConvertBinaryNumberInALinkedListToInteger.ListNode(0,
                                                                                                                        new ConvertBinaryNumberInALinkedListToInteger.ListNode(0)))))))))))))));

        assertThat(ConvertBinaryNumberInALinkedListToInteger.getDecimalValue(node), is(18880));
    }

    @Test
    public void getDecimalValue00() {
        ConvertBinaryNumberInALinkedListToInteger.ListNode node = new ConvertBinaryNumberInALinkedListToInteger.ListNode(0,
                new ConvertBinaryNumberInALinkedListToInteger.ListNode(0));

        assertThat(ConvertBinaryNumberInALinkedListToInteger.getDecimalValue(node), is(0));
    }
}
