package time_complexity;

public class SumDigits {
	
	// Computes sum of all constituting digits of a number
	private int sum(int number) {
		int sum = 0;
		while (number > 0) {
			sum += number % 10;
			number = number / 10;
		}
		
		return sum;
	}
	
	public static void main(String ...strings) {
		SumDigits sumDigits = new SumDigits();
		int sum = sumDigits.sum(123);
		
		// Print sum of all digits of a number
		System.out.println(sum);
	}
}
