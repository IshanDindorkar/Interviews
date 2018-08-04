package data_structures;

/**
 * Queue implementation
 * 
 *
 */
public class Queue<T> {
	
	public static class QueueNode<T> {
		private T data;
		private QueueNode<T> next;
		
		public QueueNode() {
			super();
		}
		
		public QueueNode(T data) {
			super();
			this.data = data;
		}
		
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
		public QueueNode<T> getNext() {
			return next;
		}
		/**
		 * @param next the next to set
		 */
		public void setNext(QueueNode<T> next) {
			this.next = next;
		}
		
	}
	
	private QueueNode<T> first;
	private QueueNode<T> last;

	/**
	 * @return the first
	 */
	public QueueNode<T> getFirst() {
		return first;
	}

	/**
	 * @param first the first to set
	 */
	public void setFirst(QueueNode<T> first) {
		this.first = first;
	}

	/**
	 * @return the last
	 */
	public QueueNode<T> getLast() {
		return last;
	}

	/**
	 * @param last the last to set
	 */
	public void setLast(QueueNode<T> last) {
		this.last = last;
	}
	
	/**
	 * Inserting elements in a queue
	 * 
	 * @param item
	 */
	private void push(QueueNode<T> item) {
		if (first == null && last == null) {
			first = item;
			last = item;
		} else {
			item.next = last;
			last = item;
		}
	}
	
	/**
	 * Removes first element from a queue
	 * 
	 * @return
	 */
	private QueueNode<T> pop() {
		if (first != null) {
			QueueNode<T> lastElem = new QueueNode<>();
			lastElem.setData(last.getData());
			lastElem.setNext(last.getNext());
			
			while(lastElem != null) {
				lastElem = lastElem.getNext();
				if (lastElem.getNext() == first) {
					first = lastElem;
					return lastElem.getNext();
				}
			}
		}

		return null;
	}
	
	/**
	 * Print queue
	 */
	private void print() {
		QueueNode<T> node = new QueueNode<>();
		node.setData(last.getData());
		node.setNext(last.getNext());
		
		System.out.println("Queue -> ");
		while(node != null) {
			System.out.print(node.getData() + " ");
			
			// Stop printing queue elements on reaching first ptr
			if (node == first) {
				break;
			}
			node = node.getNext();
		}
	}
	
	public static void main(String[] args) {
		Queue<Integer> queue = new Queue();
		QueueNode<Integer> top = new QueueNode<Integer>(1);
		
		// Initializing queue
		queue.setFirst(top);
		queue.setLast(top);
		
		// Push elements on queue
		System.out.println("\nPushing elements on queue -> ");
		for (int i = 2; i <= 5; i++) {
			queue.push(new QueueNode<Integer>(i));
		}
		
		System.out.println("\nPrinting queue elements");
		System.out.println("\nFirst element -> " + queue.getFirst().getData());
		System.out.println("\nLast element -> " + queue.getLast().getData());
		queue.print();
		
		// Pop elements from queue
		System.out.println("\nPopping top element from queue -> ");
		QueueNode<Integer> first = queue.pop();
		System.out.println("\nFirst element -> " + first.getData());
		System.out.println("\nPrinting queue elements");
		System.out.println("\nFirst element -> " + queue.getFirst().getData());
		System.out.println("\nLast element -> " + queue.getLast().getData());
		queue.print();
	}

}
