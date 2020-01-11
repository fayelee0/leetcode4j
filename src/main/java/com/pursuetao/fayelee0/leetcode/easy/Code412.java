package com.pursuetao.fayelee0.leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/fizz-buzz/">412. Fizz Buzz (Easy)</a>
 *
 * Write a program that outputs the string representation of numbers from 1 to n.
 *
 * But for multiples of three it should output “Fizz” instead of the number and for the multiples of five output “Buzz”. For numbers which are multiples of both three and five output “FizzBuzz”.
 *
 * Example:
 *
 * n = 15,
 *
 * Return:
 * [
 *     "1",
 *     "2",
 *     "Fizz",
 *     "4",
 *     "Buzz",
 *     "Fizz",
 *     "7",
 *     "8",
 *     "Fizz",
 *     "Buzz",
 *     "11",
 *     "Fizz",
 *     "13",
 *     "14",
 *     "FizzBuzz"
 * ]
 */
public class Code412 {
    public static List<String> fizzBuzz(int n) {
        List<String> ret = new ArrayList<>(n);
        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) {
                ret.add("FizzBuzz");
            } else if (i % 5 == 0) {
                ret.add("Buzz");
            } else if (i % 3 == 0) {
                ret.add("Fizz");
            } else {
                ret.add(Integer.toString(i));
            }
//
//            if (i % 3 == 0 && i % 5 == 0) {
//                ret.add("FizzBuzz");
//            } else if (i % 3 == 0) {
//                ret.add("Fizz");
//            } else if (i % 5 == 0) {
//                ret.add("Buzz");
//            } else {
//                ret.add(Integer.toString(i));
//            }
        }
        return ret;
    }

    public static List<String> fizzBuzz2(int n) {
        String[] ret = new String[n];
        for (int i = 1; i <= n; i++) {
            ret[i - 1] = Integer.toString(i);
        }
        for (int i = 3; i <= n; i += 3) {
            ret[i - 1] = "Fizz";
        }
        for (int i = 5; i <= n; i += 5) {
            ret[i - 1] = "Buzz";
        }
        for (int i = 15; i <= n; i += 15) {
            ret[i - 1] = "FizzBuzz";
        }
        return Arrays.asList(ret);
    }

    public static List<String> fizzBuzz3(int n) {
        List<String> ret = new ArrayList<>();

        int f = 1;
        int b = 1;
        for (int i = 1; i <= n; i++) {
            if (f == 3 && b == 5) {
                ret.add("FizzBuzz");
                f = 1;
                b = 1;
            } else if (f == 3) {
                ret.add("Fizz");
                f = 1;
                b++;
            } else if (b == 5) {
                ret.add("Buzz");
                f++;
                b = 1;
            } else {
                ret.add(Integer.toString(i));
                f++;
                b++;
            }
        }
        return ret;
    }

    public static List<String> fizzBuzz4(int n) {
        List<String> ret = new ArrayList<>(n);
        for (int i = 1; i <= n; i++) {
            boolean f = i % 3 == 0;
            boolean b = i % 5 == 0;

            if (f && b) {
                ret.add("FizzBuzz");
            } else if (f) {
                ret.add("Fizz");
            } else if (b) {
                ret.add("Buzz");
            } else {
                ret.add(Integer.toString(i));
            }
        }
        return ret;
    }

    public static List<String> fizzBuzz5(int n) {
        List<String> ret = new ArrayList<>(n);
        for (int i = 1; i <= n; i++) {
            boolean f = i % 3 == 0;
            boolean b = i % 5 == 0;

            if (!f && !b) {                     // !3 !5
                ret.add(Integer.toString(i));
            } else if (f && !b) {               //  3 !5
                ret.add("Fizz");
            } else if (!f) {                // !3  5
                ret.add("Buzz");
            } else {                            //  3  5
                ret.add("FizzBuzz");
            }
        }
        return ret;
    }
}
