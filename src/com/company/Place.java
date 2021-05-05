package com.company;

import java.util.Scanner;

public class Place {
    private static String placeName;

//    constructor for the class
    public Place(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the place name: ");
        placeName = in.nextLine();
    }
    public static String getName(){
        return placeName;
    }

}
