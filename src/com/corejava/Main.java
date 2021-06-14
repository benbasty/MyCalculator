package com.corejava;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("");
        System.out.print("Enter your first number: ");
        int firstNumber = input.nextInt();
        System.out.print("Choose an Operator (+ or - or / or *) ");
        String operator = input.next();
        System.out.print("Enter your first number: ");
        int secondNumber = input.nextInt();
        if(operator.equals("+")){
            System.out.println("Total is " + (firstNumber + secondNumber));
        }
        else if(operator.equals("-")){
            System.out.println("Total is " + (firstNumber - secondNumber));
        }
        else if(operator.equals("/")){
            System.out.println("Total is " + (firstNumber / secondNumber));
        }
        else if(operator.equals("*")){
            System.out.println("Total is " + (firstNumber * secondNumber));
        } else {
            System.out.println("Not Valid Operator");
        }

    }
}
