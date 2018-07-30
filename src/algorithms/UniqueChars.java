package algorithms;

public class UniqueChars {
	
	private static String input = "Ishan";
	
	private static void isUniqueChars() {
		boolean[] isUnique = new boolean[128];
		for (char character: input.toCharArray()) {
			int numChar = character;
			if (isUnique[numChar] == true) {
				isUnique[numChar] = false;
				System.out.println("String contains duplicate characters");
				return;
			}
			isUnique[numChar] = true;
		}
	}
	
	public static void main(String[] args) {
		UniqueChars.isUniqueChars();
		System.out.println("Operation completed!");
	}
}
