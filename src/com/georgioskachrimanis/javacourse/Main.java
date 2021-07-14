package com.georgioskachrimanis.javacourse;

public class Main {

    public static void main(String[] args) {
        int startingNumber = -10111, finishingNumber = -999;

        while (startingNumber < finishingNumber) {

            startingNumber++;
            if (sumDigits(startingNumber) == -1) {
                continue;
            }
            System.out.println("The digits of number " + startingNumber +
                    " have a sum of " + sumDigits(startingNumber));
        }
    }

    public static int sumDigits(int number) {

        int sumDigit = 0;
        if (number < 10) {
            return -1;
        }

        do {
            int digit = number % 10;
            sumDigit += digit;
            number /= 10;
        } while (number > 0);

        return sumDigit;
    }
}
