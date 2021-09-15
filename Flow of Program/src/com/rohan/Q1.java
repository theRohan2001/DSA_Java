package com.rohan;

//find out the entered year is a leap year or not
import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
        System.out.print("Enter a year: ");
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();

        if(year % 4 == 0){
            if(year % 100 == 0){
                System.out.println(year + " is not a leap year");
                return;
            }
            else if(year % 400 == 0){
                System.out.println(year + " is a leap year");
            }
            System.out.println(year + " is a leap year");
        }
        else{
            System.out.println(year + " is not a leap year");
        }
    }
}
