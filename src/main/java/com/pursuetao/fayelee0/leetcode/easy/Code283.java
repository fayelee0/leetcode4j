package com.pursuetao.fayelee0.leetcode.easy;

// 283. Move Zeroes
// https://leetcode.com/problems/move-zeroes/
public class Code283 {
    // 从后面往前遍历，若遇到 0 则将 0 之后的数字往前移动，再将空余的位置补 0
    //
    // 因为每次遇到 0 都需要移动 x 个位置；所以比较浪费时间
    //
    // Time     O(n^2)
    // Space    O(1)
    public static void moveZeroes(int[] nums) {
         int N = nums.length;
         int k = N - 1;
         for (int i = N - 1; 0 <= i; i--) {
             if (nums[i] == 0) {
                 for (int j = i; j < k; j++) {
                     nums[j] = nums[j+1];
                 }
                 nums[k--] = 0;
             }
         }
    }

    // 从前往后遍历，将不为 0 的数全部往前移动
    // 将尾部空出的位置用 0 补充
    //
    // 每个数至多移动一次
    //
    // Time     O(n)
    // Space    O(1)
    public static void moveZeroes2(int[] nums) {
        int N = nums.length;
        int j = 0;
        for (int i = 0; i < N; i++) {
            if (nums[i] != 0) {
                nums[j++] = nums[i];
            }
        }

        for (int i = j; i < N; i++) {
            nums[i] = 0;
        }
    }
}
