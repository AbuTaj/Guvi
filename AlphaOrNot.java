import java.util.Scanner;

public class AlphaOrNot {

	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		System.out.println("Enter the Character to Check");
		char c = s.next().charAt(0);
		if (Character.isAlphabetic(c)) {
			System.out.println("The Given Character is Alphabet");
		} else {
			System.out.println("The Given Character is Not an Alphabet");
		}
	}

}
