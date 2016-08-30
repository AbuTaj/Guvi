package logic;

import java.util.Scanner;

public class StringNumPro {
	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		String s1 = s.next();
		int a = 0;
		int rs = 0;
		int rss = 0;
		for (int i = s1.length() - 1; i >= 0; i--) {
			for (int j = 0; j <= i; j++) {
				a += Character.getNumericValue(s1.charAt(j));
			}
			rs = a;
			a = 0;
			rss += rs;
		}
		System.out.println(rss);
	}

}
