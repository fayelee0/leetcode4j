package com.pursuetao.fayelee0.leetcode.easy;

import com.pursuetao.fayelee0.leetcode.util.ListNode;

// 206. Reverse Linked List
// https://leetcode.com/problems/reverse-linked-list/
public class Code206 {
    // 定义一个新的指针作为新链表的头节点，初始化为空
    // 定义一个新的指针指向头节点的前一个位置，初始化为空
    // 遍历链表
    //
    // Time     O(n)
    // Space    O(1)
    public static ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        } else {
            ListNode ret = null;
            ListNode tmp = null;
            while (head != null) {
                tmp = head;
                head = head.next;
                tmp.next = ret;
                ret = tmp;
            }
            return ret;
        }
    }

    // 左边是被反转链表，右边是反转后链表
    // 每次递归，都将左边首节点转移到右边做首节点
    // 递归结束是左边链表为空，右边则为反转后的链表
    //
    // Time     O(n); T(n) = T(n-1) + O(1) = T(n-1) + c1; T(0) = O(1) = c2; T(n) = n * c1 + c2 = O(n)
    // Space    O(n);
    public static ListNode reverseList2(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        } else {
            return reverseList22(head, null);
        }
    }

    private static ListNode reverseList22(ListNode o, ListNode n) {
        if (o == null) {
            return n;
        } else {
            ListNode t = o.next;
            o.next = n;
            return reverseList22(t, o);
        }
    }
}
