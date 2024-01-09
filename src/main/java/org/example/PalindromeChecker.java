package org.example;

public class PalindromeChecker {

    public static boolean isPalindrome(String word) {
        String cleanedWord = removeSpacesAndBigLetter(word);
        String reversedWord = new StringBuilder(cleanedWord).reverse().toString();
        return cleanedWord.equals(reversedWord);
    }

    private static String removeSpacesAndBigLetter(String input) {
        StringBuilder result = new StringBuilder();
        for (char ch : input.toCharArray()) {
            if (!Character.isWhitespace(ch)) {

                result.append(Character.toLowerCase(ch));
            }
        }
        return result.toString();
    }
}