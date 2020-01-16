package com.pursuetao.fayelee0.leetcode.easy;

// 189. Rotate Array
// https://leetcode.com/problems/rotate-array/
public class Code189 {
    // Time: O(n) = O(k) + O(n-k) + O(k)
    // Space: O(k)
    public static void rotate(int[] nums, int k) {
        int N = nums.length;

        if (N > 1) {
            int K = k % N;

            int[] temp = new int[K];
            for (int i = N - K, c = 0; i < N; i++, c++) {
                temp[c] = nums[i];
            }

            for (int i = N - 1, j = N - K - 1; j >= 0; i--, j--) {
                nums[i] = nums[j];
            }

            System.arraycopy(temp, 0, nums, 0, K);
        }
    }

    public static void rotate2(int[] nums, int k) {
        int N = nums.length;

        if (N > 1) {
            int K = k % N;
            for (int tail; K != 0; K--) {
                tail = nums[N - 1];
                System.arraycopy(nums, 0, nums, 1, N - 1);
                nums[0] = tail;
            }
        }
    }
}
