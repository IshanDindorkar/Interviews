package algorithms;

import data_structures.LinkedList;
import data_structures.Node;

public class ReverseLinkedList {
	
	private Node reverse(Node head) {
		Node prev = null;
		Node current = head;
		Node next = null;
		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		head = prev;
		return head;
	}
	
	public static void main(String[] args) {
		ReverseLinkedList rll = new ReverseLinkedList();
		Node head = new Node();
		head.value = 1;
		
		head = LinkedList.insert(head, 3);
		head = LinkedList.insert(head, 5);
		head = LinkedList.insert(head, 7);
		
		Node revListHead = rll.reverse(head);
		LinkedList.printLinkedList(revListHead);
	}

}
