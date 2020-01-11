package com.pursuetao.fayelee0.leetcode.easy;

import com.pursuetao.fayelee0.leetcode.easy.TreeNode;

import java.util.*;

/**
 * <a href="https://leetcode.com/problems/average-of-levels-in-binary-tree/">LeetCode 637 Average of Levels in Binary Tree (Easy)</a>
 *
 * Given a non-empty binary tree, return the average value of the nodes on each level in the form of an array.
 *
 * Example 1:
 *
 * Input:
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * Output: [3, 14.5, 11]
 * Explanation:
 * The average value of nodes on level 0 is 3,  on level 1 is 14.5, and on level 2 is 11. Hence return [3, 14.5, 11].
 *
 * Note:
 *
 *     The range of node's value is in the range of 32-bit signed integer.
 */
public class AverageOfLevelsInBinaryTree {
    public static List<Double> averageOfLevels(TreeNode root) {
        List<Double> ret = new ArrayList<>();

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int currentC = 1, currentN = 1, nextC = 0;
        double cc = 0;
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node.left != null) {
                queue.add(node.left);
                nextC++;
            }
            if (node.right != null) {
                queue.add(node.right);
                nextC++;
            }
            cc += node.val;
            currentC--;

            if (currentC == 0) {
                ret.add(cc / currentN);

                currentC = currentN = nextC;
                cc = nextC = 0;
            }
        }
        return ret;
    }

    public static List<Double> averageOfLevels2(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        List<Double> ret = new ArrayList<>();
        while (!queue.isEmpty()) {
            int currentN = queue.size();
            double sum = 0.0;
            for (int i = 0; i < currentN; i++) {
                TreeNode node = queue.poll();
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
                sum += node.val;
            }
            ret.add(sum / currentN);
        }
        return ret;
    }
}
