/**
 * 
 */
package com.practice.programs.dataStructures;

import java.util.Arrays;

/**
 * @author B R Choudhury
 * Sep 28, 2014
 */
public class MyQueue {
	private String[] queueArray;
	private int noOfdata, front, rear= 0;
	int queueSize;
	
	public MyQueue(int size) {
		this.queueSize = size;
		queueArray = new String[queueSize];
		Arrays.fill(queueArray, "-1");
	}
	private void insert(String in) {
		if(noOfdata+1<=queueSize){
			queueArray[rear]=in;
			noOfdata++;
			rear++;
			
		}else{
			System.out.println("OMG!! queue is full");
		}		
	}

	private String peek() {
		System.out.println("peek returns : " + queueArray[front]);
		return queueArray[front];		
	}

	private void remove() {
		if(noOfdata>0){
			queueArray[front]="-1";
			front++;
			noOfdata--;
			
		}else{
			System.out.println("Queue is empty !!");					
		}
		
	}

	private void display() {
		System.out.println("stack : \n");
		for (int i = 0; i< queueSize ; i++) {
			System.out.println("|  " + (i) + "  |  "
					+ ((queueArray[i].equals("-1")) ? "  " : queueArray[i])
					+ "  | " 
					+((i==front)?"Front":"")
					+""
					+((i==rear)?"Rear":""));			
		}
		System.out.println();
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MyQueue queue = new MyQueue(10);
		System.out.println("Insert operation");
		System.out.println("=============");
		queue.insert("20");
		queue.insert("30");
		queue.insert("40");
		queue.insert("50");
		queue.display();

		System.out.println("Remove operation");
		System.out.println("=============");
		queue.remove();
		queue.display();

		System.out.println("PEEK operation");
		System.out.println("=============");
		queue.peek();
		queue.display();

	}

	

}
