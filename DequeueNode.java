package com.bridglab.balancedparanthisis;

public class DequeueNode <E> {
	public E data;
	public DequeueNode<E>next;
	public DequeueNode<E>pre;
	
	public DequeueNode()
	{
		this.next=null;
		this.pre=null;
	}
	
	public DequeueNode(E val)
	{
		this.data=val;
		this.next=null;
		this.pre=null;
	}

}
