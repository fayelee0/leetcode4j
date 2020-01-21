package com.pursuetao.fayelee0.leetcode.easy;

import com.pursuetao.fayelee0.leetcode.util.ListNode;

// 141. Linked List Cycle
// https://leetcode.com/problems/linked-list-cycle/
public class Code141 {
    public static boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        } else {
            ListNode S = head;
            ListNode Q = head.next.next;

            while (Q != null && Q.next != null) {
                if (S.equals(Q)) {
                    return true;
                } else {
                    S = S.next;
                    Q = Q.next.next;
                }
            }

            return false;
        }
    }
}
