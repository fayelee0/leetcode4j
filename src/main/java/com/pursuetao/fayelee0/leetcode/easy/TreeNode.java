package com.pursuetao.fayelee0.leetcode.easy;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.val).append(" ");
        if (this.left != null) {
            sb.append(this.left);
            sb.append(" ");
        }
        if (this.right != null) {
            sb.append(this.right);
            sb.append(" ");
        }
        return sb.delete(sb.length() - 1, sb.length()).toString();
    }
}
