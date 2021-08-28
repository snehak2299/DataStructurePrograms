package com.bridglab.balancedparanthisis;

import java.util.Scanner;

public class PalindromeCheck {
	public static void main(String[] args) 
	{
		Scanner u=new Scanner(System.in);
		Dequeue<Character> utility=new Dequeue<Character>();
		System.out.println("Enter a String: ");
		String s=u.next();

		//adding each character to the rear of the deque
		for(int i=0;i<s.length();i++)
		{
			char c =s.charAt(i);
			utility.addRear(c);
		}
		int flag=0;

		while(utility.size()>1)
		{
			if(utility.removeFront()!=utility.removeRear())
			{
				flag=1;
				break;
			}
		}

		if(flag==0)
		{
			System.out.println("String is palindrome");
		}
		else
		{
			System.out.println("String is not palindrome");
		}
	}
}
