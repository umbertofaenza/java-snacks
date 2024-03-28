package org.learning.snacks;

import java.util.Scanner;

public class Snack5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        char[] symbols = "/*!@#$%^&*()\"{}_[]|\\?/<>,.".toCharArray();
        int[] numbers = {0,1,2,3,4,5,6,7,8,9};

        int letterCount = 0, symbolsCount = 0, numbersCount = 0;


        System.out.print("Insert a string: ");
        char[] inputString = scan.nextLine().trim().toCharArray();

        for(int i = 0; i < inputString.length; i++) {
            // check letters
            for (int j = 0; j < alphabet.length; j++) {
                if(inputString[i] == alphabet[j]) {
                    letterCount++;
                }
            }

            // check symbols
            for (int x = 0; x < symbols.length; x++) {
                if(inputString[i] == symbols[x]) {
                    symbolsCount++;
                }
            }

            // check numbers
            for (int y = 0; y < numbers.length; y++) {
                if(String.valueOf(inputString[i]).equals(Integer.toString(numbers[y]))) {
                    numbersCount++;
                }
            }
        }

        System.out.println("Letters: " + letterCount);
        System.out.println("Symbols: " + symbolsCount);
        System.out.println("Numbers: " + numbersCount);
    }
}
