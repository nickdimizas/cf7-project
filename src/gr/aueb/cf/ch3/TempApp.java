package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * lamvanei mia thermokrasia apo ton xrhsth
 * kai emfanizei katallilo mhnuma.
 */
public class TempApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int temp = 0;
        boolean isTempBelowZero;

        System.out.println("Please insert the current temperature");
        temp = in.nextInt();

        isTempBelowZero = temp < 0;

        System.out.println("Temperature is below zero:" + isTempBelowZero);
    }
}
