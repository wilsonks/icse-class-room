/*
 * *
 *  Copyright (c) 2026 Wilson K Sam
 *
 *  SPDX-License-Identifier: MIT
 *
 *  Chapter : Chapter 6 - Class as the Basis of all Computations
 *  Purpose: Count the number of words in a string starting with uppercase and lowercase
 *  Notes:
 *    -
 *
 *
 */

package chapter6.instance_variables;

public class CountWords {
    private String str;
    private int upperCount;
    private int lowerCount;

    void input(String input) {
        str = input;
        upperCount = 0;
        lowerCount = 0;
    }

    void countWords() {
        upperCount = 0;
        lowerCount = 0;

        if(str.isEmpty()) return;
        if(Character.isUpperCase(str.charAt(0)) ) {
            upperCount++;
        } else {
            lowerCount++;
        }
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(Character.isWhitespace(ch)) {
                if(Character.isUpperCase(str.charAt(i+ 1))) {
                    upperCount++;
                }
                if(Character.isLowerCase(str.charAt(i+ 1))) {
                    lowerCount++;
                }
            }
        }

        System.out.println("upper count is " + upperCount);
        System.out.println("lower count is " + lowerCount);
    }

    public static void main(String[] args) {
        CountWords countWords = new CountWords();
        countWords.input("Define a Word count Class in Java");
        countWords.countWords();
//        upper count is 4
//        lower count is 3
    }
}
