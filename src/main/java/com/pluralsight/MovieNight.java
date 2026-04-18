package com.pluralsight;

import java.util.Scanner;

public class MovieNight {

    public static void main(String[] args) {
        // import a Scanner so that you get the user input
        Scanner myScanner = new Scanner(System.in);
        // ask the user for their age and save it in a variable
        System.out.println("What is your name ? ");
        String name = myScanner.nextLine();
// ask the user for their age save it in a variable
        System.out.println("What is your age? ");
        int age = myScanner.nextInt();

        // eat the line so that you get the next input
        myScanner.nextLine();
        // ask the user for their favorite movie save it in a variable
        System.out.println("What is your favorite movie? ");
        String favMovie = myScanner.nextLine();
//      ask the user how many times they watched that movie and save it in a variable
        System.out.println("How many times have you watched this movie");
        int numTimesWatched = myScanner.nextInt();
// eat the line so that you get the next input in a string format
        myScanner.nextLine();
        System.out.println("What is the movie rating out of 10 ");
        double movieRate = myScanner.nextDouble();
        // print out all the variables values on the screen

        System.out.println("---------- Movie Night Summary-------- ");
        System.out.println("Name: " + name);
        System.out.println("Age : " + age);
        System.out.println("Favorite Movie: " + favMovie);
        System.out.println("Times Watched: " + numTimesWatched);
        System.out.println("Your Rating: " + movieRate);
        System.out.println("---------------------------------------");


    }
}
