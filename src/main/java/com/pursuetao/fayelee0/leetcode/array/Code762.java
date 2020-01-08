package com.pursuetao.fayelee0.leetcode.array;

/**
 * <a href="">LeetCode 762. Prime Number of Set Bits in Binary Representation (Easy)</a>
 * <p>
 * Given two integers L and R, find the count of numbers in the range [L, R] (inclusive) having a prime number of set bits in their binary representation.
 * <p>
 * (Recall that the number of set bits an integer has is the number of 1s present when written in binary. For example, 21 written in binary is 10101 which has 3 set bits. Also, 1 is not a prime.)
 * <p>
 * Example 1:
 * <p>
 * Input: L = 6, R = 10
 * Output: 4
 * Explanation:
 * 6 -> 110 (2 set bits, 2 is prime)
 * 7 -> 111 (3 set bits, 3 is prime)
 * 9 -> 1001 (2 set bits , 2 is prime)
 * 10->1010 (2 set bits , 2 is prime)
 * <p>
 * Example 2:
 * <p>
 * Input: L = 10, R = 15
 * Output: 5
 * Explanation:
 * 10 -> 1010 (2 set bits, 2 is prime)
 * 11 -> 1011 (3 set bits, 3 is prime)
 * 12 -> 1100 (2 set bits, 2 is prime)
 * 13 -> 1101 (3 set bits, 3 is prime)
 * 14 -> 1110 (3 set bits, 3 is prime)
 * 15 -> 1111 (4 set bits, 4 is not prime)
 * <p>
 * Note:
 * <p>
 * L, R will be integers L <= R in the range [1, 10^6].
 * R - L will be at most 10000.
 */
public class Code762 {
    // 策略一
    // 1. 遍历 [L, R] 找到每个数的二进制中 1 的数量        :需要计算二进制位
    // 2. 判定 [L, R] 中每个 1 的数量是否为素数           :需要计算素数
    // Time     O(n)
    // Space    O(1)
    public static int countPrimeSetBits(int L, int R) {
        int ret = 0;
        for (int i = L; i <= R; i++) {
            if (prime(Integer.bitCount(i))) {
                ret++;
            };
//            if (prime(bits(i))) {
//                ret++;
//            }
        }
        return ret;
    }

    // Time     O(1)
    // Space    O(1)
    static int bits(int n) {
//        int ret = 0;
//        while (n != 0) {
//            n &= n - 1;
//            ret++;
//        }
//        return ret;

        int ret = 0;
        for (char c : Integer.toBinaryString(n).toCharArray()) {
            if (c == '1') {
                ret++;
            }
        }
        return ret;
    }

    // 10^6 ~  20bit
    // Time     O(1)
    // Space    O(1)
    static boolean prime(int n) {
        return n == 2 || n == 3 || n == 5 | n == 7 ||
                n == 11 || n == 13 || n == 17 || n == 19;
    }
}
