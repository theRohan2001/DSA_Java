//Rupee to USD
package com.rohan;

import java.util.Scanner;

public class rupeesTOusd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an amount in Rupees(₹): ");
        float rupee = input.nextFloat();

        float usd = (float) (rupee * 0.014);
        System.out.println("The above Rupees amount in USD($): " + usd);
    }
}
