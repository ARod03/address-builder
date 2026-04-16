package com.pluralsight;

import java.util.Scanner;

public class AddressBuilder {

    public static Scanner scanner = new Scanner(System.in);

    public static StringBuilder stringBuilder = new StringBuilder();

    public static void main(String[] args) {

        //Get information from the user, starting with their full name
        System.out.println("Please provide the following information: ");
        System.out.println("Full name: ");
        String fullName = scanner.nextLine().trim();

        //Receive parts of the billing address, piece by piece
        System.out.println("Billing Address: ");
        String billingAddress = scanner.nextLine().trim();

        System.out.println("Billing City: ");
        String billingCity = scanner.nextLine().trim();

        System.out.println("Billing State: ");
        String billingState = scanner.nextLine().trim();

        System.out.println("Billing Zip: ");
        String billingZip = scanner.nextLine().trim();

        //Receive parts of the shipping address, piece by piece
        System.out.println("Shipping Address: ");
        String shippingAddress = scanner.nextLine().trim();

        System.out.println("Shipping City: ");
        String shippingCity = scanner.nextLine().trim();

        System.out.println("Shipping State: ");
        String shippingState = scanner.nextLine().trim();

        System.out.println("Shipping Zip: ");
        String shippingZip = scanner.nextLine().trim();

        //Build using the StringBuilder
        stringBuilder.append(fullName).append("\n");
        stringBuilder.append("Billing Address:\n");
        stringBuilder.append(billingAddress).append("\n");
        stringBuilder.append(billingCity).append(", ").append(billingState).append
                (" ").append(billingZip).append("\n\n");

        stringBuilder.append("Shipping Address:\n");
        stringBuilder.append(shippingAddress).append("\n");
        stringBuilder.append(shippingCity).append(", ").append(shippingState).append(" ").append(shippingZip);

        //Display the full result with name, billing, and shipping address in sections
        System.out.println();
        System.out.println(stringBuilder.toString());


    }

}
