package com.pluralsight;

import java.util.Scanner;

public class DealershipApp {
    public static Scanner myScanner = new Scanner(System.in);
    public static void main(String[] args) {
        boolean home = true;

        while (home) {


        System.out.println("\n\nDealership App");
        System.out.println("Select an Option");
        System.out.println("\n1) Sell a Vehicle 2) Lease a Vehicle\nX) Exit");
        String userInput = myScanner.nextLine();

        switch (userInput) {
            case "1":
                boolean sell = true;

                while (sell) {

                    System.out.println("Sell a Vehicle");
                    System.out.println("Enter Name: ");
                    String userName = myScanner.nextLine();
                    System.out.println("Email: ");
                    String userEmail = myScanner.nextLine();
                    



                }




                break;
            case "2":
                boolean lease = true;
                while (lease) {

                    System.out.println("Lease a Vehicle");




                }
                break;
            case "X", "x":
                home = false;
            default:
                System.out.println("Select a Valid Option");


        }


    }

    }




}
