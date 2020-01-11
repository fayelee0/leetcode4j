package com.pursuetao.fayelee0.leetcode.easy;

import com.pursuetao.fayelee0.leetcode.easy.AverageOfLevelsInBinaryTree;
import com.pursuetao.fayelee0.leetcode.easy.TreeNode;
import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class TestAverageOfLevelsInBinaryTree {
    @Test
    public void averageOfLevels() {
        TreeNode node = new TreeNode(3,
                new TreeNode(9),
                new TreeNode(20,
                        new TreeNode(15),
                        new TreeNode(7)));
        assertThat(AverageOfLevelsInBinaryTree.averageOfLevels(node), is(Arrays.asList(3.0, 14.5, 11.0)));
    }

    @Test
    public void averageOfLevels2() {
        TreeNode node = new TreeNode(3,
                new TreeNode(9),
                new TreeNode(20,
                        new TreeNode(15),
                        new TreeNode(7)));
        assertThat(AverageOfLevelsInBinaryTree.averageOfLevels2(node), is(Arrays.asList(3.0, 14.5, 11.0)));
    }
}
