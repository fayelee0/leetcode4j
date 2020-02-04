package com.pursuetao.fayelee0.leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// 169. Majority Element
// https://leetcode.com/problems/majority-element/
public class Code169 {
    // 排序数组，找中间的那个数值
    //
    // Time     O(n lgn)
    // Space    O(1) quick sort O(n) merge sort
    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return  nums[nums.length / 2];
    }

    // 计算每个数在数组中出现的次数
    //
    // Time     O(n^2)
    // Space    O(1)
    public static int majorityElement2(int[] nums) {
        int target = nums.length / 2;
        for (int num : nums) {
            int count = 0;
            for (int ele : nums) {
                if (ele == num) {
                    count++;
                }
            }
            if (count > target) {
                return num;
            }
        }
        return 0;
    }

    // 计算数值中每个数出现的此处，找到目标
    //
    // Time     O(n)
    // Space    O(n)
    public static int majorityElement3(int[] nums) {
        Map<Integer, Integer> store = new HashMap<>();
        for (int num : nums) {
            store.put(num, store.getOrDefault(num, 0) + 1);
        }

        int target = nums.length / 2;
        for (Map.Entry<Integer, Integer> entry : store.entrySet()) {
            if (entry.getValue() > target) {
                return entry.getKey();
            }
        }
        return 0;
    }

    // 随机选取，目标值出现的概论大于 50%
    //
    // Time     O(∞)
    // Space    O(1)
    public static int majorityElement4(int[] nums) {
        int target = nums.length / 2;
        while (true) {
            int i = (int) (Math.random() * nums.length);
            int cmp = nums[i];
            int ccc = 0;
            for (int num : nums) {
                if (num == cmp) {
                    ccc++;
                }
            }
            if (ccc > target) {
                return cmp;
            }
        }
    }
}
