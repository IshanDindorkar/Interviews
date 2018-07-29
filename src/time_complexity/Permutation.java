package time_complexity;

public class Permutation {
	
	private void permutation(String str) {
		permutation(str, "");
	}
	
	private void permutation(String str, String prefix) {
		if (str.length() <= 0) {
			System.out.println("Printing prefix -> " + prefix);
		} else {
			for (int i = 0; i < str.length(); i++) {
				String rem = str.substring(0, i) + str.substring(i + 1);
				System.out.println("Printing reminder of string -> " + rem);
				permutation(rem, prefix + str.charAt(i));
			}
		}
	}
	
	// Entry point to code
	/**
	 * @param args
	 */
	public static void main(String ... args) {
		String name = "Ishan";
		Permutation perm = new Permutation();
		perm.permutation(name);
	}
	
}
