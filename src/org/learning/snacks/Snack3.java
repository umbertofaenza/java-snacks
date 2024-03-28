package org.learning.snacks;

public class Snack3 {
    public static void main(String[] args) {
        int[] intArr = {1,2,3,4,5,6,7,8,9,10};
        int oddSum = 0;

        for (int i = 0; i < intArr.length; i++) {
            if (i % 2 != 0) {
                oddSum += intArr[i];
            }
        }

        System.out.println(oddSum);
    }
}
