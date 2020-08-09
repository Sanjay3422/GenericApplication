package com.claustroproject.controller.DataStructures;

import javax.management.RuntimeErrorException;

/**
 * Queue implementation using Linked list
 * 
 * @author Sanju
 *
 * @param <T>
 */
public class QueueLinked<T> {

	LinkedList<T> front;
	
	LinkedList<T> rear;
	
	public QueueLinked() {
		this.front = null;
		this.rear = null;
	}
	
	public boolean isEmpty(){
		return this.front == null && this.rear == null;
	}
	
	public T frontElement(){
		if(isEmpty()){
			throw new RuntimeException("Queue is Empty");
		}
		return this.front.data();
	}
	
	public T rearElement(){
		if(isEmpty()){
			throw new RuntimeException("Queue is Empty");
		}
		return this.rear.data();
	}
	
	public void enqueue(T data){
		LinkedList<T> temp = new LinkedList<>();
		temp.add(data);
		if(this.front == null && this.rear ==  null){
			this.front = temp;
			this.rear = temp;
		}
		this.rear.setNext(temp);
		this.rear = temp;
	}
	
	public T dequeue(){
		if(isEmpty()){
			throw new RuntimeException("Empty Queueu");
		}
		T data = this.frontElement();
		if(this.front.equals(this.rear)){
			this.front = null;
			this.rear = null;
			return data;
		}
		this.front = this.front.next();
		return data;
	}
	
	public Integer size(){
		if(isEmpty()){
			throw new RuntimeException("Queue is empty");
		}
		LinkedList<T> temp = this.front;
		Integer count = 0;
		if(this.rear == null && this.front == null){
			return count;
		}
		if(temp == this.rear){
			count++;
		}
		while(temp != this.rear){
			count++;
			temp = temp.next();
		}
		return count;
	}
}
