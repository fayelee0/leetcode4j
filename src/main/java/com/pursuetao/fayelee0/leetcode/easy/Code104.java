package com.pursuetao.fayelee0.leetcode.easy;

import com.pursuetao.fayelee0.leetcode.util.TreeNode;

// 104. Maximum Depth of Binary Tree
// https://leetcode.com/problems/maximum-depth-of-binary-tree/
public class Code104 {
    // 求数的最大高度 == 求左子数和右子树中的最大高度
    //
    // Time     T(n) = T(n-1) + O(1) + T(n-1) + O(1) = 2T(n-1) + 2O(1) = 2T(n-1) + c1; T(0) = O(1) = c2; T(n) = 2^n + c2 = O(2^n)
    // Space    T(n) = T(n-1) + O(1) = T(n-1) + c1; T(0) = O(1) = c2; T(n) = c1n + c2 = O(n)
    public static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            int left = maxDepth(root.left) + 1;
            int right = maxDepth(root.right) + 1;
            return Math.max(left, right);
        }
    }
}
