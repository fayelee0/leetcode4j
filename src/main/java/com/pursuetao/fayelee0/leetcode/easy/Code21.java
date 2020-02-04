package com.pursuetao.fayelee0.leetcode.easy;

import com.pursuetao.fayelee0.leetcode.util.ListNode;

// 21. Merge Two Sorted Lists
// https://leetcode.com/problems/merge-two-sorted-lists/
public class Code21 {
    // 在两个链表相同长度区间，使用一个额外的指针顺序串联起来
    // 有一个链表未结束直接拼接到额外指针上
    //
    // Time     O(m+n)
    // Space    O(1)
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode ret = new ListNode(0);
        ListNode ptr = ret;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                ptr.next = l1;
                ptr = l1;
                l1 = l1.next;
            } else {
                ptr.next = l2;
                ptr = l2;
                l2 = l2.next;
            }
        }

        if (l1 != null) {
            ptr.next = l1;
        }

        if (l2 != null) {
            ptr.next = l2;
        }

        return ret.next;
    }

    // 递归
    //
    // Time     T(n+m)
    // Space    O(n+m)
    public static ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        } else {
            if (l1.val <= l2.val) {
                l1.next = mergeTwoLists(l1.next, l2);
                return l1;
            } else {
                l2.next = mergeTwoLists(l1, l2.next);
                return l2;
            }
        }
    }
}
