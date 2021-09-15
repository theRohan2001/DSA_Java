package com.rohan;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        int i;

        for (i = 1; i <= 10; i++){
            System.out.println(num * i);
        }
    }
}
