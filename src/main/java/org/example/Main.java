package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String exampleWord = "madam";
        System.out.println("Is '" + exampleWord + "' a palindrome? " + PalindromeChecker.isPalindrome(exampleWord));
    }
}