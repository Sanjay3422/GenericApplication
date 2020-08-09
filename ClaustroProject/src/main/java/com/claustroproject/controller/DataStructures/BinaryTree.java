package com.claustroproject.controller.DataStructures;


public class BinaryTree<T> {
	
	private T data;
	
	private BinaryTree<T> leftNode;
	
	private BinaryTree<T> rightNode;

	BinaryTree(){
		this.data = null;
		this.leftNode = null;
		this.rightNode = null;
	}
	
	public void insert(T data){
		if(data  == null) return;
		Queue<BinaryTree<T>> dataQueue = new Queue<>();
		BinaryTree<T> root = this;
		if(root.data == null){
			this.data = data;
			dataQueue.enqueue(this);
		} else {
			while(!dataQueue.isEmpty()){
				BinaryTree<T> temp = dataQueue.dequeue();
				if(temp.leftNode != null){
					dataQueue.enqueue(temp.leftNode);
				} else {
					BinaryTree<T> newNode = new BinaryTree<>();
					newNode.data = data;
					temp.leftNode = newNode;
					dataQueue = null;
					break;
				}
				if(temp.rightNode != null){
					dataQueue.enqueue(temp.leftNode);
				} else {
					BinaryTree<T> newNode = new BinaryTree<>();
					newNode.data = data;
					temp.rightNode = newNode;
					dataQueue = null;
					break;
				}
			}
		}
	}
	
	public boolean find(T data){
		// this can be done without recursion also, with queue
		return findTraversal(this, data) != null;
	}
	
	private BinaryTree<T> findTraversal(BinaryTree<T> root, T data){
		if(root == null || root.data == null){
			return null;
		}
		if(root.data.equals(data)){
			return root;
		}
		BinaryTree<T> temp = findTraversal(root.leftNode, data);
		if(temp != null){
			return temp;
		}
		return findTraversal(root.rightNode, data);
	}
	
	public Integer findMax(){
		return recursiveMaximum(this);
	}
	
	private Integer recursiveMaximum(BinaryTree<T> root){
		Integer max = 0;
		if(root == null || root.data == null){
			System.out.println("Binary tree is empty");
			return max;
		}
		Integer rootValue = (Integer) root.data; 
		Integer left = recursiveMaximum(root.leftNode);
		Integer right = recursiveMaximum(root.leftNode);
		if(left > right){
			max = left;
		} else {
			max = right;
		}
		if(rootValue > max) {
			max = rootValue;
		}
		return max;
		
	}
	
	public Integer treeHeight(){
		if(this == null || this.data == null){
			return 0;
		}
		Integer level =0;
		Queue<BinaryTree<T>> dataQueue = new Queue<>();
		BinaryTree<T> root = this;
		dataQueue.enqueue(null);
		while(!dataQueue.isEmpty()){
			root = dataQueue.dequeue();
			if(root == null){
				if(!dataQueue.isEmpty()){
					dataQueue.enqueue(null);
				}
				level++;
			} else {
				if(root.leftNode != null){
					dataQueue.enqueue(root.leftNode);
				}
				if(root.rightNode != null){
					dataQueue.enqueue(root.leftNode);
				}
			}
		}
		return level;
	}

}

