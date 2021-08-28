package com.bridglab.balancedparanthisis;

import java.util.Scanner;

public class BalancedParanthisis {

	public static void main(String[] args) {
		
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter max lenght: "); //length of stack
			int n=sc.nextInt();
		
			StackL stack = new StackL(n); //create stack
			System.out.println();
			 
			System.out.println("Enter expression: "); // enter expression
			String exp = sc.next();        
			int len = exp.length();
			System.out.println("check expression parantheses mathcing or not: ");

			for (int i = 0; i < len; i++)
			{    
			char ch = exp.charAt(i);

				if (ch == '(')
				{
				stack.push(i);
				}
					else if (ch == ')')
					{
						try
						{
						long p = (stack.pop() + 1);
						System.out.println("')' at index "+(i+1)+" matched with '(' at index "+p);
						System.out.println("True");
						}
						catch(Exception e)
						{
						System.out.println("')' at index "+(i+1)+" is unmatched");
						System.out.println("False");
						}
					}            
				}
			while (!stack.isEmpty() )
			{
			System.out.println("'(' at index "+(stack.pop() +1)+" is unmatched");
			}                          
	    

	}

}
