package com.sha.algos.ds;

public class Stack {
	private int[] elements;
	private int top;
	
	public Stack(int size) {
		this.elements = new int[size];
		top = -1;
	}
	
	public void push(int elem) {
		this.elements[++ this.top] = elem;
	}
	
	public int pop() {
		return this.elements[this.top --];
	}
}
