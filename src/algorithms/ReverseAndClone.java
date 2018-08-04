package algorithms;

import data_structures.LinkedList;
import data_structures.Node;

/**
 * Reverse a linked list
 */
public class ReverseAndClone {

	private LinkedList reverse(LinkedList list) {
		
		Node listHead = list.head;
		Node revListHead = null;
		while (listHead != null) {
			Node n = new Node();
			n.value = listHead.value;
			n.next = revListHead;
			revListHead = n;
			listHead = listHead.next;
		}
		
		LinkedList revList = new LinkedList();
		revList.head = revListHead;
		
		return revList;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		Node head = new Node();
		head.value = 1;
		list.head = head;
		head = LinkedList.insert(head, 2);
		head = LinkedList.insert(head, 3);
		head = LinkedList.insert(head, 2);
		head = LinkedList.insert(head, 1);
		
		ReverseAndClone revClone = new ReverseAndClone();
		LinkedList revList = revClone.reverse(list);
		LinkedList.printLinkedList(revList.head);
	}

}
