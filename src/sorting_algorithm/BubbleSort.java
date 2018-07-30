package sorting_algorithm;

public class BubbleSort {
	
	private static void sort(int[] array) {
		int numberCnt = array.length;
		
		for (int i = 0; i < numberCnt - 1; i++) {
			for (int j = 0; j < numberCnt - 1 - i; j++) {
				if (array[i] > array[i+1]) {
					swapNumbers(array, i, i+1);
				}
			}
		}
	}
	
	private static void swapNumbers(int[] array, int position1, int position2) {
		int temp = array[position1];
		array[position1] = array[position2];
		array[position2] = temp;
	}
	
	public static void main(String[] args) {
		int[] numbers = {5, 89, 1, 50, 16};
		System.out.println("Before sorting -> ");
		for (int num : numbers) {
			System.out.print(num + " ");
		}
		BubbleSort.sort(numbers);
		System.out.println("After sorting -> ");
		for (int num : numbers) {
			System.out.print(num + " ");
		}
		
	}

}
