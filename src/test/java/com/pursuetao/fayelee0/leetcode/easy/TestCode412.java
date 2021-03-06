package com.pursuetao.fayelee0.leetcode.easy;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class TestCode412 {
    @Test
    public void fizzBuzz() {
        assertThat(Code412.fizzBuzz(15), is(Arrays.asList("1",
                "2",
                "Fizz",
                "4",
                "Buzz",
                "Fizz",
                "7",
                "8",
                "Fizz",
                "Buzz",
                "11",
                "Fizz",
                "13",
                "14",
                "FizzBuzz")));
    }

    @Test
    public void fizzBuzz2() {
        assertThat(Code412.fizzBuzz2(15), is(Arrays.asList("1",
                "2",
                "Fizz",
                "4",
                "Buzz",
                "Fizz",
                "7",
                "8",
                "Fizz",
                "Buzz",
                "11",
                "Fizz",
                "13",
                "14",
                "FizzBuzz")));
    }

    @Test
    public void fizzBuzz3() {
        assertThat(Code412.fizzBuzz3(15), is(Arrays.asList("1",
                "2",
                "Fizz",
                "4",
                "Buzz",
                "Fizz",
                "7",
                "8",
                "Fizz",
                "Buzz",
                "11",
                "Fizz",
                "13",
                "14",
                "FizzBuzz")));

        assertThat(Code412.fizzBuzz3(5), is(Arrays.asList("1", "2", "Fizz", "4", "Buzz")));
    }

    @Test
    public void fizzBuzz4() {
        assertThat(Code412.fizzBuzz4(15), is(Arrays.asList("1",
                "2",
                "Fizz",
                "4",
                "Buzz",
                "Fizz",
                "7",
                "8",
                "Fizz",
                "Buzz",
                "11",
                "Fizz",
                "13",
                "14",
                "FizzBuzz")));

        assertThat(Code412.fizzBuzz4(5), is(Arrays.asList("1", "2", "Fizz", "4", "Buzz")));
    }

    @Test
    public void fizzBuzz5() {
        assertThat(Code412.fizzBuzz5(15), is(Arrays.asList("1",
                "2",
                "Fizz",
                "4",
                "Buzz",
                "Fizz",
                "7",
                "8",
                "Fizz",
                "Buzz",
                "11",
                "Fizz",
                "13",
                "14",
                "FizzBuzz")));

        assertThat(Code412.fizzBuzz5(5), is(Arrays.asList("1", "2", "Fizz", "4", "Buzz")));
    }
}
