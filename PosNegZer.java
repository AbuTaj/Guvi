import java.util.Scanner;

public class PosNegZer {

	private static Scanner s;

	public static void main(String[] args) {

		s = new Scanner(System.in);
		System.out.println("Enter the Number to Check");
		int a = s.nextInt();
		if (a == 0) {
			System.out.println("The given number is zero");
		}
		if (a > 0) {
			System.out.println("The given number is Positive");
		}
		if (a < 0) {
			System.out.println("The given number is Negative");
		}

	}

}
