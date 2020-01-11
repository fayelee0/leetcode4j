package com.pursuetao.fayelee0.leetcode.easy;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class TestCode112 {
    @Test
    public void hasPathSum() {
        TreeNode node = new TreeNode(5,
                new TreeNode(4,
                        new TreeNode(11,
                                new TreeNode(7),
                                new TreeNode(2)),
                        null),
                new TreeNode(8,
                        new TreeNode(13),
                        new TreeNode(4,
                                null,
                                new TreeNode(1))));
        assertThat(Code112.hasPathSum(node, 22), is(true));

        TreeNode node2 = new TreeNode(-2,
                null,
                new TreeNode(-3));
        assertThat(Code112.hasPathSum(node2, -5), is(true));

        TreeNode node3 = new TreeNode(1,
                new TreeNode(-2,
                    new TreeNode(1,
                        new TreeNode(-1),
                    null),
                    new TreeNode(3)),
                new TreeNode(-1,
                        new TreeNode(-2),
                        null));
        assertThat(Code112.hasPathSum(node3, -1), is(true));
    }
}
