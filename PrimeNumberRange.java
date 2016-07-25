import java.util.Scanner;

public class PrimeNumber {
	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		System.out.println("Enter the Starting number");
		int a = s.nextInt();
		System.out.println("Enter the Ending Number");
		int b = s.nextInt();
		String primeNumbers = "";
		for (int i = a; i <= b; i++) {
			int counter = 0;
			for (int j = i; j >= 1; j--) {
				if (i % j == 0) {
					counter += 1;
				}
			}
			if (counter == 2) {
				primeNumbers += i + " ";
			}
		}
		System.out.println("Prime numbers from " + a + " to " + b + " are :");
		System.out.println(primeNumbers);
	}
}
