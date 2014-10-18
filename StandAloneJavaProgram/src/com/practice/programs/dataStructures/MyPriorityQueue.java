/**
 * 
 */
package com.practice.programs.dataStructures;

import java.util.Arrays;

/**
 * @author B R Choudhury Sep 28, 2014
 *         http://www.newthinktank.com/2013/03/stacks-and-queues/
 * 
 */
public class MyPriorityQueue {
	private String[] queueArray;
	private int noOfdata, front, rear = 0;
	int queueSize;

	public MyPriorityQueue(int size) {
		this.queueSize = size;
		queueArray = new String[queueSize];
		Arrays.fill(queueArray, "-1");
	}

	private void insert(String in) {
		if (noOfdata + 1 <= queueSize) {
			queueArray[rear] = in;
			noOfdata++;
			rear++;

		} else {
			System.out.println("OMG!! queue is full");
		}
	}

	private void priorityIsert(String in) {

		if (noOfdata == 0) {
			insert(in);
		} else {

			for (int i = noOfdata - 1; i >= 0; i--) {
				if (Integer.parseInt(in) > Integer.parseInt(queueArray[i])) {
					queueArray[i + 1] = queueArray[i];
				}else{
					break;
				}
				
				queueArray[i + 1]=in;
				rear++;
				noOfdata++;

			}
		}

	}

	private String peek() {
		System.out.println("peek returns : " + queueArray[front]);
		return queueArray[front];
	}

	private void remove() {
		if (noOfdata > 0) {
			queueArray[front] = "-1";
			front++;
			noOfdata--;

		} else {
			System.out.println("Queue is empty !!");
		}

	}

	private void display() {
		System.out.println("stack : \n");
		for (int i = 0; i < queueSize; i++) {
			System.out.println("|  " + (i) + "  |  "
					+ ((queueArray[i].equals("-1")) ? "  " : queueArray[i])
					+ "  | " + ((i == front) ? "Front" : "") + ""
					+ ((i == rear) ? "Rear" : ""));
		}
		System.out.println();

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MyPriorityQueue queue = new MyPriorityQueue(10);
		System.out.println("Insert operation");
		System.out.println("=============");
		queue.priorityIsert("20");
		queue.priorityIsert("30");
		queue.priorityIsert("40");
		queue.priorityIsert("50");
		queue.priorityIsert("10");
		queue.priorityIsert("15");
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
