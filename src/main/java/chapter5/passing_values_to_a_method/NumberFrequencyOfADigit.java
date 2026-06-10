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

public class NumberFrequencyOfADigit {

    public static int countDigitFrequency(int number, int digit) {
        int count = 0;
        while (number > 0) {
            int lastDigit = number % 10; // Get the last digit
            if (lastDigit == digit) {
                count++;
            }
            number /= 10; // Remove the last digit
        }
        return count;
    }

    public static void main(String[] args) {
        int number = 1234567890; // Change this value to check different numbers
        int digitToCount = 1; // Change this value to count different digits
        int frequency = countDigitFrequency(number, digitToCount);
        System.out.println("The digit " + digitToCount + " appears " + frequency + " times in the number " + number);
    }
}
