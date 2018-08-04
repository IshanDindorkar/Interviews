package algorithms;

import data_structures.LinkedList;
import data_structures.Node;

public class AddLinkedLists {
	
	private LinkedList list1;
	private LinkedList list2;
	
	private void intializeLists() {
		list1 = new LinkedList();
		list1.head = new Node();
		list1.head.value = 7;
		list2 = new LinkedList();
		list2.head = new Node();
		list2.head.value = 5;
		
		list1.head = list1.insert(list1.head, 1);
		list1.head = list1.insert(list1.head, 6);
		
		list2.head = list2.insert(list2.head, 9);
		list2.head = list2.insert(list2.head, 2);
	}
	
	private Node sum(Node list1, Node list2, int carry) {
		Node node = new Node();
		if (list1 != null && list2 != null) {
			int sumNumbers = carry + list1.value + list2.value;
			
			if (sumNumbers >= 10) {
				carry = 1;
			} else {
				carry = 0;
			}
			node.value = sumNumbers % 10;

			if (list1.next != null && list2.next != null ) {
				node.next = sum(list1.next, list2.next, carry);
			}
		}
		
		return node;
	}

	public static void main(String[] args) {
		AddLinkedLists all = new AddLinkedLists();
		System.out.println("Initializing linked lists -> ");
		all.intializeLists();
		Node node = all.sum(all.list1.head, all.list2.head, 0);
		LinkedList sumList = new LinkedList();
		sumList.printLinkedList(node);
	}
}
