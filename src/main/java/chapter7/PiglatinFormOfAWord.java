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

package chapter7;

public class PiglatinFormOfAWord {

    public static String piglatin(String word) {
        if (word == null || word.isEmpty()) {
            return word; // Return the original word if it's null or empty
        }

        char firstLetter = Character.toLowerCase(word.charAt(0));
        String restOfWord = word.substring(1);

        if (isVowel(firstLetter)) {
            return word + "yay"; // If the first letter is a vowel, add "yay" to the end
        } else {
            return restOfWord + firstLetter + "ay"; // Move the first letter to the end and add "ay"
        }
    }

    private static boolean isVowel(char letter) {
        return "aeiou".indexOf(letter) != -1; // Check if the letter is a vowel
    }

    public static void main(String[] args) {
        String word1 = "hello";
        String word2 = "apple";
        String word3 = "string";

        System.out.println("Pig Latin of '" + word1 + "' is: " + piglatin(word1)); //ellohay
        System.out.println("Pig Latin of '" + word2 + "' is: " + piglatin(word2)); //appleyay
        System.out.println("Pig Latin of '" + word3 + "' is: " + piglatin(word3)); //tringsay
    }
}
