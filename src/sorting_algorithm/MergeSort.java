package sorting_algorithm;

/**
 * MergeSort implementation
 * Watch -> https://www.youtube.com/watch?v=TzeBrDU-JaY
 */
public class MergeSort extends Sort {

	@Override
	public void sort(int[] numbers) {
		int numberCount = numbers.length;
		
		// Base condition to break ...
		if (numberCount < 2) {
			return;
		}
		
		int mid = numberCount / 2;
		
		// Initializing values ...
		int[] leftArray = new int[mid];
		int leftArrayIdx = 0;
		int[] rightArray = new int[numberCount - mid];
		int rightArrayIdx = 0;
		
		int numberIdx = 0;
		
		// Populating left array ...
		while (numberIdx <= mid - 1) {
			leftArray[leftArrayIdx] = numbers[numberIdx];
			leftArrayIdx++;
			numberIdx++;
		}
		
		// Populating right array ...
		numberIdx = mid;
		while (numberIdx <= numberCount - 1) {
			rightArray[rightArrayIdx] = numbers[numberIdx];
			rightArrayIdx++;
			numberIdx++;
		}
		
		// Recursive calls to sort function ...
		sort(leftArray);
		sort(rightArray);
		
		merge(numbers, leftArray, rightArray);
	}
	
	private void merge(int[] numbers, int[] left, int[] right) {
		
		int leftArrIndex = 0;
		int rightArrIndex = 0;
		int numberArrIndex = 0;
		
		while ((leftArrIndex <= left.length - 1) && (rightArrIndex <= right.length - 1)) {
			// If left array number is less than right array number ...
			if (left[leftArrIndex] < right[rightArrIndex]) {
				numbers[numberArrIndex] = left[leftArrIndex];
				leftArrIndex++;
			} else {
				numbers[numberArrIndex] = right[rightArrIndex];
				rightArrIndex++;
			}
			numberArrIndex++;
		}
		
		// Copy remaining elements of left array ...
		while (leftArrIndex <= left.length - 1) {
			numbers[numberArrIndex] = left[leftArrIndex];
			numberArrIndex++;
			leftArrIndex++;
		}
		
		// Copy remaining elements of right array ...
		while (rightArrIndex <= right.length - 1) {
			numbers[numberArrIndex] = right[rightArrIndex];
			numberArrIndex++;
			rightArrIndex++;
		}
	}

	public static void main(String[] args) {
		int[] numbers = {5, 89, 1, 50, 16, 21};
		System.out.println("Array before sorting -> ");
		printNumbers(numbers);
		
		MergeSort ms = new MergeSort();
		ms.sort(numbers);
		
		System.out.println("\nArray after sorting ->");
		printNumbers(numbers);
	}
}
