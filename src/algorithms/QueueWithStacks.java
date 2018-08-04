package algorithms;

import data_structures.Stack;
import data_structures.Stack.StackNode;

/**
 * Implementing queue with 2 stacks
 *
 */
public class QueueWithStacks<T> {
	
	private Stack<T> newStack;
	private Stack<T> oldStack;
	
	public QueueWithStacks() {
		super();
		newStack = new Stack<>();
		oldStack = new Stack<>();
	}
	
	/**
	 * @return the newStack
	 */
	public Stack<T> getNewStack() {
		return newStack;
	}

	/**
	 * @param newStack the newStack to set
	 */
	public void setNewStack(Stack<T> newStack) {
		this.newStack = newStack;
	}

	/**
	 * @return the oldStack
	 */
	public Stack<T> getOldStack() {
		return oldStack;
	}

	/**
	 * @param oldStack the oldStack to set
	 */
	public void setOldStack(Stack<T> oldStack) {
		this.oldStack = oldStack;
	}

	/**
	 * Adding elements to queue
	 * 
	 * @param item
	 */
	public void push(StackNode<T> item) {
		if (newStack.getTop() != null) {
			StackNode<T> top = newStack.getTop();
			item.setNext(top);
			top = item;
			newStack.setTop(top);
		}
	}
	
	/**
	 * Moving elements from new stack to old stack
	 */
	public void shiftStacks() {
		if (oldStack.isEmpty()) {
			while (!newStack.isEmpty()) {
				oldStack.push(newStack.pop());
			}
		}
	}
	
	/**
	 * Removing element from front of queue
	 * 
	 * @return
	 */
	public StackNode<T> pop() {
		if (oldStack.isEmpty()) {
			shiftStacks();
			StackNode<T> topElem = oldStack.getTop();
			oldStack.setTop(oldStack.getTop().getNext());
			return topElem;
		}
		
		return null;
	}
	
	/**
	 * Return element from front of queue
	 * @return
	 */
	public StackNode<T> peep() {
		if (!oldStack.isEmpty()) {
			return oldStack.getTop();
		}
		
		return null;
	}
	
	/**
	 * Printing values of queue elements
	 */
	public void print() {
		System.out.println("\nPrinting Stack -> ");
		if (!newStack.isEmpty()) {
			Stack<T> stack = new Stack<>();
			stack.setTop(newStack.getTop());
			while (stack.getTop() != null) {
				System.out.print(stack.getTop().getData() + " ");
				stack.setTop(stack.getTop().getNext());
			}
		}
		
		if (!oldStack.isEmpty()) {
			Stack<T> stack = new Stack<>();
			stack.setTop(oldStack.getTop());
			while (stack.getTop() != null) {
				System.out.print(stack.getTop().getData() + " ");
				stack.setTop(stack.getTop().getNext());
			}
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		QueueWithStacks<Integer> queue = new QueueWithStacks<>();
		
		// Adding elements to newly implemented queue
		System.out.println("\nAdding elements to queue from back... ");
		StackNode<Integer> top = new StackNode<>();
		top.setData(1);
		queue.getNewStack().setTop(top);
		
		StackNode<Integer> newItem;
		for (int i = 2; i <= 5; i++) {
			newItem = new StackNode<>();
			newItem.setData(i);
			queue.push(newItem);
		}
		
		// Printing queue elements
		queue.print();
		
		// Popping top element from queue
		System.out.println("\n\nPopping top element from front of queue... ");
		queue.pop();
		queue.print();
	}

}
