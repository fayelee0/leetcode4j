package com.pursuetao.fayelee0.leetcode.easy;

import com.pursuetao.fayelee0.leetcode.util.ListNode;

// 83. Remove Duplicates from Sorted List
// https://leetcode.com/problems/remove-duplicates-from-sorted-list/
public class Code83 {
    public static ListNode deleteDuplicates(ListNode head) {
        if (head != null) {
            ListNode pre = head;
            ListNode xxx = head.next;
            while (xxx != null) {
                if (pre.val != xxx.val) {
                    pre.next = xxx;
                    pre = xxx;
                }
                xxx = xxx.next;
            }
            pre.next = null;
        }
        return head;
    }
}
