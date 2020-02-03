package com.pursuetao.fayelee0.leetcode.easy;

import com.pursuetao.fayelee0.leetcode.util.TreeNode;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class TestCode110 {
    @Test
    public void isBalanced() {
        TreeNode tree0 = new TreeNode(3,
                new TreeNode(9),
                new TreeNode(20,
                        new TreeNode(15),
                        new TreeNode(7)));
        assertThat(Code110.isBalanced(tree0), is(true));

        TreeNode tree1 = new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(3,
                                new TreeNode(4),
                                new TreeNode(4)),
                        new TreeNode(3)),
                new TreeNode(2));
        assertThat(Code110.isBalanced(tree1), is(false));

        TreeNode tree2 = new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(3,
                                new TreeNode(4,
                                        new TreeNode(5),
                                        null),
                                null),
                        null),
                null);
        assertThat(Code110.isBalanced(tree2), is(false));
    }
}
