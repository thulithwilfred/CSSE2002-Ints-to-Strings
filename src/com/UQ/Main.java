package com.UQ;

/*Implement a method String num(int value) which, for 0 < value < 10, returns the name
        of the number, otherwise returns "??". This should be done twice, each time using one of the
        methods listed below:
        1. A switch statement
        2. An array of Strings
         */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner usrIn =  new Scanner(System.in);

        while (true) {

            System.out.println("Enter a Number to Process");

            /* Error Handling - Only Accept Ints*/
            if(!usrIn.hasNextInt()) {
                usrIn.next();
                System.out.println("Incorrect Type\n\r");
                continue;
            }

            /* 1. Returns the int -> Words with Switch */
            //System.out.println(retNumNameSwitch(usrIn.nextInt()));

            /* 2. Returns the int -> Words with Strign Array */
            System.out.println(retNumNameArr(usrIn.nextInt()));

        }
    }

    public static boolean inRange(int test, int min, int max) {
        return test > min && test < max;
    }

    public static String retNumNameArr (int var) {

        String [] numStrings = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        if (inRange(var, 0, 10)) {
            return numStrings[--var];
        } else {
            return "??";
        }

    }

    public static String retNumNameSwitch(int var) {
        String numVal;

        switch (var) {
            case 1:
                return "One";
            case 2:
                return "Two";
            case 3:
                return "Three";
            case 4:
                return "Four";
            case 5:
                return "Five";
            case 6:
                return "Six";
            case 7:
                return "Seven";
            case 8:
                return "Eight";
            case 9:
                return "Nice";
            default:
                return "??";
        }
    }
}
