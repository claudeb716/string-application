package com.pluralsight;

public class VariableApp {
    public static void main(String[] args) {
        // 1. Declare a variable to store your favorite color
        String favColor;
        favColor = "Red";
        System.out.println("1.Favorite color is:" + favColor);

        // Declare a variable to store the year you started this class
        int CLASS_YEAR;
        CLASS_YEAR = 2026;
        System.out.println("2.Class of" + " " + CLASS_YEAR);

        // Declare a variable to store your middle initial
        char MIDDLE_I;
        MIDDLE_I = 'A';
        System.out.println( "3.Middle Initial is" + " " + MIDDLE_I);

        // Declare a variable to store whether you have pets (yes/no)
        boolean isHasPet;
        isHasPet = true;
        System.out.println("4.Do you have a pet?" + " " + isHasPet);

        // Declare a variable with a nice message or saying
        String niceMessage;
        niceMessage = "5.May the odds ever be in your favor.";
        System.out.println(niceMessage);

        System.out.println("===========================================");

        int DAYS_IN_WEEK =5;
        double coffeePrice = 4.99;
        char favLetter = 'C';
        boolean isRaining = false;
        System.out.println("1.There is" + " " + DAYS_IN_WEEK + " " + "Days a week.");
        System.out.println("2.Your coffee will be:" + " " + coffeePrice);
        System.out.println("3.My favorite letter is:" + " " + favLetter);
        System.out.println("4.Is it raining ?" + " " + isRaining);
    }
}
