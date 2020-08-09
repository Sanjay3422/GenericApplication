package com.claustroproject.controller.DataStructures;

public class LinkedList<T> {
	
	private T data;
	
	private LinkedList<T> next;
	
	public void add(T data){
		if(this.data == null){
			this.data = data;
			this.next = null;
		} else {
			LinkedList<T> currentNode = this;
			while(currentNode.next != null){
				currentNode = currentNode.next;
			}
			LinkedList<T> newNode = new LinkedList<T>();
			newNode.data = data;
			newNode.next = null;
			currentNode.next = newNode;
		}
	}
	
	public void insert(Integer index, T data){
		if(this.data == null){
			System.out.print("Empty List");
			return;
		}
		LinkedList<T> currentNode = this;
		LinkedList<T> newNode = new LinkedList<>();
		if(index == 0){
			newNode.data = currentNode.data;
			newNode.next = currentNode.next;
			this.data = data;
			this.next = newNode;
			this.printAllList();
			return;
		}
		Integer currentIndex = 0;
		while(currentIndex < index-1 && currentNode != null){
			currentIndex++;
			currentNode = currentNode.next;
		}
		if(currentNode == null){
			System.out.println("Index is out of bounds");
			return;
		}
		newNode.data = data;
		if(currentNode.next == null){
			newNode.next = null;
			currentNode.next = newNode;
		} else {
			newNode.next = currentNode.next;
			currentNode.next = newNode;
		}
		this.printAllList();
	}
	
	public void remove(Integer index){
		if(this.data == null){
			System.out.print("Empty List");
			return;
		}
		LinkedList<T> dataNode = this;
		if(index == 0){
			this.data = dataNode.next.data;
			this.next = dataNode.next.next;
			this.printAllList();
			return;
		}
		Integer currentIndex = 0;
		while(currentIndex < index-1 && dataNode != null){
			currentIndex++;
			dataNode = dataNode.next;
		}
		if(dataNode == null || dataNode.next == null){
			System.out.println("Index is out of bounds");
			return;
		}
		dataNode.next = dataNode.next.next;
		this.printAllList();
	}
	
	public void removeAll(){
		this.data = null;
		this.next = null;
		this.printAllList();
	}

	public void printAllList() {
		if(this.data == null){
			System.out.print("Empty List");
			return;
		} else {
			LinkedList<T> currenNode = this;
			Integer count = 0;
			while(currenNode != null){
				count ++;
				System.out.print(currenNode.data);
				currenNode = currenNode.next;
			}
			System.out.println();
			System.out.println("Size:" + count);
		}
	}
	
	public T data(){
		return this.data;
	}
	
	public LinkedList<T> next(){
		return this.next;
	}
	
	public void setNext(LinkedList<T> next){
		this.next = next;
	}
	
	public void setData(T data){
		this.data = data;
	}
	
}
