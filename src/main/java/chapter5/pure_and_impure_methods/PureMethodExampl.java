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

package chapter5.pure_and_impure_methods;

public class PureMethodExampl {

    // Pure method: It always produces the same output for the same input and has no side effects.
    public static int add(int a, int b) {
        return a + b;
    }

    // Impure method: It may produce different outputs for the same input or has side effects.
    public static void printCurrentTime() {
        System.out.println("Current time: " + System.currentTimeMillis());
    }

    public static void main(String[] args) {
        // Testing the pure method
        int result1 = add(5, 10);
        int result2 = add(5, 10);
        System.out.println("Result of add(5, 10): " + result1); // Always 15
        System.out.println("Result of add(5, 10): " + result2); // Always 15

        // Testing the impure method
        printCurrentTime(); // Will print different times each time it's called
        printCurrentTime(); // Will print different times each time it's called
    }
}
