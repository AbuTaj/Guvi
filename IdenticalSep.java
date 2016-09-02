package logic;

import java.util.Scanner;

public class IdenticalSep {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String s1 = s.next();
		String rs = "";
		for (int i = 0; i < s1.length() - 1; i++) {
			if (s1.charAt(i) == s1.charAt(i + 1)) {
				rs += s1.charAt(i) + "*";
			} else {
				rs += s1.charAt(i);
			}
		}
		s.close();
		System.out.println(rs + s1.charAt(s1.length() - 1));
	}

}
