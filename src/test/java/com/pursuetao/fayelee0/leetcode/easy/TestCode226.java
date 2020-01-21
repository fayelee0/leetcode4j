package com.pursuetao.fayelee0.leetcode.easy;

import com.pursuetao.fayelee0.leetcode.util.TreeNode;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.MatcherAssert.assertThat;

public class TestCode226 {
    @Test
    public void invertTree() {
        TreeNode node = new TreeNode(4,
                new TreeNode(2,
                        new TreeNode(1),
                        new TreeNode(3)),
                new TreeNode(7,
                        new TreeNode(6),
                        new TreeNode(9)));      // 4 2 1 3 7 6 9

        assertThat(Code226.invertTree(node).toString(), is("4 7 9 - - 6 - - 2 3 - - 1 - -"));
    }

    @Test
    public void invertTree2() {
        TreeNode node = new TreeNode(4,
                new TreeNode(2,
                        new TreeNode(1),
                        new TreeNode(3)),
                new TreeNode(7,
                        new TreeNode(6),
                        new TreeNode(9)));      // 4 2 1 3 7 6 9

        assertThat(Code226.invertTree2(node).toString(), is("4 7 9 - - 6 - - 2 3 - - 1 - -"));

        assertThat(Code226.invertTree2(null), is(nullValue()));
    }
}
