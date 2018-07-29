package time_complexity;

public class PrintSortedStrings {
	private int numChars = 26;
	
	private void printSortedStrings(int remaining) {
		printSortedStrings(remaining, "");
	}
	
	// Print all sequences of strings where characters are sorted
	private void printSortedStrings(int remaining, String prefix) {
		if (remaining == 0) {
			if (isInOrder(prefix)) {
				System.out.println(prefix);
			}
		} else {
			for (int i = 0; i < numChars; i++) {
				char c = ithchar(i);
				printSortedStrings(remaining - 1, prefix + c);
			}
		}
	}
	
	// Check if a given string is sorted
	private boolean isInOrder(String input) {
		int index = 1;
		while(index < input.length()) {
			char prev = input.charAt(index - 1);
			char current = input.charAt(index);
			if (prev <= current) {
				index ++;
			} else {
				return false;
			}
		}
		return true;
	}
	
	// Get character at the 'i'th position in alphabet
	// E.g. character at 2nd position in alphabet is b
	private char ithchar(int i) {
		return (char)(((int)'a') + i);
	}
	
	public static void main(String ...strings) {
		PrintSortedStrings ps = new PrintSortedStrings();
		ps.printSortedStrings(2);
	}
}
