//find largest between two numbers
package com.rohan;

import java.util.Scanner;

public class find_largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        if(num1 > num2){
            System.out.println(num1 + " is the largest");
        }
        else{
            System.out.println(num2 + " is the largest");
        }
    }
}
