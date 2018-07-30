package algorithms;

public class SwapMinMax {
	
	private static int[] numbers = {750, 85, 96, 115, 78};
	
	/**
	 * Determining index postions of min and max values within array
	 */
	private static void findMinMax() {
		int min = 0;
		int max = 0;
		int minIndex = 0;
		int maxIndex = 0;
		
		// Set min and max values only if array is non-empty
		if (numbers.length > 0) {
			min = numbers[0];
			max = numbers[0];
		}
		
		// Traversing array to find out max and min number
		int numCnt = 0;
		for (int number: numbers) {
			if (number < min) {
				min = number;
				minIndex = numCnt; 
			} else if (number > max) {
				max = number;
				maxIndex = numCnt;
			}
			numCnt ++;
		}
		
		swapNumbers(minIndex, maxIndex);
	}
	
	/**
	 * Swapping min and max values within array
	 * 
	 * @param minIndex
	 * @param maxIndex
	 */
	private static void swapNumbers(int minIndex, int maxIndex) {
		int max = numbers[maxIndex];
		int min = numbers[minIndex];
		numbers[maxIndex] = min;
		numbers[minIndex] = max;
	}
	
	public static void main(String[] args) {
		SwapMinMax.findMinMax();
		for (int number: numbers) {
			System.out.println(number);
		}
	}
}
