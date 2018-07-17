package com.MarqueBurgess;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// Program to calculate sales tax

        Scanner sc = new Scanner(System.in);
        double itemPrice = 0;
        double stateTax = 0;
        float preTaxTotal = 0;
        boolean keepShopping = true;
        String items = " ";
        String stateForTax = " ";
        ItemsPurchased cartItem; //Object for items with 2 parameters of item name and price
        List<ItemsPurchased> paidItems = new ArrayList<>(); //Array list to hold items

        do { //do while loop
            try {
                System.out.println("Enter item purchased: ");
                items = sc.nextLine();
                System.out.println("Enter item price: ");
                itemPrice = sc.nextDouble();
            }catch(InputMismatchException ex){ //catching incorrect input for price
                System.out.println("Incorrect value.....Try again.");
                sc.nextLine(); //grabs extra return to avoid skipping line
                continue;
            }

            cartItem = new ItemsPurchased(items,itemPrice);
            paidItems.add(cartItem);

            preTaxTotal += itemPrice;

            System.out.println("\nKeep Shopping Y/N");
            String readCustomer = sc.next();
            sc.nextLine();
            if(readCustomer.equalsIgnoreCase("y")){
                System.out.print("\n");
                continue;
            }
            else if(readCustomer.equalsIgnoreCase("n")) {
                System.out.println("Enter state postal code for sales tax(Ex...MI for michigan): ");
                stateForTax = sc.next();
                switch (stateForTax) {  //switch statement used for all sale tax values
                    case "MI":          //each case is salesTax for specified state
                        stateTax = 0.06;
                        break;
                    case "IL":
                        stateTax = 0.0625;
                        break;
                    case "IN":
                        stateTax = 0.07;
                        break;
                    case "OH":
                        stateTax = 0.0714;
                        break;
                    case "AL":
                        stateTax = 0.0901;
                        break;
                    case "OK":
                        stateTax = 0.086;
                        break;
                    case "WI":
                        stateTax = 0.0542;
                        break;
                    case "MN":
                        stateTax = 0.073;
                        break;
                    case "ND":
                        stateTax = 0.0678;
                        break;
                    case "MT":
                        stateTax = 0.0;
                        break;
                    case "ID":
                        stateTax = 0.0603;
                        break;
                    case "WA":
                        stateTax = 0.0892;
                        break;
                    case "OR":
                        stateTax = 0.0;
                        break;
                    case "WY":
                        stateTax = 0.054;
                        break;
                    case "SD":
                        stateTax = 0.0639;
                        break;
                    case "IA":
                        stateTax = 0.068;
                        break;
                    case "PA":
                        stateTax = 0.0634;
                        break;
                    case "NY":
                        stateTax = 0.0849;
                        break;
                    case "VT":
                        stateTax = 0.0618;
                        break;
                    case "ME":
                        stateTax = 0.055;
                        break;
                    case "MA":
                        stateTax = 0.0625;
                        break;
                    case "RI":
                        stateTax = 0.07;
                        break;
                    case "CT":
                        stateTax = 0.0635;
                        break;
                    case "NJ":
                        stateTax = 0.0685;
                        break;
                    case "MD":
                        stateTax = 0.06;
                        break;
                    case "DC":
                        stateTax = 0.0575;
                        break;
                    case "VA":
                        stateTax = 0.0563;
                        break;
                    case "NC":
                        stateTax = 0.069;
                        break;
                    case "SC":
                        stateTax = 0.0722;
                        break;
                    case "GA":
                        stateTax = 0.07;
                        break;
                    case "FL":
                        stateTax = 0.068;
                        break;
                    case "WV":
                        stateTax = 0.0629;
                        break;
                    case "KY":
                        stateTax = 0.06;
                        break;
                    case "TN":
                        stateTax = 0.0946;
                        break;
                    case "MS":
                        stateTax = 0.0707;
                        break;
                    case "MO":
                        stateTax = 0.0789;
                        break;
                    case "AR":
                        stateTax = 0.093;
                        break;
                    case "LA":
                        stateTax = 0.0998;
                        break;
                    case "TX":
                        stateTax = 0.0819;
                        break;
                    case "KS":
                        stateTax = 0.0862;
                        break;
                    case "NE":
                        stateTax = 0.0689;
                        break;
                    case "CO":
                        stateTax = 0.075;
                        break;
                    case "AZ":
                        stateTax = 0.0825;
                        break;
                    case "UT":
                        stateTax = 0.0676;
                        break;
                    case "NV":
                        stateTax = 0.0798;
                        break;
                    case "CA":
                        stateTax = 0.0825;
                        break;
                    case "AK":
                        stateTax = 0.0176;
                        break;
                    case "HI":
                        stateTax = 0.0435;
                        break;
                    case "NH":
                        stateTax = 0.0;
                        break;
                    default:
                        System.out.println("No match, state tax set to 0.\n");
                        stateTax = 0.0;
                        break;
                }
            }
            else{
                System.out.println("Invalid Input");
                continue;
            }
                double afterTaxTotal = 0;
                afterTaxTotal = preTaxTotal + (preTaxTotal * stateTax);

                System.out.println("Purchases: ");
                System.out.println("____________________________");
                for (Object obj : paidItems) {
                    System.out.println(obj.toString()); //calls method for printing Object items in list
                }
                System.out.println(stateForTax + " is " + (((float) stateTax*100)) + " percent.");
                System.out.printf("\nYour current total is %.2f before tax", preTaxTotal); // return values
                System.out.printf("\nYour current total is %.2f after tax", afterTaxTotal); // return values
                keepShopping = false; //escapes loop--ends program


        }while(keepShopping);


    }
}