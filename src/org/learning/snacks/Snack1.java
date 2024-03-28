package org.learning.snacks;

import java.util.Scanner;

public class Snack1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int numInput;

        do {
            System.out.print("Insert an even number between 10 and 20: ");
            numInput = Integer.parseInt(scan.nextLine());
        } while (numInput < 10 || numInput > 20 || numInput % 2 != 0);

    }
}
