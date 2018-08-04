package algorithms;

import java.awt.SecondaryLoop;

import data_structures.LinkedList;
import data_structures.Node;

/**
 * @author ishan
 *
 */
public class IntersectionLinkedList {
	
	private LinkedList list1; 
	private LinkedList list2;
	
	private void initializeLists() {
		list1 = new LinkedList();
		list2 = new LinkedList();
		
		Node firstListHead = new Node();
		Node secListHead = new Node();
		
		firstListHead.value = 4;
		secListHead.value = 7;
		list1.head = firstListHead;
		list2.head = secListHead;
		
		// Adding elements to list 1
		firstListHead = LinkedList.insert(firstListHead, 1);
		firstListHead = LinkedList.insert(firstListHead, 9);
		
		// Adding elements to list 2
		secListHead = LinkedList.insert(secListHead, 2);
		
		// Create "intersection between 2 lists (pointing to same node by reference
		Node intersection = LinkedList.createNode(12);
		firstListHead = LinkedList.placeNodeInList(firstListHead, intersection);
		secListHead = LinkedList.placeNodeInList(secListHead, intersection);
		
		// Continue adding elements in both lists
		intersection = LinkedList.createNode(15);
		firstListHead = LinkedList.placeNodeInList(firstListHead, intersection);
		secListHead = LinkedList.placeNodeInList(secListHead, intersection);
		
		intersection = LinkedList.createNode(5);
		firstListHead = LinkedList.placeNodeInList(firstListHead, intersection);
		secListHead = LinkedList.placeNodeInList(secListHead, intersection);
		
		intersection = LinkedList.createNode(26);
		firstListHead = LinkedList.placeNodeInList(firstListHead, intersection);
		secListHead = LinkedList.placeNodeInList(secListHead, intersection);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		IntersectionLinkedList ill = new IntersectionLinkedList();
		ill.initializeLists();
		
		// Displaying both lists ...
		System.out.println("Printing both lists -> ");
		LinkedList.printLinkedList(ill.list1.head);
		LinkedList.printLinkedList(ill.list2.head);
		
	}

}
