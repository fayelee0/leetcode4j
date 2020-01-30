package com.pursuetao.fayelee0.leetcode.medium;

import com.pursuetao.fayelee0.leetcode.util.ListNode;

public class Code2 {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ret = l1;
        ListNode pre = l1;
        int c = 0;
        while (l1 != null && l2 != null) {
            l1.val += l2.val + c;

            if (l1.val > 9) {
                l1.val -= 10;
                c = 1;
            } else {
                c = 0;
            }

            pre = l1;
            l1 = l1.next;
            l2 = l2.next;
        }

        if (l1 != null) {
            loop(l1, c);
        } else if (l2 != null) {
            pre.next = l2;
            loop(l2, c);
        } else if (c != 0) {
            pre.next = new ListNode(c);
        }

        return ret;
    }

    private static ListNode loop(ListNode l, int c) {
        ListNode p = l;

        while (l != null && c != 0) {
            l.val += c;
            if (l.val > 9) {
                l.val -= 10;
                c = 1;
            } else {
                c = 0;
            }

            p = l;
            l = l.next;
        }

        if (c != 0) {
            p.next = new ListNode(c);
        }

        return p;
    }
}
