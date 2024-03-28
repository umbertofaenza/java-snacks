package org.learning.snacks;

import java.util.Scanner;

public class Snack4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Write a word: ");
        String inputString = scan.nextLine();

        char[] inputAsChars = inputString.toCharArray();
        char[] reversedChars = new char[inputString.length()];
        int j = 0;

        for (int i = inputAsChars.length - 1; i >= 0; i--) {
            reversedChars[j] = inputAsChars[i];
            j++;
        }

        String reversedWord = String.valueOf(reversedChars);

        if(inputString.equalsIgnoreCase(reversedWord)) {
            System.out.println("Palindrome.");
        } else {
            System.out.println("Not palindrome.");
        }
    }
}
