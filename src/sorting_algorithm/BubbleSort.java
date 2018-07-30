package sorting_algorithm;

/**
 * Watch tutorial -> https://www.youtube.com/watch?v=nmhjrI-aW5o
 * Read text -> https://www.geeksforgeeks.org/bubble-sort/
 * Time Complexity -> O(N square)
 * Space Complexity -> O(1)
 *
 */
public class BubbleSort extends Sort {
	
	public void sort(int[] array) {
		int numberCnt = array.length;
		
		for (int i = 0; i < numberCnt - 1; i++) {
			for (int j = 0; j < numberCnt - 1 - i; j++) { // Main condition to look for
				if (array[j] > array[j+1]) {
					swapNumbers(array, j, j+1);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int[] numbers = {5, 89, 1, 50, 16};
		
		System.out.println("Before sorting -> ");
		printNumbers(numbers);
		
		BubbleSort bs = new BubbleSort();
		bs.sort(numbers);
		
		System.out.println("\nAfter sorting -> ");
		printNumbers(numbers);
	}
}
