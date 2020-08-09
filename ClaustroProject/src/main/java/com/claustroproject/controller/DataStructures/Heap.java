package com.claustroproject.controller.DataStructures;

import java.util.Arrays;
import java.util.Objects;

import org.w3c.dom.traversal.NodeIterator;

/**
 * Max Heap
 * 
 * @author Sanju
 *
 */
public class Heap {

	Integer count;
	
	Integer[] array;
	
	Heap(){
		this.count =0;
		this.array = new Integer[this.count];
	}
	
	public Integer parent(Integer nodeIndex){
		if(nodeIndex <=0 || nodeIndex >= this.count){
			return -1;
		}
		return (nodeIndex-1)/2;
	}
	
	public Integer leftChild(Integer nodeIndex){
		if(nodeIndex < 0 || nodeIndex >= this.count){
			return -1;
		}
		Integer leftChild = 2 * nodeIndex + 1;
		return leftChild < this.count ? leftChild : -1;
	}
	
	public Integer rightChild(Integer nodeIndex){
		if(nodeIndex < 0 || nodeIndex >= this.count){
			return -1;
		}
		Integer rightChild = 2 * nodeIndex + 2;
		return rightChild < this.count ? rightChild : -1;
	}
	
	public void percolateDown(Integer location){
		if(location >= this.count){
			return;
		}
		Integer leftChild = this.leftChild(location);
		Integer rightChild = this.rightChild(location);
		Integer max;
		if(leftChild != -1 && this.array[leftChild] > this.array[location]){
			max = leftChild;
		} else {
			max = location;
		}
		if (rightChild!= -1 && this.array[rightChild] > this.array[max]){
			max = rightChild;
		}
		if(max != location){
			Integer temp = this.array[location];
			this.array[location] = this.array[max];
			this.array[max] = temp;
			this.percolateDown(max);
		}
	}
	
	/**
	 * basically delete max
	 */
	public Integer delete(){
		if(Objects.nonNull(this.array)) return null;
		Integer temp = this.array[0];
		this.array[0] = this.array[this.count -1];
		this.array = Arrays.copyOf(this.array, this.count - 1);
		this.percolateDown(0);
		return temp;
	}
	
	public void insert(Integer data){
		if(Objects.isNull(this.array)) return;
		if(this.array.length == this.count){
			this.array = Arrays.copyOf(this.array, this.count + 1);
		}
		for(int i = this.count; i >=0; i = (i-1)/2){
			Integer parent = this.array[(i-1)/2];
			if(data > parent){
				this.array[i] = parent;
			}
		}
		this.count ++;
	}
	
	public void buildHeap(Integer[] array){
		if(Objects.isNull(array)) return;
		if(this.array.length < array.length){
			this.array = Arrays.copyOf(array, array.length);
			this.count = array.length;
		} else {
			for(int i = 0; i< array.length; i++){
				this.array[i] = array[i];
				this.count++;
			}
		}
		for(int i= (array.length-1)/2; i>= 0; i--){
			this.percolateDown(i);
		}
	}
	
	public static void heapSort(Heap unsortedHeap){
		if(Objects.isNull(unsortedHeap)) return;
		for(int i = unsortedHeap.count -1; i> 0; i--){
			System.out.print(unsortedHeap.array[0]);
			unsortedHeap.array[0] = unsortedHeap.array[i];
			unsortedHeap.array = Arrays.copyOf(unsortedHeap.array, --unsortedHeap.count);
			unsortedHeap.percolateDown(0);
		}
	}
	
	public void printHeap(){
		for(int i=0; i< this.count; i++){
			System.out.print(this.array[i]);
		}
		System.out.println();
		for(int i=0; i< this.array.length; i++){
			System.out.print(this.array[i]);
		}
		System.out.println();
	}
}
