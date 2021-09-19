//Calculator
package com.rohan;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.print("Enter two numbers: ");
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int result = 0;
        System.out.println("Enter an operator(+, -, /, *): ");
        char op = input.next().charAt(0);

        if(op == '+'){
            result = num1 + num2;
        }
        else if(op == '-'){
            result = num1 - num2;
        }
        else if(op == '*'){
            result = num1 * num2;
        }
        else if(op == '/'){
            result = num1 / num2;
        }
        else{
            System.out.print("Invalid Operator");
        }

        System.out.println("The result is " + result);
    }
}
