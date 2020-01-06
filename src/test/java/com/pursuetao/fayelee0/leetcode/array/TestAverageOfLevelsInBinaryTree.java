package com.pursuetao.fayelee0.leetcode.array;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class TestAverageOfLevelsInBinaryTree {
    @Test
    public void averageOfLevels() {
        AverageOfLevelsInBinaryTree.TreeNode node = new AverageOfLevelsInBinaryTree.TreeNode(3,
                new AverageOfLevelsInBinaryTree.TreeNode(9),
                new AverageOfLevelsInBinaryTree.TreeNode(20,
                        new AverageOfLevelsInBinaryTree.TreeNode(15),
                        new AverageOfLevelsInBinaryTree.TreeNode(7)));
        assertThat(AverageOfLevelsInBinaryTree.averageOfLevels(node), is(Arrays.asList(3.0, 14.5, 11.0)));
    }

    @Test
    public void averageOfLevels2() {
        AverageOfLevelsInBinaryTree.TreeNode node = new AverageOfLevelsInBinaryTree.TreeNode(3,
                new AverageOfLevelsInBinaryTree.TreeNode(9),
                new AverageOfLevelsInBinaryTree.TreeNode(20,
                        new AverageOfLevelsInBinaryTree.TreeNode(15),
                        new AverageOfLevelsInBinaryTree.TreeNode(7)));
        assertThat(AverageOfLevelsInBinaryTree.averageOfLevels2(node), is(Arrays.asList(3.0, 14.5, 11.0)));
    }
}
