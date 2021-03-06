package com.pursuetao.fayelee0.leetcode.easy;

/**
 * <a href="https://leetcode.com/problems/defanging-an-ip-address/">1108. Defanging an IP address (Easy)</a>
 *
 * Given a valid (IPv4) IP address, return a defanged version of that IP address.
 * A defanged IP address replaces every period "." with "[.]".
 */
public class Code1108 {

    public static String defangIPAddr(String address) {
        return address.replaceAll("[.]", "[.]");
    }

    // java~byte 8bit   == C~signed char
    // java~char 16bit  == C~unsigned short
    public static String defangIPAddr2(String address) {
        StringBuilder buffer = new StringBuilder();

        byte[] bytes = address.getBytes();
        for (byte c : bytes) {
            if (c == '.') {
                buffer.append("[.]");
            } else {
                buffer.append((char) c);
            }
        }

        return buffer.toString();
    }

    public static String defangIPAddr3(String address) {
        StringBuilder buffer = new StringBuilder();

        for (int i = 0; i < address.length(); i++) {
            if (address.charAt(i) == '.') {
                buffer.append("[.]");
            } else {
                buffer.append(address.charAt(i));
            }
        }

        return buffer.toString();
    }

}
