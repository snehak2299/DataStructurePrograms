package com.bridglab.balancedparanthisis;

public class Dequeue<E> {
	public Dequeue(){	
	}
	
	DequeueNode<E> front;
	DequeueNode<E> rear;
	int size=0;
	
	//add front
	public void addFront(E c)
	{
		if(front==null) //if no element in list
		{
			front.data=c;
			rear=front;
		}
		else  //if element in list
		{
			DequeueNode<E>tNode=null;
			tNode.data=c;
			tNode.next=front;
			front.pre=tNode;
			front=tNode;
		}
		size++;
	}
	
	//add rear
	public void addRear(E c)
	{
		if(front==null) //if no element in list
		{
			DequeueNode<E>tNode=new DequeueNode<E>(c);
			front=tNode;
			rear=front;
		}
		else  //if element in list
		{
			DequeueNode<E>tNode=new DequeueNode<>(c);
			rear.next=tNode;
			tNode.pre=rear;
			rear=tNode;
		}
		size++;
	}
	
	//remove front
	public E removeFront()
	{
		E val=null;
		if(front==null)
		{
			System.out.println("No elements to delete");
		}
		else
		{
			val=front.data;
			front=front.next;
		}
		size--;
		return val;
	}
	
	//remove rear
	public E removeRear()
	{
		E val=null;
		if(front==null)
		{
			System.out.println("No element to delete");
		}
		else
		{
			val=rear.data;
			rear=rear.pre;
			rear.next=null;
		}
		size--;
		return val;
	}
	
	//to remove
	public boolean isEmpty()
	{
		if(front==null)
			return true;
		else
			return false;
	}
 
	//return size of deque
	public int size()
	{
		return size;
	}
}
