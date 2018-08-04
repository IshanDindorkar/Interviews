package search_algorithm;

public class BinarySearchTree {

	/**
	 * Search for an element within array
	 * Returns index position of element within array
	 * Assumption is the array of numbers is SORTED
	 * Time complexity is O(log N)
	 * Space complexity is O(1) 
	 * 
	 * @param numbers
	 * @param x
	 * @param start
	 * @param end
	 * @return
	 */
	private static int search(int[] numbers, int x, int start, int end) {
		
		// Getting middle most element
		int midIdx = 0;
		if (numbers.length % 2 == 0) {
			midIdx = numbers.length / 2;
		} else {
			midIdx = (numbers.length - 1) / 2;
		}
		
		if (x < numbers[midIdx]) {
			return search(numbers, x, start, midIdx - 1);
		} else if (x > numbers[midIdx]) {
			return search(numbers, x, midIdx + 1, end);
		} else {
			return midIdx;
		}
	}
	
	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5, 6};
		int index = BinarySearchTree.search(numbers, 4, 0, numbers.length - 1);
		
		System.out.println("Index of number 4 is " + index);
	}

}
