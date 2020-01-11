package com.pursuetao.fayelee0.leetcode.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * <a href="https://leetcode.com/problems/single-number/">LeetCode 136. Single Number (Easy)</a>
 *
 * Given a non-empty array of integers, every element appears twice except for one. Find that single one.
 *
 * Note:
 *
 * Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 *
 * Example 1:
 *
 * Input: [2,2,1]
 * Output: 1
 *
 * Example 2:
 *
 * Input: [4,1,2,1,2]
 * Output: 4
 */
public class Code136 {
    // 策略：
    // 1. 遍历数组，并创建一个集合保存中间结果
    // 2. 若当前值不在集合中，则将其添加到集合
    // 3. 若当前值已在集合中，则将其移除出集合
    // 4. 集合中唯一剩余的数为结果
    //
    // 度量：
    // 时间复杂度：数组遍历 O(n) + 集合查找 O(n) = O(n)
    // 空间复杂度：集合存储 O(n)
    //
    // 计算：
    // Runtime: 7ms~38.96%
    // Memory Usage: 40.6MB~78.52%
    public static int singleNumber0(int[] nums) {
        Set<Integer> once = new HashSet<>();
        for (int n : nums) {
            if (once.contains(n)) {
                once.remove(n);
            } else {
                once.add(n);
            }
        }
        Integer[] ret = new Integer[once.size()];
        once.toArray(ret);
        return ret[0];
    }

    // 策略：
    // 1. 对数组排序
    // 2. 遍历数组
    //
    // 度量：
    // 时间复杂度：数组排序 O(n·lgn) + 数组遍历 O(n)
    // 空间复杂度：O(1)
    //
    // 计算：
    // Runtime: 3ms~49.69%
    // Memory Usage: 40.6MB~96.30%
    public static int singleNumber1(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i += 2) {
            if (nums[i] != nums[i + 1]) {
                return nums[i];
            }
        }
        return nums[nums.length - 1];
    }

    // Strategy:
    // 1. x^x = 0
    // 2. loop array, every number compute xor
    // 3. return result
    //
    // Measure:
    // Time     loop-array O(n)
    // Space    O(1)
    //
    // Compute:
    // Runtime: 0ms~100%
    // Memory Usage: 39.7ms~96.30%
    public static int singleNumber2(int[] nums) {
        int ret = 0;
        for (int n : nums) {
            ret ^= n;
        }
        return ret;
    }
}
