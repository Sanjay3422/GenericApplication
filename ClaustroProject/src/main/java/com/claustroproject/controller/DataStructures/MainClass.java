package com.claustroproject.controller.DataStructures;

import java.io.Console;
import java.lang.reflect.Field;
import java.util.Arrays;

import com.claustroproject.Entity.AbstractEntity.ApplicationEntity;
import com.claustroproject.Entity.AbstractEntity.Dummy;

class Engine{
	
	// starting an engine. 
    public void work() 
    { 
          
        System.out.println("Engine of car has been started "); 
          
    } 
	
}

class Vehicle{
	
	private final Engine engine;
	
	public Vehicle(Engine engine) {
		this.engine = engine;
	}
	
	 // car start moving by starting engine 
    public void move()  
    { 
          
//        if(engine != null) 
        { 
            engine.work(); 
            System.out.println("Car is moving "); 
        } 
    } 
}

public class MainClass {
	
	static int[] A = new int[5];
	
	public static void maintain(){
		
	 // making an engine by creating  
    // an instance of Engine class. 
	// Engine engine = new Engine(); 
      
    // Making a car with engine. 
    // so we are passing a engine  
    // instance as an argument while 
    // creating instace of Car. 
//    Vehicle car = new Vehicle(engine); 
//    car.move();
    
//    Specifc sps = new Specifc();
//    sps.printCommon();
//    binary(5);
		
//    LinkedList<String> linkedList = new LinkedList<>();
//    linkedList.add("one ");
//    linkedList.add("two ");
//    linkedList.add("three ");
//    linkedList.add("four ");
//    linkedList.add("five ");
//    linkedList.printAllList();
//    linkedList.remove(4);
//    linkedList.insert(5, "six ");
//    linkedList.insert(0, "-1 ");
//    linkedList.insert(1, "zero ");
//    linkedList.insert(5, "Reached half ");
//    linkedList.add("final");
//    linkedList.printAllList();
//	Stack<Integer> stack = new Stack<>(2);
//	stack.push(5);
//	stack.push(6);
//	stack.push(7);
//	stack.pop();
//	System.out.println(stack.peek());
//	stack.push(9);
//	stack.push(8);
//	stack.pop();
//	System.out.println(stack.peek());
//	stack.pop();
//	stack.pop();
//	stack.pop();
//	stack.pop();
//	System.out.println(2%5);
//		Queue<Integer> q = new Queue<>();
//		q.enqueue(2);
//		q.enqueue(3);
//		q.enqueue(7);
//		q.dequeue();
//		q.enqueue(6);
//		System.out.println(q.frontElement());
//		System.out.println(q.rearElement());
//		QueueLinked<Integer> q = new QueueLinked<>();
//		q.enqueue(5);
//		q.enqueue(6);
//		q.enqueue(7);
//		System.out.println(q.size());
//		System.out.println(q.frontElement() + "" + q.rearElement());
//		q.dequeue();
//		System.out.println(q.size());
//		System.out.println(q.frontElement() + "" + q.rearElement());
//		q.dequeue();
//		System.out.println(q.size());
//		q.dequeue();
//		System.out.println(q.frontElement() + "" + q.rearElement());
//		System.out.println(q.size());
		
//		BinaryTree<Integer> binary = new BinaryTree<>();
//		System.out.println(binary.find(1));
//		binary.insert(1);
//		System.out.println(binary.find(2));
//		System.out.println(binary.find(1));
//		binary.insert(5);
//		System.out.println(binary.findMax());
//		System.out.println(binary.treeHeight());
		
//		DisjointSet set = new DisjointSet();
//		set.makeSet();
//		set.union(3, 4);
//		set.union(4, 5);
//		set.union(4, 6);
//		set.union(6, 7);
//		set.print();
		
		Dummy dummy = new Dummy();
//		dummy.setName("name");
//		dummy.setOne(1);
		Class<?> a = dummy.getClass();
		
		Field[] fields = a.getDeclaredFields();
		Arrays.asList(fields).stream().forEach(action -> {
			try {
				action.setAccessible(true);
				if(action.getType().equals(String.class))
					action.set(dummy, "string");
				else{
					action.set(dummy, 3);
				}
				System.out.println(action.get(dummy));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("fuck");
				e.printStackTrace();
			}
		});
	}
	
	static void binary(int n){
		if(n<1){
			for(int i=0; i< A.length ; i++){
				System.out.print(A[i]);
			}
			System.out.println();
		}
		else {
			A[n-1] =0;
			binary(n-1);
			A[n-1] = 1;
			binary(n-1);
		}
	}
}
