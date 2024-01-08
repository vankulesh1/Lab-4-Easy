package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a word to check if it's a palindrome: ");
        String userWord = scanner.nextLine();


        System.out.println("Is '" + userWord + "' a palindrome? " + PalindromeChecker.isPalindrome(userWord));
    }
}