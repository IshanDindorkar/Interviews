package algorithms;

public class PalindromePermutation {

	/**
	 * Check if given input string can be permutation of a 
	 * palindrome
	 * 
	 * @param input
	 * @return
	 */
	private static boolean isPalindromePermutation(String input) {
		
		int[] asciiChars = new int[128];
		int countOdd = 0;
		for (char character: input.toCharArray()) {
			asciiChars[character]++;
			if (asciiChars[character] % 2 == 1) {
				countOdd++;
			} else {
				countOdd--;
			}
		}
		
		return countOdd <= 1;
	}
	
	public static void main(String[] args) {
		System.out.println(PalindromePermutation.isPalindromePermutation("ana"));
	}

}
