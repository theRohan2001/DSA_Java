//find SI
package com.rohan;

import java.util.Scanner;

public class simple_interest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the principle amount: ");
        int pr = input.nextInt();
        System.out.print("Enter the time(in years): ");
        int year = input.nextInt();
        System.out.print("Enter the interest rate(in percentage): ");
        float rate = input.nextFloat();

        float SI = (pr * year * rate) / 100;
        System.out.println("The Simple Interest is " + SI);
    }
}
