/*
 * *
 *  Copyright (c) 2026 Wilson K Sam
 *
 *  SPDX-License-Identifier: MIT
 *
 *  Chapter : Chapter 6 - Class as the Basis of all Computations
 *  Purpose:
 *  Notes:
 *    -
 *
 *
 */

package chapter4_string_handling;

public class StringDataMember {
    public static void main(String[] args) {
        String str1 = "Hello, World!";
        String str2 = "Hello, World!";

        // Comparing string literals
        System.out.println("Comparing string literals:");
        System.out.println("str1 == str2: " + (str1 == str2)); // true, because string literals are interned
        System.out.println("str1.equals(str2): " + str1.equals(str2)); // true
    }
}
