package gr.aueb.cf.askiseis;

import java.util.Scanner;

public class LeapYearApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = 0;

        while (true) {
        System.out.println("Please insert a year or enter -1 to exit.");
        year = scanner.nextInt();
            if (year == -1) {
                System.out.println("Exiting...");
                break;
            }
        System.out.println("The year " + year + " is a Leap Year: " + isLeapYear(year));
            }
    }

    public static boolean isLeapYear(int year) {
//        boolean leapYear = false;
//        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
//            leapYear = true;
//        }
//            return leapYear;
        return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
    }
}