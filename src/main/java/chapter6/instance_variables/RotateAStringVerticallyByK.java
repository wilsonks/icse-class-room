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

package chapter6.instance_variables;

import java.util.Scanner;

public class RotateAStringVerticallyByK {

    private static final int MAX_INDEX = 90;
    private static final int MIN_INDEX = 65;
    private static final int REEL_SIZE = 26;
    private String str;

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        str = sc.nextLine();
    }

    public void rotateStringVertically(int move) {
        StringBuilder sb = new StringBuilder();
        move = move % REEL_SIZE; //To handle cases where k is greater than the reel size, we take the modulus with the reel size. This ensures that the rotation wraps around correctly and prevents unnecessary rotations.

        System.out.println("Starting to rotate string %s vertically by %s".formatted(str, move) );
        for (int i = 0; i <= str.length() - 1; i++) {
            int codePoint = str.codePointAt(i);
            int nextCodePoint = str.codePointAt(i) + move;
            if(codePoint + move > MAX_INDEX) {
                nextCodePoint = codePoint + move - REEL_SIZE;
            }
            if(codePoint + move < MIN_INDEX) {
                nextCodePoint = codePoint + move + REEL_SIZE;
            }
            sb.append((char) nextCodePoint);
        }
        str = sb.toString();
        System.out.println("The rotated string is: " + str);
    }


    public static void main(String[] args) {
        RotateAStringVerticallyByK obj = new RotateAStringVerticallyByK();
        obj.input();
        obj.rotateStringVertically(2);
        obj.rotateStringVertically(-2);
        obj.rotateStringVertically(-3);
    }
}
