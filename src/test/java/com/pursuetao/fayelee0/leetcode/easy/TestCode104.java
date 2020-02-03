package com.pursuetao.fayelee0.leetcode.easy;

import com.pursuetao.fayelee0.leetcode.util.TreeNode;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class TestCode104 {
    @Test
    public void maxDepth() {
        TreeNode tree = new TreeNode(3,
                new TreeNode(9),
                new TreeNode(20,
                        new TreeNode(15),
                        new TreeNode(7)));
        assertThat(Code104.maxDepth(tree), is(3));
    }
}
