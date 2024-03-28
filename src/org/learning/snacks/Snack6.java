package org.learning.snacks;

import java.util.Scanner;

public class Snack6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Insert seconds: ");
        int secondsInput = Integer.parseInt(scan.nextLine());

        int hours, minutes, seconds;

        hours = secondsInput / 3600;
        minutes = (secondsInput / 60) % 60;
        seconds = secondsInput % 60;

        System.out.printf("%02d:%02d:%02d%n", hours, minutes, seconds);
    }
}
