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

    public static ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
        int c = 0;
        int s = 0;
        ListNode ret = new ListNode(0);
        ListNode ptr = ret;
        while (l1 != null || l2 != null) {
            s = c;
            if (l1 != null) {
                s += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                s += l2.val;
                l2 = l2.next;
            }
            if (s > 9) {
                ptr.next = new ListNode(s - 10);
                c = 1;
            } else {
                ptr.next = new ListNode(s);
                c = 0;
            }
            ptr = ptr.next;
        }
        if (c != 0) {
            ptr.next = new ListNode(c);
        }
        return ret.next;
    }

    public static ListNode addTwoNumbers3(ListNode l1, ListNode l2) {
        return addTwoNumbers33(l1, l2, 0);
    }

    private static ListNode addTwoNumbers33(ListNode l1, ListNode l2, int carry) {
        if (l1 == null && l2 == null) {
            return (carry == 0) ? null : new ListNode(carry);
        }

        int s = carry;
        if (l1 != null) {
            s += l1.val;
            l1 = l1.next;
        }

        if (l2 != null) {
            s += l2.val;
            l2 = l2.next;
        }

        carry = s / 10;
        ListNode ret = new ListNode(s % 10);
        ret.next = addTwoNumbers33(l1, l2, carry);
        return ret;
    }
}
