package com.pursuetao.fayelee0.leetcode.easy;

import com.pursuetao.fayelee0.leetcode.util.TreeNode;

// 110. Balanced Binary Tree
// https://leetcode.com/problems/balanced-binary-tree/
public class Code110 {
    public static boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        } else {
            int left = maxDepth(root.left);
            if (left == -1) {
                return false;
            } else {
                int right = maxDepth(root.right);
                if (right == -1) {
                    return false;
                } else {
                    return Math.abs(left - right) <= 1;
                }
            }
        }
    }

    private static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            int left = maxDepth(root.left);
            if (left == -1) {
                return -1;
            } else {
                int right = maxDepth(root.right);
                if (right == -1) {
                    return -1;
                } else {
                    if (Math.abs(left - right) > 1) {
                        return -1;
                    } else {
                        return Math.max(left, right) + 1;
                    }
                }
            }
        }
    }
}
