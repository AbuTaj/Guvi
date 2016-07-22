import java.util.Scanner;

public class EvenOdd {

	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		System.out.println("Enter the Number to Check");
		int a = s.nextInt();
		if (a % 2 != 0) {
			System.out.println("Given Number is Odd");
		} else {
			System.out.println("Given number is Even");
		}
	}

}
