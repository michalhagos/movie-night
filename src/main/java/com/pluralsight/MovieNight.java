package com.pluralsight;

import java.util.Scanner;

public class MovieNight {
    public static void main(String[] args) {
        // import a Scanner so that you get the user input
        Scanner myScanner = new Scanner(System.in);
        // ask the user for their age
        System.out.println("What is your name ? ");
        String name = myScanner.nextLine();

        System.out.println("What is your age? ");
        int  age = myScanner.nextInt();

        // eat the line so that you get the next input
        myScanner.nextLine();
        System.out.println("What is your favorite movie? ");
        String favMovie = myScanner.nextLine();

        System.out.println("How many times have you watched this movie");
        int numTimesWatched   = myScanner.nextInt();
// eat the line so that you get the next input in a string format
        myScanner.nextLine();
        System.out.println("What is the movie rating out of 10 ");
        double movieRate = myScanner.nextDouble();




    }
}
