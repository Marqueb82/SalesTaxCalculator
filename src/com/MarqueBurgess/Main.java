package com.MarqueBurgess;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Program to calculate sales tax

        Scanner sc = new Scanner(System.in);
        double itemPrice;
        double stateTax = 0;
        float preTaxTotal = 0;
        boolean keepShopping = true;
        String items;
        String stateForTax = " ";
        List<String> itemsPurchased = new ArrayList<String>();

        do { //do while loop
            System.out.println("Enter item purchased: ");
            items = sc.nextLine();
            itemsPurchased.add(items.replaceAll("\\s+","")); //remove white space from items

            System.out.println("Enter item price: ");
            itemPrice = sc.nextDouble();
            preTaxTotal += itemPrice;

            System.out.println("\nKeep Shopping Y/N");
            String readCustomer = sc.next();
            sc.nextLine();
            if(readCustomer.equalsIgnoreCase("y")){
                System.out.print("\n");
                continue;
            }
            else if(readCustomer.equalsIgnoreCase("n"))
            {
                System.out.println("Enter state code for sales tax(Ex...MI for michigan): ");
                stateForTax = sc.next();
                switch(stateForTax){  //switch statement used for all sale tax values
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
                }
                double afterTaxTotal = 0;
                afterTaxTotal = preTaxTotal + (preTaxTotal * stateTax);

                System.out.println("Purchases: " + itemsPurchased.toString().replace("[","").replace("]","")); //remove brackets for list items
                System.out.printf("\nYour current total is %.2f before tax", preTaxTotal); // return values
                System.out.printf("\nYour current total is %.2f after tax", afterTaxTotal); // return values
                keepShopping = false; //escapes loop--ends program
            }

        }while(keepShopping);


    }
}
