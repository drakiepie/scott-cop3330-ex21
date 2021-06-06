package org.example;
import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Exercise 21 Solution
 *  Copyright 2021 Drake Scott
 */

public class ex21 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Please enter the number of the month: ");
        int num = input.nextInt();
        String monthName = "";
        int i = 0;

        switch (num) {
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "Juney";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "November";
                break;
            case 12:
                monthName = "December";
                break;
            default:
                i = 1;
        }

        String outputString;
        if(i==1){
            outputString = "Invalid number entered";
        } else {
            outputString = "The name of the month is " + monthName + ".";
        }

        System.out.println(outputString);

    }
}
