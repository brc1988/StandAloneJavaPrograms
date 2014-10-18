/**
 * 
 */
package com.practice.programs.dataStructures;

import java.util.Arrays;

/**
 * @author B R Choudhury Sep 28, 2014
 */
public class MyStack {

	String[] stackArray;
	int topOfStack = -1;
	int stackSize;

	public MyStack(int size) {
		this.stackSize = size;
		stackArray = new String[stackSize];
		Arrays.fill(stackArray, "-1");
	}

	public void push(String in) {

		if (topOfStack + 1 < stackSize) {
			topOfStack++;
			stackArray[topOfStack] = in;
		} else {
			System.out.println("OMG!! Stack is full");
		}
	}

	public String peek() {
		System.out.println("peek returns : " + stackArray[topOfStack]);
		return stackArray[topOfStack];
	}

	public String pop() {

		if (topOfStack >= 0) {
			stackArray[topOfStack] = "-1";
			return stackArray[topOfStack--];
		} else {
			System.out.println("Stack is empty !!");
			return "-1";

		}
	}

	public void display() {
		System.out.println("stack : \n");
		for (int i = stackSize - 1; i >= 0; i--) {
			System.out.println("|  " + i + "  |  "
					+ ((stackArray[i].equals("-1")) ? "  " : stackArray[i])
					+ "  |");
		}
		System.out.println();
	}

	public static void main(String[] args) {

		MyStack stack = new MyStack(10);
		System.out.println("PUSH operation");
		System.out.println("=============");
		stack.push("20");
		stack.push("30");
		stack.push("40");
		stack.push("50");
		stack.display();

		System.out.println("POP operation");
		System.out.println("=============");
		stack.pop();
		stack.display();

		System.out.println("PEEK operation");
		System.out.println("=============");
		stack.peek();
		stack.display();

	}

}
