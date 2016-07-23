import java.util.Scanner;

public class FactNum {

	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		int sum = 1;
		System.out.println("Enter the Number to find Factorial");
		int a = s.nextInt();
		while (a > 0) {
			sum *= a;
			a--;
		}
		System.out.println("Factorial of the given number is " + sum);

	}

}
