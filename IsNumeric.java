import java.util.Scanner;

public class IsNumeric {

	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		System.out.println("Enter the String");
		String s1 = s.next();
		char c[] = new char[s1.length()];
		c = s1.toCharArray();
		boolean b1 = false;
		for (int i = 0; i < s1.length(); i++) {
			if (!(Character.isAlphabetic(c[i]))) {
				b1 = true;
			}
		}
		System.out.println(b1);

	}

}
