package com.pursuetao.fayelee0.leetcode.easy;

import com.pursuetao.fayelee0.leetcode.util.TreeNode;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class TestCode617 {
    @Test
    public void mergeTrees() {
        assertThat(Code617.mergeTrees(
                new TreeNode(1,
                new TreeNode(3,
                        new TreeNode(5),
                        null),
                new TreeNode(2)),
                new TreeNode(2,
                        new TreeNode(1,
                                null,
                                new TreeNode(4)),
                        new TreeNode(3,
                                null,
                                new TreeNode(7)))).toString(),
                is(new TreeNode(3,
                        new TreeNode(4,
                                new TreeNode(5),
                                new TreeNode(4)),
                        new TreeNode(5,
                                null,
                                new TreeNode(7))).toString()));
    }
}
