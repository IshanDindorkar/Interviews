package algorithms;

import java.util.HashSet;
import java.util.Set;

import data_structures.*;
public class RemoveDuplicate {
	private LinkedList ls = new LinkedList();
	
	private Node initializeLinkedList(Node head) {
		ls.insert(head, 1);
		ls.insert(head, 1);
		ls.insert(head, 2);
		ls.insert(head, 6);
				
		return head;
	}
	
	private Node removeDuplicate(Node head) {
		
		Set<Integer> numbers = new HashSet<>();
		Node previous = head;
		numbers.add(previous.value);
		while (previous.next != null) {
			if (numbers.contains(previous.next.value)) {
				previous.next = previous.next.next;
			} else {
				numbers.add(previous.next.value);
				previous = previous.next;
			}
		}
		ls.printLinkedList(head);
		
		return head;
	}
	
	public static void main(String[] args) {
		Node head = new Node();
		head.value = 1;
		RemoveDuplicate rd = new RemoveDuplicate();
		rd.initializeLinkedList(head);
		rd.removeDuplicate(head);
	}

}
