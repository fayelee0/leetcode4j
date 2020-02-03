package com.pursuetao.fayelee0.leetcode.easy;

import com.pursuetao.fayelee0.leetcode.util.TreeNode;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class TestCode617 {
    private TreeNode t1;
    private TreeNode t2;
    private TreeNode t3;

    @Before
    public void setup() {
        t1 = new TreeNode(1,
                new TreeNode(3,
                        new TreeNode(5),
                        null),
                new TreeNode(2));

        t2 =  new TreeNode(2,
                new TreeNode(1,
                        null,
                        new TreeNode(4)),
                new TreeNode(3,
                        null,
                        new TreeNode(7)));

        t3 = new TreeNode(3,
                new TreeNode(4,
                        new TreeNode(5),
                        new TreeNode(4)),
                new TreeNode(5,
                        null,
                        new TreeNode(7)));
    }

    @Test
    public void mergeTrees() {
        assertThat(Code617.mergeTrees(t1, t2).toString(), is(t3.toString()));
    }

    @Test
    public void mergeTrees2() {
        assertThat(Code617.mergeTrees2(t1, t2).toString(), is(t3.toString()));
    }
}
