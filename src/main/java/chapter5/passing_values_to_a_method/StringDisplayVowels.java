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

package chapter5.passing_values_to_a_method;

public class StringDisplayVowels {

    public static void displayVowels(String str) {
        System.out.println("Vowels in the string: ");
        for (char ch : str.toCharArray()) {
            if (isVowel(ch)) {
                System.out.print(ch + " ");
            }
        }
        System.out.println(); // Print a new line after displaying vowels
    }

    private static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public static void main(String[] args) {
        String inputString = "Hello, World!";
        displayVowels(inputString);
    }
}
