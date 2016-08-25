import java.util.Scanner;

public class Encrypt {
	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		System.out.println("Enter String");
		String s1 = s.next().toLowerCase();
		int a = 0;
		String sr = "";
		String sa = "abcdefghijklmnopqrstuvwxyz";
		for (int i = 0; i < s1.length() - 1; i++) {
			a = s1.charAt(i) - 97;
			if (a <= 0) {
				a += 26;
			}
			sr += sa.charAt(a - 1);

		}
		System.out.println("Encrypted String : " + sr + s1.charAt(s1.length() - 1));
	}

}
