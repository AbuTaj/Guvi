package logic;

import java.util.Scanner;

public class StringMap {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String num = s.next();
		String str = "abcdefghijklmnopqrstuvwxyz";
		int a = 0;
		int b = 0;
		String snum = "";
		for (int i = 0; i < num.length(); i++) {
			a = Character.getNumericValue(num.charAt(i));
			System.out.print(str.charAt(a - 1));
		}
		System.out.println();
		for (int i = 0; i < num.length() - 1; i++) {
			snum = Character.toString(num.charAt(i)) + Character.toString(num.charAt(i + 1));
			b = Integer.parseInt(snum);
			if (b < 26) {
				System.out.print(str.charAt(b));
			}
		}
		snum = Character.toString(num.charAt(num.length() - 2)) + Character.toString(num.charAt(num.length() - 1));
		b = Integer.parseInt(snum);
		if (b < 26) {
			System.out.print(str.charAt(b));
		}
		s.close();
	}

}
