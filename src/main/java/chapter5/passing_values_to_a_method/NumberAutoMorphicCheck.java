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

public class NumberAutoMorphicCheck {

    public static boolean isAutomorphic(int number) {
        int square = number * number;
        String numStr = Integer.toString(number); // Convert the number to a string to check its digits
        String squareStr = Integer.toString(square); // Convert the square to a string to check its digits
        return squareStr.endsWith(numStr); //Check it's square ends with
    }

    public static void main(String[] args) {
        int testNumber = 25; // Change this value to test different numbers
        boolean result = isAutomorphic(testNumber);
        System.out.println("Is " + testNumber + " an automorphic number? " + result);
    }
}
