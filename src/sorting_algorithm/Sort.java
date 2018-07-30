package sorting_algorithm;

/**
 * Parent class containing implementation of common methods
 * for all sorting algorithms
 */
public abstract class Sort {
	
	public abstract void sort(int[] numbers);
	
	/**
	 * Swap numbers internally within an array
	 * 
	 * @param array
	 * @param position1
	 * @param position2
	 */
	public static void swapNumbers(int[] array, int position1, int position2) {
		int temp = array[position1];
		array[position1] = array[position2];
		array[position2] = temp;
	} 
	
	/**
	 * Print all elements of given array
	 * 
	 * @param numbers
	 */
	public static void printNumbers(int[] numbers) {
		
		for (int number: numbers) {
			System.out.print(number + " ");
		}
	}
}
