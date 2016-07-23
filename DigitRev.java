import java.util.Scanner;

public class DigitRev {

	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		System.out.println("Enter the Intreger to Reverse");
		StringBuffer s1 = new StringBuffer(s.next());
		System.out.println("The Reversed Integer is : " + s1.reverse());

	}

}
