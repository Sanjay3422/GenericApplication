package com.claustroproject.controller.DataStructures;

import java.util.Arrays;

/**
 * Queue Implementation using Array
 * 
 * @author Sanju
 *
 * @param <T>
 */
public class Queue<T> {

	private static final int INITIAL_SIZE = 1;

	private Integer front;
	
	private Integer rear;
	
	private Integer size;
	
	private T[] array;
	
	boolean isDynamic = false;
	
	public Queue() {
		this.createQueue(INITIAL_SIZE);
		isDynamic = true;
	}

	public Queue(Integer capacity){
		this.createQueue(capacity);
	}
	
	private void createQueue(Integer capacity) {
		this.front = -1;
		this.rear = -1;
		this.size = 0;
		this.array = (T[]) new Object[capacity];
	}
	
	public Integer capacity(){
		return this.array.length;
	}
	
	public boolean isFull(){
		return this.size == this.capacity();
	}
	
	public boolean isEmpty(){
		return this.size == 0;
	}
	
	public T frontElement(){
		if(isEmpty()){
			throw new RuntimeException("Queue is Empty");
		}
		return this.array[this.front];
	}
	
	public T rearElement(){
		if(isEmpty()){
			throw new RuntimeException("Queue is Empty");
		}
		return this.array[this.rear];
	}
	
	public void enqueue(T data){
		if(isFull()){
			if(isDynamic){
				this.doubleCapacity();
			} else {
				throw new RuntimeException("Queue is Full");
			}
		}
		this.rear = (this.rear + 1) % this.capacity();
		this.array[this.rear] = data;
		if(this.front == -1){
			this.front = this.rear;
		}
		this.size++;
	}
	
	public T dequeue(){
		T dataReady;
		if(isEmpty()){
			throw new RuntimeException("Queue is Empty");
		}
		dataReady = this.array[this.front];
		if(this.front == this.rear){
			this.front = -1;
			this.rear = -1;
			this.size = 0;
			return dataReady;
		} 
		this.front = (this.front + 1) % this.capacity();
		this.size--;
		return dataReady;
	}
	
	private void doubleCapacity(){
		System.out.println("Queue is full, doubling capacity");
		this.array = Arrays.copyOf(this.array, this.capacity() *2);
		if(this.front > this.rear){
			for(int i =0; i< this.front; i++){
				this.array[i + this.size] = this.array[i];
			}
			this.rear = this.rear + this.size;
		}
	}
	
}
