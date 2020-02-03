package com.pursuetao.fayelee0.leetcode.util;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
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
        } else {
            sb.append("-");
        }
        sb.append(" ");
        if (this.right != null) {
            sb.append(this.right);
        } else {
            sb.append("-");
        }
        sb.append(" ");
        return sb.delete(sb.length() - 1, sb.length()).toString();
    }
}
