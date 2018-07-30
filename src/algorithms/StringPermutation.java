package algorithms;

import java.util.Arrays;

public class StringPermutation {
	
	private static String firstString = "God";
	private static String secondString = "Dog";
	
	// Method 1 - Check if strings are permutation of each other
	// Count total no of chars in both strings
	private static boolean areStringsPermutationMethOne() {
		// ASSUMPTION: Ignore case
		String sortedFirstString = StringPermutation.sortString(firstString.toLowerCase());
		String sortedSecondString = StringPermutation.sortString(secondString.toLowerCase());
		
		if (sortedFirstString.equalsIgnoreCase(sortedSecondString)) {
			return true;
		}
		return false;
	}
	
	// Method 2 - Check if strings are permutations of each other
	// Count occurrences of each letter in both strings
	private static boolean areStringsPermutationMethSec() {
		
		// ASSUMPTION: Input strings are in ASCII representation
		int[] chars = new int[128];
		for (char fc: firstString.toLowerCase().toCharArray()) {
			chars[fc] ++;
		}
			
		for (char sc: secondString.toLowerCase().toCharArray()) {
			chars[sc]--;
		}
		
		for (int count: chars) {
			if (count != 0) {
				return false;
			}
		}
		
		return true;
	}
	
	// Sorts characters of given input string
	private static String sortString(String input) {
		char[] chars = input.toCharArray();
		Arrays.sort(chars);
		return new String(chars);
	}
	
	public static void main(String[] args) {
		// boolean isPerm = StringPermutation.areStringsPermutationMethOne();
		boolean isPerm = StringPermutation.areStringsPermutationMethSec();
		if (isPerm) {
			System.out.println("Strings are permutation of each other");
			
		} else {
			System.out.println("Strings are not permutation of each other");
		}
	}
 
}
