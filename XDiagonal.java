import java.util.Scanner;

public class LinearDia {

	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		System.out.println("Enter the String");
		String s1 = s.next();
		char[] c = s1.toCharArray();
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c.length; j++) {
				if (j == i || j == (c.length - 1 - i)) {
					System.out.print(c[j]);
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
