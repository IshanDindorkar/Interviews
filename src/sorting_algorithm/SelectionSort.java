package sorting_algorithm;

/**
 * Watch -> https://www.youtube.com/watch?v=xWBP4lzkoyM
 * Read -> https://www.geeksforgeeks.org/selection-sort/
 * Time Complexity -> O(N square)
 * Space Complexity -> O(1)
 *
 */
public class SelectionSort extends Sort {
	
	/**
	 * Sort array of numbers using Selection Sort algorithm
	 * 
	 * @param numbers
	 */
	public void sort(int[] numbers) {
		
		int numCnt = numbers.length;
		int minIdx = 0;
		System.out.println("\nSelection sort begins -> ");
		for (int i = 0; i < numCnt - 1; i++) {
			System.out.println("\nIteration " + (i + 1));
			minIdx = i;
			System.out.println("Minimum value Index " + minIdx);
			
			for (int j = i+1; j < numCnt; j++) {
				if (numbers[j] < numbers[minIdx]) {
					minIdx = j;
				}
			}
			
			System.out.println("New index for minimum number " + minIdx);
			swapNumbers(numbers, i, minIdx);
			System.out.println("Sorted array after iteration " + (i + 1));
			printNumbers(numbers);
		}
	}
	
	public static void main(String[] args) {

		int[] numbers = {5, 89, 1, 50, 16};

		System.out.println("Before sorting -> ");
		printNumbers(numbers);
		
		SelectionSort ss = new SelectionSort();
		ss.sort(numbers);
		
		System.out.println("\nAfter sorting -> ");
		printNumbers(numbers);
	}
}
