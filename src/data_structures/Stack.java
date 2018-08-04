package data_structures;

/**
 * Stack implementation
 * @param <T>
 *
 */
public class Stack<T> {
	
	public static class StackNode<T> {
		
		/**
		 * @param data
		 */
		public StackNode() {
			super();
		}
		
		/**
		 * @param data
		 */
		public StackNode(T data) {
			super();
			this.data = data;
		}
		
		private T data;
		private StackNode<T> next;

		/**
		 * @return the data
		 */
		public T getData() {
			return data;
		}
		/**
		 * @param data the data to set
		 */
		public void setData(T data) {
			this.data = data;
		}
		/**
		 * @return the next
		 */
		public StackNode<T> getNext() {
			return next;
		}
		/**
		 * @param next the next to set
		 */
		public void setNext(StackNode<T> next) {
			this.next = next;
		}
	}
	
	private StackNode<T> top;
	
	/**
	 * @return the top
	 */
	public StackNode<T> getTop() {
		return top;
	}

	/**
	 * @param top the top to set
	 */
	public void setTop(StackNode<T> top) {
		this.top = top;
	}

	/**
	 * Push an element on top of stack
	 * 
	 * @param item
	 */
	public void push(StackNode<T> item) {
		item.next = this.top;
		this.top = item;
	}
	
	/**
	 * Removes top element from stack
	 * 
	 * @return
	 */
	public StackNode<T> pop() {
		StackNode<T> topElement = top;
		top = top.next;
		
		return topElement;
	}
	
	/**
	 * Returns top element of stack without deleting it
	 * 
	 * @return
	 */
	public StackNode<T> peek() {
		return top;
	}
	
	/**
	 * Check whether stack is empty or not
	 * 
	 * @return
	 */
	@SuppressWarnings("unused")
	public boolean isEmpty() {
		return top == null;
	}
	
	/**
	 * Printing stack values
	 */
	public void printStack() {
		System.out.println("\nStack ->");
		StackNode<T> node = new StackNode<T>();
		node.setData(top.getData());
		node.setNext(top.getNext());
		
		while (node != null) {
			if (node.getNext() == null) {
				System.out.print(node.getData() + "");
			} else {
				System.out.print(node.getData() + " -> ");
			}
			node = node.getNext();
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Stack<Integer> firstStack = new Stack<>();
		StackNode<Integer> top = new StackNode<>(1);
		firstStack.setTop(top);
		
		// Pushing elements on stack
		System.out.println("Pushing elements -> ");
		for(int i = 2; i <= 5; i++) {
			firstStack.push(new StackNode<>(i));
		}
		firstStack.printStack();
		
		// Popping top element 
		System.out.println("\nPopping top element -> ");
		firstStack.pop();
		firstStack.printStack();
		
		// Showing top element
		System.out.println("\nShowing top most element -> ");
		StackNode<Integer> topElem = firstStack.peek();
		System.out.println("Data - > " + topElem.getData());
	}
}
