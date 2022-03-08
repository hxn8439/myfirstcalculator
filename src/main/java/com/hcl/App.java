package com.hcl;

import java.util.Scanner;

/**
 * Hello world! We need to build a calculator based Command line app where for
 * each operation, it should take 2 numbers and either add, substract, multiply
 * and divide, add
 * 
 * The based application involves prompting the user for 2 number and implement
 * only add
 * 
 * You have to have a menu driven application, where it show a banner and it
 * show "add, substract, multiply, divide" and if you select add or substract,
 * it should prompt for 2 number and the op and do the operation and show the
 * results and keep prompting the user with the same menu.
 * 
 * the 2 key requirement is it should have a basic banner and it should also be
 * menu driven
 */
public class App {
	
	public static void add(int firstN, int secondN)
	{
	    int sum = firstN+secondN;
	    
	    System.out.printf("Sum of %d and %d = %d", firstN, secondN, sum);
	    System.out.println("\n");
	}
	
	public static void subtract(int firstN, int secondN)
	{
		int sum = firstN-secondN;
	    
	    System.out.printf("Subtraction of %d and %d = %d", firstN, secondN, sum);
	    System.out.println("\n");
	}
	
	public static void divide(int firstN, int secondN)
	{
		int sum = firstN/secondN;
	    
	    System.out.printf("division of %d and %d = %d", firstN, secondN, sum);
	    System.out.println("\n");
	}
	
	
	public static void multiply(int firstN, int secondN)
	{
		int sum = firstN*secondN;
	    
	    System.out.printf("Multiplication of %d and %d = %d", firstN, secondN, sum);
	    System.out.println("\n");
	}
	
	
	
	
	
	public static void main(String[] args) 
	{
		//Poor mans banner
		System.out.println("Welcome to a simple calculator (^>=<^) ");
		
		// creates an object of Scanner
	    Scanner input = new Scanner(System.in);

	    System.out.print("Enter first number: ");

	    // takes 1st number
	    int firstNumber = input.nextInt();

	    // prints the name
	    System.out.println("Enter second number: ");
	    
	    // takes 2st number
	    int secondNumber = input.nextInt();
	    
	    boolean state = true;
	    
	    while(state)
	    {
	    	System.out.println("\n please enter number which math operations do you want to perform? ");
	    	System.out.println("1.Addition");
	    	System.out.println("2.Subtraction");
	    	System.out.println("3.Multiplication");
	    	System.out.println("4.Division");
	    	System.out.println("5.Exit program");
	    	System.out.println("\n");
	    	
	    	int mathinput=input.nextInt();
	    	
	    	if(mathinput == 1)
	    	{
	    		add(firstNumber, secondNumber);
	    	}	
	    	
	    	if(mathinput == 2)
	    	{
	    		subtract(firstNumber, secondNumber);
	    	}	
	    	
	    	if(mathinput == 3)
	    	{
	    		multiply(firstNumber, secondNumber);
	    	}	
	    	
	    	if(mathinput == 4)
	    	{
	    		divide(firstNumber, secondNumber);
	    	}	
	    	
	    	if(mathinput == 5)
	    	{
	    		state = false;
	    	}	

	    }	
	    
	    System.out.println("Program exits...Have a nice day!! :) ");
	    
	    // closes the scanner
	    input.close();
	}
}
