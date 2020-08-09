package com.claustroproject.controller.DataStructures;

public class DisjointSet{
	
	Integer[] array = new Integer[8];
	
	Integer[] size = new Integer[8];
	
	public void makeSet(){
		for(int i=0; i< this.array.length ; i++){
			this.array[i] = i;
			this.size[i] = i;
		}
	}
	
	public boolean find(Integer root1, Integer root2){
		if(this.array[root1] == this.array[root2]){
			return true;
		}
		return false;
	}
	
	public Integer root(Integer element){
		while(this.array[element] != element){
//			this.array[element] =this.array[this.array[element]];
			element = this.array[element];
		}
		return element;
	}
	
	public void union(Integer element1, Integer element2){
		Integer root1 = this.root(element1);
		Integer root2 = this.root(element2);
		if(this.find(root1, root2)){
			return;
		}
		if(this.size[root2] < this.size[root1]){
			this.array[root2] = this.array[root1];
			this.size[root1] += this.size[root2];
		} else {
			this.array[root1] = this.array[root2];
			this.size[root2] += this.size[root1];
		}
	}
	
	public void print() {
		for(int i= 0; i< this.array.length; i++)
		System.out.print(this.array[i]);
		System.out.println();
	}
}
