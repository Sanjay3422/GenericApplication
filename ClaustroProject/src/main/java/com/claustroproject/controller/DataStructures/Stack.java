package com.claustroproject.controller.DataStructures;

import java.lang.reflect.Array;
import java.util.Arrays;


public class Stack<T> {

	private Integer top;
	
	private T[] array;
	
	private boolean isDynamic;
	
	private static final int INITIAL_SIZE = 1;

	public Stack(){
		this.createStack(INITIAL_SIZE);
		this.isDynamic = true;
	}
	
	public Stack(Integer capacity) {
		this.createStack(capacity);
	}
	
	private void createStack(Integer capacity){
//		this.array = (T[]) Array.newInstance(this.array.getClass(), capacity);
		this.array = (T[]) new Object[capacity];
		this.top = -1;
	}
	
	public boolean isFull(){
		return this.top == this.capacity() - 1;
	}
	
	public Integer capacity(){
		return this.array.length;
	}
	
	public T peek(){
		if(this.top < 0){
			throw new RuntimeException("Stack is Empty");
		}
		return this.array[this.top];
	}
	
	public boolean isEmpty(){
		return this.top == -1;
	}
	
	public void push(T data){
		if(this.isFull()){
			if(isDynamic){
				System.out.println("Stack is full. Doubling Size");
				this.array = Arrays.copyOf(this.array, this.capacity() * 2);
			} else {
				throw new StackOverflowError();
			}
		}
		this.array[++this.top] = data;
	}
	
	public T pop(){
		if(this.isEmpty()){
			throw new RuntimeException("POP cannot be performed, Stack is Empty");
		}
		return this.array[this.top--];
	}
	
	public void emptyStack(){
		this.createStack(this.capacity());
	}
	
}
