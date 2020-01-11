package com.pursuetao.fayelee0.leetcode.easy;

import com.pursuetao.fayelee0.leetcode.easy.Code268;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class TestCode268 {
    @Test
    public void missingNumber1() {
        assertThat(Code268.missingNumber1(new int[]{3, 0, 1}), is(2));
        assertThat(Code268.missingNumber1(new int[]{9,6,4,2,3,5,7,0,1}), is(8));
    }

    @Test
    public void missingNumber2() {
        assertThat(Code268.missingNumber2(new int[]{3, 0, 1}), is(2));
        assertThat(Code268.missingNumber2(new int[]{9,6,4,2,3,5,7,0,1}), is(8));
    }

    @Test
    public void missingNumber3() {
        assertThat(Code268.missingNumber3(new int[]{3, 0, 1}), is(2));
        assertThat(Code268.missingNumber3(new int[]{9,6,4,2,3,5,7,0,1}), is(8));
    }

    @Test
    public void missingNumber4() {
        assertThat(Code268.missingNumber4(new int[]{3, 0, 1}), is(2));
        assertThat(Code268.missingNumber4(new int[]{9,6,4,2,3,5,7,0,1}), is(8));
    }

    @Test
    public void missingNumber() {
        assertThat(Code268.missingNumber(new int[]{3, 0, 1}), is(2));
        assertThat(Code268.missingNumber(new int[]{9,6,4,2,3,5,7,0,1}), is(8));
        assertThat(Code268.missingNumber(new int[]{1}), is(0));
    }
}
