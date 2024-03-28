package org.learning.snacks;

import java.util.Arrays;
import java.util.Random;

public class Snack2 {
    public static void main(String[] args) {
        Random randomGen = new Random();

        String[] firstNames = {"John", "Paul", "George", "Ringo"};
        String[] lastNames = {"Lennon", "Mccartney", "Harrison", "Starr"};
        String[] guestList = new String[10];

        for (int i = 0; i < guestList.length; i++) {
            int randomFirstNameIndex = randomGen.nextInt(firstNames.length);
            int randomLastNameIndex = randomGen.nextInt(lastNames.length);
            String newGuest = firstNames[randomFirstNameIndex] + " " + lastNames[randomLastNameIndex];

            guestList[i] = newGuest;
        }

        System.out.println(Arrays.toString(guestList));
    }
}
