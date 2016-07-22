import java.util.Scanner;

public class VowCons {

	private static Scanner s;

	public static void main(String[] args) {
		System.out.println("Enter the Character to Check");
		s = new Scanner(System.in);
		char c = s.next().charAt(0);
		if ((c == 'a') || (c == 'e') || (c == 'i') || (c == 'o') || (c == 'u')) {
			System.out.println("The given character is Vowel");
		} else {
			System.out.println("The given Character is Constant");
		}
	}

}
