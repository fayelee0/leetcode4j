package com.pursuetao.fayelee0.leetcode.easy;

// 88. Merge Sorted Array
// https://leetcode.com/problems/merge-sorted-array/
public class Code88 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        while (0 <= i && 0 <= j) {
            if (nums1[i] < nums2[j]) {
                nums1[k--] = nums2[j--];
            } else {
                nums1[k--] = nums1[i--];
            }
        }

        while (0 <= j) {
            nums1[k--] = nums2[j--];
        }
    }
}
