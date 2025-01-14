package com.example.project;

public class IdGenerate{ //This class contains statics variable and methods, you do not initalize an object to use it.
    // static variables
    private static String currentID = "99";

    // private constructor for a utility class
    private IdGenerate () {}

    // getter method for static variables
    public static String getCurrentId() {return currentID;}

    // sets currentID back to 99
    public static void reset() {currentID = "99";}

    // generates a new id, when called it will increment the currentId by 1.
    public static void generateID() {
        currentID = Integer.toString(Integer.valueOf(currentID) + 1);
    } 
}