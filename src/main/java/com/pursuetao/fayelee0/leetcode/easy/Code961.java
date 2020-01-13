package com.pursuetao.fayelee0.leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode.com/problems/n-repeated-element-in-size-2n-array/">961. N-Repeated Element in Size 2N Array</a>
 *
 * In a array A of size 2N, there are N+1 unique elements, and exactly one of these elements is repeated N times.
 *
 * Return the element repeated N times.
 *
 *
 *
 * Example 1:
 *
 * Input: [1,2,3,3]
 * Output: 3
 *
 * Example 2:
 *
 * Input: [2,1,2,5,3,2]
 * Output: 2
 *
 * Example 3:
 *
 * Input: [5,1,5,2,5,3,5,4]
 * Output: 5
 *
 *
 *
 * Note:
 *
 *     4 <= A.length <= 10000
 *     0 <= A[i] < 10000
 *     A.length is even
 */
public class Code961 {
    // Time     O(n·lgn)
    // Space    O(1)
    public static int repeatedNTimes(int[] A) {
        Arrays.sort(A);

        int M = A.length / 2;
        if (A[M] == A[M - 1]) {
            return A[M];
        } else if (A[M] == A[M + 1]) {
            return A[M];
        } else {
            return A[M - 1];
        }
    }

    // Time     O(n)
    // Space    O(n)
    public static int repeatedNTimes2(int[] A) {
        Map<Integer, Boolean> store = new HashMap<>();
        for (int n : A) {
            if (store.containsKey(n)) {
                return n;
            } else {
                store.put(n, true);
            }
        }
        return -1;
    }
}
