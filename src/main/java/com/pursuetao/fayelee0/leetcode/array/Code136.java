package com.pursuetao.fayelee0.leetcode.array;

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
    // 1. 遍历数组，并创建一个集合保存中间结果
    // 2. 若当前值不在集合中，则将其添加到集合
    // 3. 若当前值已在集合中，则将其移除出集合
    // 4. 集合中唯一剩余的数为结果
    //
    // 时间复杂度：数组遍历 O(n) + 集合查找 O(1) = O(n)
    // 空间复杂度：集合存储 O(n)
    //
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
}
