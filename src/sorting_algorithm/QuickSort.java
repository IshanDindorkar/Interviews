package sorting_algorithm;

/**
 * Watch -> https://www.youtube.com/watch?v=COk73cpQbFQ
 * Time Complexity -> O(N log N)
 * Space Complexity -> O(1)
 */
public class QuickSort {

	public void sort(int[] numbers, int start, int end) {
		
		if (start < end) {
			int pivotIdx = partition(numbers, start, end);
			
			// Recursively calling sort function on sub segments of array
			sort(numbers, start, pivotIdx - 1);
			sort(numbers, pivotIdx + 1, end);
		}
	}
	
	/**
	 * Determine index of pivot element
	 *  
	 * @param numbers
	 * @param start
	 * @param end
	 * @return
	 */
	private int partition(int[] numbers, int start, int end) {
		
		int pivot = numbers[end];
		int pivotIdx = start;
		for (int i = start; i <= end - 1; i++) {
			if (numbers[i] <= pivot) {
				
				// Swap numbers in order to push numbers less than last number towards left
				swap(numbers, pivotIdx, i);
				pivotIdx++;
			}
		}
		
		// Swapping pivot position number with the last element of array
		swap(numbers, pivotIdx, end);
		System.out.println("\nNumbers post partition -> ");
		for (int number: numbers) {
			System.out.print(number + " ");
		}
		
		return pivotIdx;
	}
	
	/**
	 * Swapping numbers
	 * 
	 * @param numbers
	 * @param position1
	 * @param position2
	 */
	private void swap(int[] numbers, int position1, int position2) {
		
		int temp = numbers[position1];
		numbers[position1] = numbers[position2];
		numbers[position2] = temp;
	}

	public static void main(String[] args) {
		
		int[] numbers = {5, 89, 1, 50, 16, 21};
		QuickSort qs = new QuickSort();
		qs.sort(numbers, 0, numbers.length - 1);
	}

}
