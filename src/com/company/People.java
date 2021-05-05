package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class People {
    private List<String> names = new ArrayList<>();
    private int total;

//    constructor for the class
    public People(){
        while(1 != 0){
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
            String choice;
            Scanner in = new Scanner(System.in);
            System.out.println("1. Adding the person to the trip.");
            System.out.println("2. Exit");
            System.out.print("Enter the choice: ");
            choice = in.nextLine();
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
            if (choice.equals("1")){
                Scanner input = new Scanner(System.in);
                System.out.print("Enter the name of the person: ");
                String name = input.nextLine();
                names.add(name);
            }else if (choice.equals("2")){
                total = names.size();
                System.out.print("Total number of people: " + total);
                System.out.println();
                System.out.println();
                expense();
            }
        }
    }

//    function for the expenses for the trip
    public void expense() {
        int quantity;
        List<String> expenseNames = new ArrayList<>();
        int price;
        String name;
        int totalPrice = 0;
        while (1 != 0) {
            System.out.println("-------------------------------------------------------------------");
            Scanner in = new Scanner(System.in);
            System.out.println("1. For adding the expense\n" +
                    "2. Get total\n" +
                    "3. End of trip");
            System.out.print("Enter the choice: ");
            String choice;
            choice = in.next();
            System.out.println("-------------------------------------------------------------------");
            if (choice.equals("1")) {
                Scanner in1 = new Scanner(System.in);
                System.out.println("======================================================");
                System.out.print("Enter the name of the Expense: ");
                name = in1.nextLine();
                expenseNames.add(name);
                System.out.print("Enter the number of the people buys it: ");
                quantity = in1.nextInt();
                if (quantity > name.length()) {
                    System.out.println("You have more quantity than the total number of peoples, Please dont waste money....!");
                }
                System.out.print("Enter the price of single product: ");
                price = in1.nextInt();
                price = price * quantity;
                totalPrice += price;
                System.out.println("======================================================");
            } else if (choice.equals("2")) {
                System.out.println("======================================================");
                System.out.println("You have purchased items: ");
                for (int i = 0; i < expenseNames.size(); i++) {
                    System.out.println(expenseNames.get(i));
                }
                System.out.println("The total cost is " + totalPrice + "/- Rs");
                System.out.println("======================================================");
            } else if (choice.equals("3")) {
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                int totalPay = totalPrice / names.size();
                System.out.println(Place.getName() + "Trip");
                System.out.println("Number of people joined: " + names.size());
                System.out.println("Each person has to pay: " + totalPay + "/- Rs");
                System.out.println("Hope you have a nice Trip......! :)");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                break;
            }
        }
    }}

