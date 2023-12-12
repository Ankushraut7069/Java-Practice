package day1;

import java.util.Scanner;

public class LeapYr {
    public static void main(String[] args) {
        int year;

        // Taking input from user using Scanner Class
        // scn is an object made of Scanner Class
        Scanner scn = new Scanner(System.in);
        year = scn.nextInt();

        // 1st condition check- It is century leap year
        // 2nd condition check- It is leap year and not
        // century year
        if ((year % 400 == 0)
                || ((year % 4 == 0) && (year % 100 != 0))) {

            System.out.println(year + " : Leap Year");
        }

        else {
            System.out.println(year + " : Non - Leap Year");
        }
    }
}
