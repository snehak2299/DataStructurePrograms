package com.bridglab.balancedparanthisis;

public class StackL {
	private int maxSize;
	private long[] stackArray;
	private int top;

	//for size  
	public StackL(int s)
	{
	maxSize = s;
	stackArray = new long[maxSize];
	top = -1;
	}
   
	public void push(long j) //push operation
	{
	stackArray[++top] = j;
	}   
	public long pop() //for pop
	{
	return stackArray[top--];
	}
  
	public long peek() //for peek 
	{
	return stackArray[top];
	}
		   
	public boolean isEmpty() //to check whether stack is empty
	{
	return (top == -1);
	}
		   
	public boolean isFull() //to check whether stack is full
	{
	return (top == maxSize - 1);
	}
}
