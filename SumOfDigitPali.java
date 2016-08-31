package logic;

import java.util.Scanner;

public class SumOfDigitPali {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String s1 = s.next();
		int a = 0;
		for (int i = 0; i < s1.length(); i++) {
			a += Character.getNumericValue((s1.charAt(i)));
		}
		String pan = Integer.toString(a);
		StringBuffer sb = new StringBuffer(pan);
		sb.reverse();

		if (a != Integer.parseInt(sb.toString())) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}
		s.close();

	}

}
