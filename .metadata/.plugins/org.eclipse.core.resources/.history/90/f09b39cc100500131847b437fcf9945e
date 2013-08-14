package com.github.Comrod.Java.Development;

import java.util.Scanner;

public class Calculator
{
	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		int answer;
		
		System.out.print("Enter the first number: ");
		String input1 = scanner.nextLine();
		System.out.print("Your first number was " + input1);
		int int1 = Integer.valueOf(input1);
		
		System.out.print(". Enter a second number: ");
		String input2 = scanner.nextLine();
		System.out.println("Your second number was " + input2);
		int int2 = Integer.valueOf(input2);
		
		System.out.print("Do you want to add, subtract, multiply, or divide ");
		String operatorinput = scanner.nextLine();
		
		if(operatorinput.equals("add") || operatorinput.equals("Add"))
		{
			answer = int1 + int2;
			System.out.println("You chose addition. Your answer is: " + answer);
		}
		else if(operatorinput.equals("subtract") || operatorinput.equals("Subtract"))
		{
			answer = int1 - int2;
			System.out.println("You chose subtraction. Your answer is: " + answer);
		}
		else if(operatorinput.equals("multiply") || operatorinput.equals("Multiply"))
		{
			answer = int1 * int2;
			System.out.println("You chose multiplicaton. Your answer is: " + answer);
		}
		else if(operatorinput.equals("divide") || operatorinput.equals("Divide"))
		{
			answer = int1 / int2;
			System.out.println("You chose division. Your answer is: " + answer);
		}
	}

}
