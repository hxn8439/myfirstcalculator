package com.hcl;

import java.util.Scanner;

import java.io.IOException;
import java.io.FileWriter;
import java.io.File;
import java.io.BufferedWriter;

import java.nio.file.Files;
import java.nio.file.Path;

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
	
	public static void add(int firstN, int secondN, String file) throws IOException
	{
		int output = firstN+secondN;
	    System.out.printf("Sum of %d and %d = %d", firstN, secondN, output);
	    System.out.println("\n");
	    
	    String oper = "+";
	    String row = oper+","+firstN+","+secondN+","+output;
	    
	    try 
	    {
	    	BufferedWriter w = new BufferedWriter(new FileWriter(file, true));
	    	w.write(row);
	    	w.write("\r");
	    	w.close();
	    }
	    
	    catch (IOException e)
	    {
	    	e.getStackTrace();
	    }
		
	}
	
	public static void subtract(int firstN, int secondN, String file) throws IOException
	{
		int output = firstN-secondN;
	    System.out.printf("Subtraction of %d and %d = %d", firstN, secondN, output);
	    System.out.println("\n");
	    
	    String oper = "-";
	    String row = oper+","+firstN+","+secondN+","+output;
	    
	    try 
	    {
	    	BufferedWriter w = new BufferedWriter(new FileWriter(file, true));
	    	w.write(row);
	    	w.write("\r");
	    	w.close();
	    }
	    
	    catch (IOException e)
	    {
	    	e.getStackTrace();
	    }
	}
	
	public static void divide(int firstN, int secondN, String file) throws IOException
	{
		int output = firstN/secondN;
	    System.out.printf("Division of %d and %d = %d", firstN, secondN, output);
	    System.out.println("\n");
	    
	    String oper = "/";
	    String row = oper+","+firstN+","+secondN+","+output;
	    
	    try 
	    {
	    	BufferedWriter w = new BufferedWriter(new FileWriter(file, true));
	    	w.write(row);
	    	w.write("\r");
	    	w.close();
	    }
	    
	    catch (IOException e)
	    {
	    	e.getStackTrace();
	    }
		
	}
	
	public static void multiply(int firstN, int secondN, String file) throws IOException
	{
		int output = firstN+secondN;
	    System.out.printf("Multiplication of %d and %d = %d", firstN, secondN, output);
	    System.out.println("\n");
	    
	    String oper = "*";
	    String row = oper+","+firstN+","+secondN+","+output;
	    
	    try 
	    {
	    	BufferedWriter w = new BufferedWriter(new FileWriter(file, true));
	    	w.write(row);
	    	w.write("\r");
	    	w.close();
	    }
	    
	    catch (IOException e)
	    {
	    	e.getStackTrace();
	    }
	}
	
	public static void View(String file) throws IOException
	{
		Path filename = Path.of(file);
		String content = Files.readString(filename);
		System.out.println(content);
	}
	
	public static void main(String[] args) throws IOException
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
	    
	    String filename = "/Users/hamil/myfirstcalculator/src/main/java/com/hcl/output.txt";
	    
	    File f1 = new File(filename);
	    
        if(!f1.exists()) 
        {
           f1.createNewFile();
        } 
	    
	    while(state)
	    {
	    	System.out.println("\n please enter number which math operations do you want to perform? ");
	    	System.out.println("1.Addition");
	    	System.out.println("2.Subtraction");
	    	System.out.println("3.Multiplication");
	    	System.out.println("4.Division");
	    	System.out.println("5.Exit program");
	    	System.out.println("6.View File");
	    	System.out.println("\n");
	    	
	    	int mathinput=input.nextInt();
	    	
	    	if(mathinput == 1)
	    	{
	    		add(firstNumber, secondNumber, filename);
	    	}	
	    	
	    	else if(mathinput == 2)
	    	{
	    		subtract(firstNumber, secondNumber, filename);
	    	}	
	    	
	    	else if(mathinput == 3)
	    	{
	    		multiply(firstNumber, secondNumber, filename);
	    	}	
	    	
	    	else if(mathinput == 4)
	    	{
	    		divide(firstNumber, secondNumber, filename);
	    	}	
	    	
	    	else if(mathinput == 5)
	    	{
	    		state = false;
	    	}
	    	
	    	else if(mathinput == 6)
	    	{
	    		View(filename);
	    	}	
	    }	
	    
	    System.out.println("Program exits...Have a nice day!! :) ");
	    
	    // closes the scanner
	    input.close();
	}
}
